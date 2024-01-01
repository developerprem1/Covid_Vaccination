package com.prem.covidvaccination;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LoginOtpActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_otp);

        findViewById(R.id.login_next_btn).setOnClickListener(v-> {
            startActivity(new Intent(LoginOtpActivity.this, LoginUserNameActivity.class));
            finish();
        });

    }
}