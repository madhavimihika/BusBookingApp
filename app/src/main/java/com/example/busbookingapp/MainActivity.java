package com.example.busbookingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the "Sign up" TextView
        TextView tvRegister = findViewById(R.id.tv_signup);

        // Set an OnClickListener
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the Registration Activity
                Intent intent = new Intent(MainActivity.this, Registration.class);
                startActivity(intent);
            }
        });

        // Find the username, password fields, and Sign In button
        EditText etUsername = findViewById(R.id.et_username);
        EditText etPassword = findViewById(R.id.et_password);
        Button btnSignIn = findViewById(R.id.btn_signin);

        // Set an OnClickListener for the Sign In button
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get input from username and password fields
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Check if username and password are valid (placeholder logic)
                if (username.equals("admin") && password.equals("1234")) {
                    // Successful login - navigate to HomeScreen
                    Intent intent = new Intent(MainActivity.this, HomeScreen.class);
                    startActivity(intent);
                    finish(); // Optionally close the login screen
                } else {
                    // Show error message
                    Toast.makeText(MainActivity.this, "Invalid username or password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
