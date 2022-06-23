package com.example.cuetmecicalcentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        Button buttonThree = findViewById(R.id.button13);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent prescribeIntent = new Intent(getApplicationContext(), medicine.class);
                startActivity(prescribeIntent);
            }
        });
        Button buttonFour = findViewById(R.id.button14);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent prescribeIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(prescribeIntent);
            }
        });
    }
}