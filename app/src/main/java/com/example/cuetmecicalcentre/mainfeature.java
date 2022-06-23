package com.example.cuetmecicalcentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainfeature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainfeature);
        Button buttonOne = findViewById(R.id.button5);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent appointmentIntent = new Intent(getApplicationContext(), telemedicine.class);
                startActivity(appointmentIntent);
            }
        });
        Button buttonTwo = findViewById(R.id.button3);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent ambulanceIntent = new Intent(getApplicationContext(), CallAmbulance.class);
                startActivity(ambulanceIntent);
            }
        });
        Button buttonThree = findViewById(R.id.button4);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent prescribeIntent = new Intent(getApplicationContext(), prescription.class);
                startActivity(prescribeIntent);
            }
        });
        Button buttonFour = findViewById(R.id.button8);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent prescribeIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(prescribeIntent);
            }
        });



    }
}