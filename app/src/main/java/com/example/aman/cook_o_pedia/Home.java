package com.example.aman.cook_o_pedia;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Home extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        SQLiteDatabase mygrocery = openOrCreateDatabase("mygroceries",MODE_PRIVATE, null);
        mygrocery.execSQL("create table if not exists grocery(id integer primary key,name varchar,value real)");
        mygrocery.execSQL("insert or ignore into grocery values(1,'lentil',0)");
        mygrocery.execSQL("insert or ignore into grocery values(2,'butter',0)");
        mygrocery.execSQL("insert or ignore into grocery values(3,'chocospread',0)");
        mygrocery.execSQL("insert or ignore into grocery values(4,'cheese',0)");
        mygrocery.execSQL("insert or ignore into grocery values(5,'cornflakes',0)");
        mygrocery.execSQL("insert or ignore into grocery values(6,'onion',0)");
        mygrocery.execSQL("insert or ignore into grocery values(7,'rice',0)");
        mygrocery.execSQL("insert or ignore into grocery values(8,'tomato',0)");
        mygrocery.execSQL("insert or ignore into grocery values(9,'flour',0)");
        final Intent about_page = new Intent(this, About.class);
        ((Button) findViewById(R.id.about)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Home.this.startActivity(about_page);
            }
        });
        Button cook = (Button) findViewById(R.id.cook);
        final Intent intent = new Intent(this, Cook.class);
        cook.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Home.this.startActivity(intent);
            }
        });
        final Intent grocery = new Intent(this, Groceries.class);
        ((Button) findViewById(R.id.groceries)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Home.this.startActivity(grocery);
            }
        });
    }
}
