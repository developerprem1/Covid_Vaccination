package com.prem.covidvaccination;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hbb20.CountryCodePicker;

public class LoginPhoneNumberActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_phone_number);


        findViewById(R.id.send_otp_btn).setOnClickListener(v-> {
            startActivity(new Intent(LoginPhoneNumberActivity.this, LoginOtpActivity.class));
            finish();
        });

    }
}