package com.example.thegrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText e, p;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        e = findViewById(R.id.user);
        p = findViewById(R.id.pass);
        b = findViewById(R.id.button);

        Login();
    }

    public void Login() {

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e.getText().toString().equals("admin")) {
                    Toast.makeText(LoginPage.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(LoginPage.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}