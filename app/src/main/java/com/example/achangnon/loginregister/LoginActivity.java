package com.example.achangnon.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void registerButton(View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }


    public void login(View view) {
        EditText username = (EditText)findViewById(R.id.etUsername);
        EditText password = (EditText)findViewById(R.id.etPassword);

        Intent intent = new Intent(this, UserAreaActivity.class);
        startActivity(intent);

    }
}
