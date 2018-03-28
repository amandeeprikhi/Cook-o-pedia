package com.example.aman.cook_o_pedia;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Nutrients extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrients);
        SQLiteDatabase db = openOrCreateDatabase("mygroceries", 0, null);
        TextView nutri_values = (TextView) findViewById(R.id.nutri_values);
        ImageView nutri_image = (ImageView) findViewById(R.id.nutri_image);
        Cursor cr;
        float a1;
        float c2;
        switch (getIntent().getExtras().getInt("key")) {
            case 1:
                nutri_values.setText(R.string.null_nutri);
                nutri_image.setImageResource(R.mipmap.pastry);
                cr = db.rawQuery("select value from grocery where id=2 or id=9", null);
                cr.moveToFirst();
                a1 = cr.getFloat(0);
                cr.moveToNext();
                c2 = cr.getFloat(0) - 22.4f;
                db.execSQL("update grocery set value=" + (a1 - 44.8f) + " where id=2");
                db.execSQL("update grocery set value=" + c2 + " where id=9");
                return;
            case 2:
                nutri_values.setText(R.string.cheesecake_nutri);
                nutri_image.setImageResource(R.mipmap.cheesecake);
                cr = db.rawQuery("select value from grocery where id=3 or id=4 or id=5", null);
                cr.moveToFirst();
                a1 = cr.getFloat(0);
                cr.moveToNext();
                float a2 = cr.getFloat(0);
                cr.moveToNext();
                c2 = a2 - 11.2f;
                float c3 = cr.getFloat(0) - 22.4f;
                db.execSQL("update grocery set value=" + (a1 - 5.6f) + " where id=3");
                db.execSQL("update grocery set value=" + c2 + " where id=4");
                db.execSQL("update grocery set value=" + c3 + " where id=5");
                return;
            case 3:
                nutri_values.setText(R.string.flatbread_nutri);
                nutri_image.setImageResource(R.mipmap.flatbread);
                cr = db.rawQuery("select value from grocery where id=9", null);
                cr.moveToFirst();
                db.execSQL("update grocery set value=" + (cr.getFloat(0) - 8.0f) + " where id=9");
                return;
            case 4:
                nutri_values.setText(R.string.makhani_nutri);
                nutri_image.setImageResource(R.mipmap.makhani);
                cr = db.rawQuery("select value from grocery where id=1 or id=2", null);
                cr.moveToFirst();
                a1 = cr.getFloat(0);
                cr.moveToNext();
                c2 = cr.getFloat(0) - 44.8f;
                db.execSQL("update grocery set value=" + (a1 - 22.4f) + " where id=1");
                db.execSQL("update grocery set value=" + c2 + " where id=2");
                return;
            case 5:
                nutri_values.setText(R.string.null_nutri);
                nutri_image.setImageResource(R.mipmap.lassi);
                return;
            case 6:
                nutri_values.setText(R.string.null_nutri);
                nutri_image.setImageResource(R.mipmap.rice);
                cr = db.rawQuery("select value from grocery where id=6 or id=7", null);
                cr.moveToFirst();
                a1 = cr.getFloat(0);
                cr.moveToNext();
                c2 = cr.getFloat(0) - 8.0f;
                db.execSQL("update grocery set value=" + (a1 - 44.8f) + " where id=6");
                db.execSQL("update grocery set value=" + c2 + " where id=7");
                return;
            case 7:
                nutri_values.setText(R.string.soup_nutri);
                nutri_image.setImageResource(R.mipmap.soup);
                cr = db.rawQuery("select value from grocery where id=6 or id=8", null);
                cr.moveToFirst();
                a1 = cr.getFloat(0);
                cr.moveToNext();
                c2 = cr.getFloat(0) - 4.0f;
                db.execSQL("update grocery set value=" + (a1 - 89.6f) + " where id=6");
                db.execSQL("update grocery set value=" + c2 + " where id=8");
                return;
            default:
                return;
        }
    }
}
