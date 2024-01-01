package com.prem.covidvaccination;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class LoginUserNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user_name);

        findViewById(R.id.let_mein_btn).setOnClickListener(v-> {
            startActivity(new Intent(LoginUserNameActivity.this, MainActivity.class));
            finish();
        });

    }
}