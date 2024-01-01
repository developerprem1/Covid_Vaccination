package com.prem.covidvaccination.Appointment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.prem.covidvaccination.Fragment.StatusFragment;
import com.prem.covidvaccination.R;

public class AppointmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);


        findViewById(R.id.cancel).setOnClickListener(v-> {
            startActivity(new Intent(AppointmentActivity.this, StatusFragment.class));
            finish();
        });

        findViewById(R.id.confirm).setOnClickListener(v-> {
            startActivity(new Intent(AppointmentActivity.this, AppointSuccActivity.class));
            finish();
        });
    }
}