package com.example.aman.cook_o_pedia;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Recipe extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        ImageView recipe_image = (ImageView) findViewById(R.id.recipe_image);
        TextView recipe_details = (TextView) findViewById(R.id.recipe_details);
        TextView recipe_name = (TextView) findViewById(R.id.recipe_name);
        TextView ingredients = (TextView) findViewById(R.id.ingredients);
        Bundle input = getIntent().getExtras();
        SQLiteDatabase db = openOrCreateDatabase("mygroceries", MODE_PRIVATE, null);
        int rec = input.getInt("key");
        final Intent intent = new Intent(this, Nutrients.class);
        final Bundle output = new Bundle();
        output.putInt("key", rec);
        Button cooked = (Button) findViewById(R.id.cooked);
        Context context = getApplicationContext();
        final Toast toast = Toast.makeText(context, "GROCERY UPDATED", Toast.LENGTH_LONG);
        final Toast toast1 = Toast.makeText(context, "CANNOT COOK!!!", Toast.LENGTH_LONG);
        switch (rec) {
            case 1:
                recipe_details.setText(R.string.pastry_recipe);
                recipe_name.setText(R.string.pastry_title);
                ingredients.setText(R.string.pastry_ingredients);
                recipe_image.setImageResource(R.mipmap.pastry);
                Cursor a = db.rawQuery("select value from grocery where id=2 or id=9", null);
                a.moveToFirst();
                final float a1 = a.getFloat(0);
                a.moveToNext();
                final float a2 = a.getFloat(0);
                if (((double) a1) < 0.1d || ((double) a2) < 0.2d) {
                    cooked.setBackgroundColor(Color.RED);
                }
                cooked.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (((double) a1) < 0.1d || ((double) a2) < 0.2d) {
                            toast1.show();
                            return;
                        }
                        intent.putExtras(output);
                        toast.show();
                        Recipe.this.startActivity(intent);
                    }
                });
                return;
            case 2:
                recipe_details.setText(R.string.cheesecake_recipe);
                recipe_name.setText(R.string.cheesecake_title);
                ingredients.setText(R.string.cheesecake_ingredients);
                recipe_image.setImageResource(R.mipmap.cheesecake);
                Cursor b = db.rawQuery("select value from grocery where id=3 or id=4 or id=5", null);
                b.moveToFirst();
                final float b1 = b.getFloat(0);
                b.moveToNext();
                final float b2 = b.getFloat(0);
                b.moveToNext();
                final float b3 = b.getFloat(0);
                if (((double) b1) < 0.8d || ((double) b2) < 0.4d || ((double) b3) < 0.2d) {
                    cooked.setBackgroundColor(Color.RED);
                }

                cooked.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (((double) b1) < 0.8d || ((double) b2) < 0.4d || ((double) b3) < 0.2d) {
                            toast1.show();
                            return;
                        }
                        intent.putExtras(output);
                        toast.show();
                        Recipe.this.startActivity(intent);
                    }
                });
                return;
            case 3:
                recipe_details.setText(R.string.flatbread_recipe);
                recipe_name.setText(R.string.flatbread_title);
                ingredients.setText(R.string.flatbread_ingredients);
                recipe_image.setImageResource(R.mipmap.flatbread);
                Cursor c = db.rawQuery("select value from grocery where id=9", null);
                c.moveToFirst();
                final float c1 = c.getFloat(0);
                if (((double) c1) < 0.5d) {
                    cooked.setBackgroundColor(Color.RED);
                }
                cooked.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (((double) c1) < 0.5d) {
                            toast1.show();
                            return;
                        }
                        intent.putExtras(output);
                        toast.show();
                        Recipe.this.startActivity(intent);
                    }
                });
                return;
            case 4:
                recipe_details.setText(R.string.makhani_recipe);
                recipe_name.setText(R.string.makhani_title);
                ingredients.setText(R.string.makhani_ingredients);
                recipe_image.setImageResource(R.mipmap.makhani);
                Cursor d = db.rawQuery("select value from grocery where id=1 or id=2", null);
                d.moveToFirst();
                final float d1 = d.getFloat(0);
                d.moveToNext();
                final float d2 = d.getFloat(0);
                if (((double) d1) < 0.2d || ((double) d2) < 0.1d) {
                    cooked.setBackgroundColor(Color.RED);
                }
                cooked.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (((double) d1) < 0.2d || ((double) d2) < 0.1d) {
                            toast1.show();
                            return;
                        }
                        intent.putExtras(output);
                        toast.show();
                        Recipe.this.startActivity(intent);
                    }
                });
                return;
            case 5:
                recipe_details.setText(R.string.lassi_recipe);
                recipe_name.setText(R.string.lassi_title);
                ingredients.setText(R.string.lassi_ingredients);
                recipe_image.setImageResource(R.mipmap.lassi);
                cooked.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        intent.putExtras(output);
                        toast.show();
                        Recipe.this.startActivity(intent);
                    }
                });
                return;
            case 6:
                recipe_details.setText(R.string.rice_recipe);
                recipe_name.setText(R.string.rice_title);
                ingredients.setText(R.string.rice_ingredients);
                recipe_image.setImageResource(R.mipmap.rice);
                Cursor e = db.rawQuery("select value from grocery where id=6 or id=7", null);
                e.moveToFirst();
                final float e1 = e.getFloat(0);
                e.moveToNext();
                final float e2 = e.getFloat(0);
                if (((double) e1) < 0.1d || ((double) e2) < 0.5d) {
                    cooked.setBackgroundColor(Color.RED);
                }
                cooked.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (((double) e1) < 0.1d || ((double) e2) < 0.2d) {
                            toast1.show();
                            return;
                        }
                        intent.putExtras(output);
                        toast.show();
                        Recipe.this.startActivity(intent);
                    }
                });
                return;
            case 7:
                recipe_details.setText(R.string.soup_recipe);
                recipe_name.setText(R.string.soup_title);
                ingredients.setText(R.string.soup_ingredients);
                recipe_image.setImageResource(R.mipmap.soup);
                Cursor f = db.rawQuery("select value from grocery where id=6 or id=8", null);
                f.moveToFirst();
                final float f1 = f.getFloat(0);
                f.moveToNext();
                final float f2 = f.getFloat(0);
                if (((double) f1) < 0.05d || f2 < 1.0f) {
                    cooked.setBackgroundColor(Color.RED);
                }
                cooked.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (((double) f1) < 0.1d || ((double) f2) < 0.2d) {
                            toast1.show();
                            return;
                        }
                        intent.putExtras(output);
                        toast.show();
                        Recipe.this.startActivity(intent);
                    }
                });
                return;
            default:
                return;
        }
    }
}
