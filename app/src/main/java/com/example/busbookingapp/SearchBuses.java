package com.example.busbookingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SearchBuses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_buses);

        // Find Departure Spinner
        Spinner spinnerDeparture = findViewById(R.id.spinner_departure);

        // Define Departure Locations (example values)
        String[] departureLocations = {"Select Departure", "Colombo", "Galle", "Kagalle", "Kurunegala", "Jaffna","Anuradhapura","Kandy","Mathara"};
        ArrayAdapter<String> departureAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                departureLocations
        );
        departureAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDeparture.setAdapter(departureAdapter);

        // Set an OnItemSelectedListener for Departure Spinner
        spinnerDeparture.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedLocation = parent.getItemAtPosition(position).toString();
                if (!selectedLocation.equals("Select Departure")) {
                    Toast.makeText(SearchBuses.this, "Selected Departure: " + selectedLocation, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Find Destination Spinner
        Spinner spinnerDestination = findViewById(R.id.spinner_destination);

        // Define Destination Locations (example values)
        String[] destinationLocations = {"Select Destination", "Colombo", "Galle", "Kagalle", "Kurunegala", "Jaffna","Anuradhapura","Kandy","Mathara"};
        ArrayAdapter<String> destinationAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                destinationLocations
        );
        destinationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDestination.setAdapter(destinationAdapter);

        // Set an OnItemSelectedListener for Destination Spinner
        spinnerDestination.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedDestination = parent.getItemAtPosition(position).toString();
                if (!selectedDestination.equals("Select Destination")) {
                    Toast.makeText(SearchBuses.this, "Selected Destination: " + selectedDestination, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
