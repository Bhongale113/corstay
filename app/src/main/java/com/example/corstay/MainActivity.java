package com.example.corstay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public EditText user,password;
    public Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=findViewById(R.id.USER);
        password=findViewById(R.id.PASSWORD);
        loginButton=findViewById(R.id.LOGIN);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log();
            }

        });
    }

    public void log(){
        Intent intent = new Intent(this, Hotel.class);
        startActivity(intent);
    }

}