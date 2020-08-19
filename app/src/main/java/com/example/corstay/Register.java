package com.example.corstay;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.rengwuxian.materialedittext.MaterialEditText;


public class Register extends AppCompatActivity {
    protected EditText Email,password,cpassword;
    protected Button singUp;
    protected FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Email=(MaterialEditText)findViewById(R.id.Remail);
        password=(MaterialEditText)findViewById(R.id.Rpassword);
        cpassword=(MaterialEditText)findViewById(R.id.Cpassword);
        singUp=findViewById(R.id.Confirm);
        firebaseAuth=FirebaseAuth.getInstance();

        singUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname=Email.getText().toString();            //user name
                String pass=password.getText().toString();          //password
                String cpass=cpassword.getText().toString();        //confirmed password

                if(pass.equals(cpass)) {
                    firebaseAuth.createUserWithEmailAndPassword(uname, pass)
                            .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                        Toast.makeText(Register.this, "Registration complete", Toast.LENGTH_SHORT).show();

                                    }
                                    else {
                                        Toast.makeText(Register.this, "Authentication failed", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }

        });
    }
}
