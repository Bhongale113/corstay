package com.example.corstay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Hotel extends AppCompatActivity{
    private Button aswad,shankar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        aswad=findViewById(R.id.ASWAD);
        shankar=findViewById(R.id.SHANKAR);

        aswad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Aswad.class));
            }
        });

        shankar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Shankar.class));
            }
        });

    }
}

