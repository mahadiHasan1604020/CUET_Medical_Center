package com.example.cuetmecicalcentre;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Signup extends AppCompatActivity {
        EditText inputName,inputStudentID,inputEmail,inputPassword;

    ProgressDialog progressDialog;
    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        inputName=findViewById(R.id.name);
        inputStudentID=findViewById(R.id.stid);
        inputEmail=findViewById(R.id.mail);
        inputPassword=findViewById(R.id.pass);
        progressDialog=new ProgressDialog (this);
        mAuth=FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();


        Button buttonSign = findViewById(R.id.signup);
        buttonSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PerforAuth();

            }
        });

    }

    private void PerforAuth() {
        String name=inputName.getText().toString();
        String stid=inputStudentID.getText().toString();
        String email=inputEmail.getText().toString();
        String password=inputPassword.getText().toString();




        if(email.isEmpty())
        {
            inputEmail.setError("Enter correct email");
        }
        else if(password.isEmpty())
        {
            inputPassword.setError("Enter correct password");
        }
        else
        {
            progressDialog.setMessage("Please wait while signup...");
            progressDialog.setTitle("Sign up");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();


            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful())
                    {
                        progressDialog.dismiss();
                        sendUsertoNextActivity();
                        Toast.makeText(Signup.this, "Registration Successful",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(Signup.this, ""+task.getException(),Toast.LENGTH_SHORT).show();
                    }
                }
            });



        }
    }

    private void sendUsertoNextActivity() {
        Intent Intent=new Intent(Signup.this,Login.class);
        Intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(Intent);
    }
}