package com.example.aman.cook_o_pedia;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Groceries extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries);
        TextView values = (TextView) findViewById(R.id.values);
        Cursor c = openOrCreateDatabase("mygroceries",MODE_PRIVATE, null).rawQuery("select * from grocery", null);
        c.moveToFirst();
        values.setText(c.getFloat(2) + "\n");
        c.moveToNext();
        for (int i = 0; i <= 7; i++) {
            values.append(c.getFloat(2) + "\n");
            c.moveToNext();
        }
        final Intent update = new Intent(this, Updation.class);
        ((Button) findViewById(R.id.updation)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Groceries.this.startActivity(update);
            }
        });
    }
}
