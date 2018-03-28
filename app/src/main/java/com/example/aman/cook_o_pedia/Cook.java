package com.example.aman.cook_o_pedia;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Cook extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook);
        Cursor cr = openOrCreateDatabase("mygroceries", MODE_PRIVATE, null).rawQuery("select value from grocery", null);
        cr.moveToFirst();
        final float a = cr.getFloat(0);
        cr.moveToNext();
        final float b = cr.getFloat(0);
        cr.moveToNext();
        final float c = cr.getFloat(0);
        cr.moveToNext();
        final float d = cr.getFloat(0);
        cr.moveToNext();
        final float e = cr.getFloat(0);
        cr.moveToNext();
        final float f = cr.getFloat(0);
        cr.moveToNext();
        final float g = cr.getFloat(0);
        cr.moveToNext();
        final float h = cr.getFloat(0);
        cr.moveToNext();
        final float i = cr.getFloat(0);
        final Toast toast = Toast.makeText(getApplicationContext(), "Cannot COOK", Toast.LENGTH_LONG);
        final Bundle bundle = new Bundle();
        final Intent intent = new Intent(this, Recipe.class);
        Button soup = (Button) findViewById(R.id.soup_button);
        soup.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (h < 1.0f || ((double) f) < 0.05d) {
                    bundle.putInt("key", 7);
                    intent.putExtras(bundle);
                    Cook.this.startActivity(intent);
                    toast.show();
                    return;
                }
                bundle.putInt("key", 7);
                intent.putExtras(bundle);
                Cook.this.startActivity(intent);
            }
        });
        Button pastry = (Button) findViewById(R.id.pastry_button);
        pastry.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (((double) i) < 0.2d || ((double) b) < 0.1d) {
                    bundle.putInt("key", 1);
                    intent.putExtras(bundle);
                    Cook.this.startActivity(intent);
                    toast.show();
                    return;
                }
                bundle.putInt("key", 1);
                intent.putExtras(bundle);
                Cook.this.startActivity(intent);
            }
        });
        Button cheesecake = (Button) findViewById(R.id.cheesecake_button);
        cheesecake.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (((double) c) < 0.8d || ((double) d) < 0.4d || ((double) e) < 0.2d) {
                    bundle.putInt("key", 2);
                    intent.putExtras(bundle);
                    Cook.this.startActivity(intent);
                    toast.show();
                    return;
                }
                bundle.putInt("key", 2);
                intent.putExtras(bundle);
                Cook.this.startActivity(intent);
            }
        });
        Button flatbread = (Button) findViewById(R.id.flatbread_button);
        flatbread.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (((double) i) < 0.5d) {
                    bundle.putInt("key", 3);
                    intent.putExtras(bundle);
                    Cook.this.startActivity(intent);
                    toast.show();
                    return;
                }
                bundle.putInt("key", 3);
                intent.putExtras(bundle);
                Cook.this.startActivity(intent);
            }
        });
        Button makhani = (Button) findViewById(R.id.makhani_button);
        makhani.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (((double) a) < 0.2d || ((double) b) < 0.1d) {
                    bundle.putInt("key", 4);
                    intent.putExtras(bundle);
                    Cook.this.startActivity(intent);
                    toast.show();
                    return;
                }
                bundle.putInt("key", 4);
                intent.putExtras(bundle);
                Cook.this.startActivity(intent);
            }
        });
        ((Button) findViewById(R.id.lassi_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                bundle.putInt("key", 5);
                intent.putExtras(bundle);
                Cook.this.startActivity(intent);
            }
        });
        Button rice = (Button) findViewById(R.id.rice_button);
        rice.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (((double) f) < 0.1d || ((double) g) < 0.5d) {
                    bundle.putInt("key", 6);
                    intent.putExtras(bundle);
                    Cook.this.startActivity(intent);
                    toast.show();
                    return;
                }
                bundle.putInt("key", 6);
                intent.putExtras(bundle);
                Cook.this.startActivity(intent);
            }
        });
        if (((double) i) < 0.2d || ((double) b) < 0.1d) {
            pastry.setBackgroundColor(Color.RED);
        }
        if (((double) c) < 0.8d || ((double) d) < 0.4d || ((double) e) < 0.2d) {
            cheesecake.setBackgroundColor(Color.RED);
        }
        if (((double) i) < 0.5d) {
            flatbread.setBackgroundColor(Color.RED);
        }
        if (((double) a) < 0.2d || ((double) b) < 0.1d) {
            makhani.setBackgroundColor(Color.RED);
        }
        if (((double) f) < 0.1d || ((double) g) < 0.5d) {
            rice.setBackgroundColor(Color.RED);
        }
        if (h < 1.0f || ((double) f) < 0.05d) {
            soup.setBackgroundColor(Color.RED);
        }
    }
}
