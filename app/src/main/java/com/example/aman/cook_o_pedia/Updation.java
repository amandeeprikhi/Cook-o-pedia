package com.example.aman.cook_o_pedia;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Updation extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updation);
        final SQLiteDatabase db = openOrCreateDatabase("mygroceries", MODE_PRIVATE, null);
        final EditText grocery_value = (EditText) findViewById(R.id.grocery_value);
        final EditText values = (EditText) findViewById(R.id.values);
        ((Button) findViewById(R.id.update)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String g = grocery_value.getText().toString();
                Float v = Float.valueOf(values.getText().toString());
                if (g.equals("black lentils")) {
                    Cursor a= db.rawQuery("select value from grocery where id=1", null);
                    a.moveToFirst();
                    db.execSQL("update grocery set value=" + (v.floatValue() + a.getFloat(0)) + " where id=1");
                }
                if (g.equals("butter")) {
                    Cursor b= db.rawQuery("select value from grocery where id=2", null);
                    b.moveToFirst();
                    db.execSQL("update grocery set value=" + (v.floatValue() + b.getFloat(0)) + " where id=2");
                }
                if (g.equals("chocolate hazelnut spread")) {
                    Cursor c = db.rawQuery("select value from grocery where id=3", null);
                    c.moveToFirst();
                    db.execSQL("update grocery set value=" + (v.floatValue() + c.getFloat(0)) + " where id=3");
                }
                if (g.equals("cream cheese")) {
                    Cursor d = db.rawQuery("select value from grocery where id=4", null);
                    d.moveToFirst();
                    db.execSQL("update grocery set value=" + (v.floatValue() + d.getFloat(0)) + " where id=4");
                }
                if (g.equals("honey nut cornflakes")) {
                    Cursor e = db.rawQuery("select value from grocery where id=5", null);
                    e.moveToFirst();
                    db.execSQL("update grocery set value=" + (v.floatValue() + e.getFloat(0)) + " where id=5");
                }
                if (g.equals("onion")) {
                    Cursor f = db.rawQuery("select value from grocery where id=6", null);
                    f.moveToFirst();
                    db.execSQL("update grocery set value=" + (v.floatValue() + f.getFloat(0)) + " where id=6");
                }
                if (g.equals("rice")) {
                    Cursor g1 = db.rawQuery("select value from grocery where id=7", null);
                    g1.moveToFirst();
                    db.execSQL("update grocery set value=" + (v.floatValue() + g1.getFloat(0)) + " where id=7");
                }
                if (g.equals("tomato")) {
                    Cursor h= db.rawQuery("select value from grocery where id=8", null);
                    h.moveToFirst();
                    db.execSQL("update grocery set value=" + (v.floatValue() + h.getFloat(0)) + " where id=8");
                }
                if (g.equals("white flour")) {
                    Cursor i = db.rawQuery("select value from grocery where id=9", null);
                    i.moveToFirst();
                    db.execSQL("update grocery set value=" + (v.floatValue() + i.getFloat(0)) + " where id=9");
                }
                grocery_value.setText("");
                values.setText("");
                Toast toast = Toast.makeText(getApplicationContext(), "GROCERY UPDATED", Toast.LENGTH_LONG);
            }
        });
    }
}
