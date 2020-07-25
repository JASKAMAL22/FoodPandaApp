package com.example.foodpanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignIn_Activity extends AppCompatActivity {
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().setTitle("Sign in");

        signin = findViewById(R.id.btnsignin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn_Activity.this, "Welcome!!!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SignIn_Activity.this,Menu_Activity.class);
                startActivity(intent);
            }
        });
    }
}
