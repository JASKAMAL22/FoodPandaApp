package com.example.foodpanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login , signup;
    TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();

        login = (Button) findViewById(R.id.btnlogin);
        signup = (Button) findViewById(R.id.btnsignup);

        skip = (TextView) findViewById(R.id.skp);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show();
                Intent int1 = new Intent(MainActivity.this,SignIn_Activity.class);
                startActivity(int1);

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Register has been clicked", Toast.LENGTH_SHORT).show();
                Intent int2 = new Intent(MainActivity.this,SignUp_Activity.class);
                startActivity(int2);

            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this,Menu_Activity.class);
                startActivity(int3);
            }
        });

    }
}
