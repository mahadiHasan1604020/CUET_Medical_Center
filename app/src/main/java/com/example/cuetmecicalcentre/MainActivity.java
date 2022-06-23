package com.example.cuetmecicalcentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOne = findViewById(R.id.button2);
        Button buttonTwo = findViewById(R.id.button);
        Button buttonThree = findViewById(R.id.button3);
        Button buttonFour = findViewById(R.id.button4);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent loginIntent = new Intent(getApplicationContext(), Login.class);
                startActivity(loginIntent);
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Thanks for staying with us!!");
                Intent signupIntent = new Intent(getApplicationContext(), Signup.class);
                startActivity(signupIntent);
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Thanks for staying with us!!");
                Intent loginIntent = new Intent(getApplicationContext(), logindoctor.class);
                startActivity(loginIntent);
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Thanks for staying with us!!");
                Intent loginIntent = new Intent(getApplicationContext(), loginstaff.class);
                startActivity(loginIntent);
            }
        });
    }


}