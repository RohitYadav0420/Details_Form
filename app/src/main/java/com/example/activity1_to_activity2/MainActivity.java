package com.example.activity1_to_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView formName;
    EditText nameInput;
    EditText passwordInput;
    EditText emailInput;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formName= findViewById(R.id.formName);
        nameInput= findViewById(R.id.name);
        passwordInput= findViewById(R.id.password);
        emailInput= findViewById(R.id.email);
        registerBtn= findViewById(R.id.button);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String name= nameInput.getText().toString();
               String password= passwordInput.getText().toString();
               String email= emailInput.getText().toString();

               String msg= "Name: "+ name + "\n\nPassword: "+ password+ "\n\nEmail: "+ email;


                Intent intentMsg= new Intent(MainActivity.this, MainActivity2.class);
                intentMsg.putExtra("message", msg);
                startActivity(intentMsg);


            }
        });
    }
}