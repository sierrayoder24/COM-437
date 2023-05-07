package com.example.loginpage_ahoy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button move = findViewById(R.id.loginButton);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        move.setOnClickListener(view -> {
            if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                Intent intent =new Intent(MainActivity.this,Homepage.class);
                startActivity(intent);
            }
        });
    }
}