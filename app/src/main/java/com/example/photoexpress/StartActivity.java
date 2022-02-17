package com.example.photoexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class StartActivity extends AppCompatActivity {


    private ImageButton button;
    private ImageButton button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        button = findViewById(R.id.button);
        button2 = findViewById(R.id.imageButton2);
        Intent myIntent = new Intent(StartActivity.this, MainActivity.class);
        Intent myIntent2 = new Intent(StartActivity.this, ImageSelect.class);

        button.setOnClickListener(v -> {
            startActivity(myIntent);
        });
        button2.setOnClickListener(v -> {
            startActivity(myIntent2);
        });





    }
}