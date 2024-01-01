package com.prem.covidvaccination.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.prem.covidvaccination.LoginPhoneNumberActivity;
import com.prem.covidvaccination.R;

public class AdminLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        findViewById(R.id.admin).setOnClickListener(v-> {
            startActivity(new Intent(AdminLoginActivity.this, AdminActivity.class));
        });
        findViewById(R.id.user).setOnClickListener(v-> {
            startActivity(new Intent(AdminLoginActivity.this, LoginPhoneNumberActivity.class));
        });
    }
}