package com.example.cuetmecicalcentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stafffeature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stafffeature);
        Button buttonThree = findViewById(R.id.button12);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent prescribeIntent = new Intent(getApplicationContext(), medicine.class);
                startActivity(prescribeIntent);
            }
        });
        Button buttonFive = findViewById(R.id.button4);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent prescribeIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(prescribeIntent);
            }
        });
    }
}