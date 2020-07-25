package com.example.foodpanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu_Activity extends AppCompatActivity {


    ImageView drinks, dessert, food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getSupportActionBar().hide();

        drinks = (ImageView) findViewById(R.id.drinky);
        dessert = (ImageView) findViewById(R.id.desserty);
        food = (ImageView) findViewById(R.id.foody);

        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Menu_Activity.this,drinksmenu.class);
                startActivity(int1);
            }
        });

        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Menu_Activity.this,dessertmenu.class);
                startActivity(int2);
            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(Menu_Activity.this,foodmenu.class);
                startActivity(int3);
            }
        });

    }
}
