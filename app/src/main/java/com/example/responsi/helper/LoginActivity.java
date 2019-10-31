package com.example.projectmi03.helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectmi03.MainActivity;
import com.example.projectmi03.R;



public class LoginActivity extends AppCompatActivity {

    Button nBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nBtnLogin= findViewById(R.id.btn_login);

        nBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPref.getInstance(LoginActivity.this).setLogin(true);

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            }
        });
            }
}
