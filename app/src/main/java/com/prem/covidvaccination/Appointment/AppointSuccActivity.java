package com.prem.covidvaccination.Appointment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.prem.covidvaccination.Fragment.StatusFragment;
import com.prem.covidvaccination.R;

public class AppointSuccActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appoint_succ);

        findViewById(R.id.home).setOnClickListener(v-> {
            startActivity(new Intent(AppointSuccActivity.this, StatusFragment.class));
            finish();
        });
        findViewById(R.id.cancel).setOnClickListener(v-> {
            startActivity(new Intent(AppointSuccActivity.this, AppointmentActivity.class));
            finish();
        });
    }
}