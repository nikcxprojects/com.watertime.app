package com.watertime.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;



public class PrivacyPolicy extends AppCompatActivity {

    ImageView policy, accept, decline;


    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        accept = findViewById(R.id.imageView8);
        policy = findViewById(R.id.imageView5);
        decline = findViewById(R.id.imageView9);

        String data = getIntent().getStringExtra("polisy");
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PrivacyPolicy.this, Policy.class);
                myIntent.putExtra("polisy", data);
                startActivity(myIntent);
            }
        });

        accept.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PrivacyPolicy.this, MainActivity2.class);
                startActivity(myIntent);
                finish();
            }
        });

        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}