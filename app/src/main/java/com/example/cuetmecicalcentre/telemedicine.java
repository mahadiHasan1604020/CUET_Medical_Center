package com.example.cuetmecicalcentre;

import androidx.appcompat.app.AppCompatActivity;
import java.net.URI;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telemedicine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telemedicine);
        Button buttonOne = findViewById(R.id.button11);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                gotoUrl("https://zoom.us/j/95508800165?pwd=ZTdLNjBwUk5iQmgzUEtxeGVkdjV6QT09");

            }
        });
        Button buttonTwo = findViewById(R.id.button7);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent prescribeIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(prescribeIntent);

            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}