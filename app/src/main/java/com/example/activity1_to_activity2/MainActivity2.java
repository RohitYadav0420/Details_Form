package com.example.activity1_to_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView msgDetails;

    ImageView button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        msgDetails= findViewById(R.id.msgOutput);

        button= findViewById(R.id.btnShare);

        String msg= getIntent().getStringExtra("message");

        msgDetails.setText(msg);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent msgShareIntent= new Intent();
                msgShareIntent.setAction(Intent.ACTION_SEND);
                msgShareIntent.setType("text/plain");
                msgShareIntent.putExtra(Intent.EXTRA_TEXT, msg);
                startActivity(Intent.createChooser(msgShareIntent, null));
            }
        });


    }
}