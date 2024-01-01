package com.prem.covidvaccination;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.prem.covidvaccination.Fragment.StatusFragment;
import com.prem.covidvaccination.Fragment.UpdatesFragment;
import com.prem.covidvaccination.Fragment.VaccinationFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.whatsappContainer, new StatusFragment()).commit();


        findViewById(R.id.status).setOnClickListener(v-> {
            fm.beginTransaction().replace(R.id.whatsappContainer, new StatusFragment()).commit();
        });
        findViewById(R.id.vaccinantion).setOnClickListener(v-> {
            fm.beginTransaction().replace(R.id.whatsappContainer, new VaccinationFragment()).commit();
        });
        findViewById(R.id.updates).setOnClickListener(v-> {
            fm.beginTransaction().replace(R.id.whatsappContainer, new UpdatesFragment()).commit();
        });
    }
}