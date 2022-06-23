package com.example.cuetmecicalcentre;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MakePrescription extends AppCompatActivity {
    EditText Inputmed1,Inputmed2,Inputmed3,Inputmed4;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_prescription);
        Inputmed1=findViewById(R.id.med1);
        Inputmed2=findViewById(R.id.med2);
        Inputmed3=findViewById(R.id.med3);
        Inputmed4=findViewById(R.id.med4);




        Button buttonSign = findViewById(R.id.submit);
        buttonSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String med1=Inputmed1.getText().toString();
                String med2=Inputmed2.getText().toString();
                String med3=Inputmed3.getText().toString();
                String med4=Inputmed4.getText().toString();

                FirebaseDatabase rootnode=FirebaseDatabase.getInstance();
            DatabaseReference reference= rootnode.getReference("prescription");

            UserHelperClass addNewuser=new UserHelperClass(med1, med2, med3, med4);
            reference.setValue(addNewuser);
            sendUsertoNextActivity();
                Toast.makeText(MakePrescription.this, "Registration Successful",Toast.LENGTH_SHORT).show();


            }
        });
    }

    private void sendUsertoNextActivity() {
        Intent Intent=new Intent(MakePrescription.this,checkappointment.class);
        Intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(Intent);
    }
}