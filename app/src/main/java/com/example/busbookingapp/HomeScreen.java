package com.example.busbookingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        // Find the buttons
        Button btnSearchBuses = findViewById(R.id.btn_search_buses);
        Button btnViewBookings = findViewById(R.id.btn_view_bookings);
        Button btnAccount = findViewById(R.id.btn_account);
        Button btnLogout = findViewById(R.id.btn_logout);

        // Search Buses button
        btnSearchBuses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the SearchBusesActivity
                Intent intent = new Intent(HomeScreen.this, SearchBuses.class);
                startActivity(intent);
                Toast.makeText(HomeScreen.this, "Navigating to Search Buses...", Toast.LENGTH_SHORT).show();
            }
        });

        // View Bookings button
        btnViewBookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeScreen.this, "View bookings feature coming soon!", Toast.LENGTH_SHORT).show();
            }
        });

        // My Account button
        btnAccount.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Navigate to the MyAccountActivity
                        Intent intent = new Intent(HomeScreen.this, MyAccount.class);
                        startActivity(intent);
                Toast.makeText(HomeScreen.this, "My account feature coming soon!", Toast.LENGTH_SHORT).show();
            }
        });

        // Logout button
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to MainActivity (Login screen)
                Intent intent = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close the Home Screen
            }
        });
        Button btnViewBooking = findViewById(R.id.btn_view_bookings);

        // Set an OnClickListener for the "View My Bookings" button
        btnViewBookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the ViewMyBookingsActivity
                Intent intent = new Intent(HomeScreen.this, ViewMyBooking.class);
                startActivity(intent);
            }
        });



    }
}
