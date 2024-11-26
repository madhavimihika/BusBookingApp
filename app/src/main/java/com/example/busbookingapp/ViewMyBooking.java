package com.example.busbookingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewMyBooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_my_booking);

        // Find ListView and Button
        ListView lvBookings = findViewById(R.id.lv_bookings);
        Button btnRefresh = findViewById(R.id.btn_view_bookings);

        // Sample booking data (you can later replace this with dynamic data from a database or API)
        ArrayList<String> bookings = new ArrayList<>();
        bookings.add("Booking 1: New York to Los Angeles on 12/12/2024");
        bookings.add("Booking 2: Chicago to Houston on 15/12/2024");
        bookings.add("Booking 3: Phoenix to Boston on 18/12/2024");

        // Create an ArrayAdapter to bind the bookings data to the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, bookings);
        lvBookings.setAdapter(adapter);

        // Set a click listener on the "Refresh" button
        btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle refresh logic here (e.g., fetch updated bookings from server)
                Toast.makeText(ViewMyBooking.this, "Refreshing Bookings...", Toast.LENGTH_SHORT).show();
                // For now, just simulate refreshing
                bookings.add("Booking 4: Dallas to Seattle on 20/12/2024");
                adapter.notifyDataSetChanged();
            }
        });
    }
}
