package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    Button register,login;
    TextInputEditText email,pass;
    String res_email;
    String res_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register=findViewById(R.id.register);
        login=findViewById(R.id.login);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             res_email=email.getEditableText().toString();
             res_pass=pass.getEditableText().toString();
             if(res_email.isEmpty()||res_pass.isEmpty()){
                 Toast.makeText(LoginActivity.this, "fill the form ", Toast.LENGTH_SHORT).show();
             }
             else{
                 Intent i=new Intent(LoginActivity.this,MainActivity.class);
                 startActivity(i);
             }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "name:devianushan@gmail.com\n password:password", Toast.LENGTH_SHORT).show();
            }
        });


    }
}