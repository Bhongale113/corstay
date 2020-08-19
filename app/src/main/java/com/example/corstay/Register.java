package com.example.corstay;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.rengwuxian.materialedittext.MaterialEditText;

public class Register extends AppCompatActivity {
    protected EditText Email,password,cpassword;
    protected Button singUp;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Email=(MaterialEditText)findViewById(R.id.Remail);
        password=(MaterialEditText)findViewById(R.id.Rpassword);
        cpassword=(MaterialEditText)findViewById(R.id.Cpassword);

    }
}
