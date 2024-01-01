package com.prem.covidvaccination.Admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.prem.covidvaccination.Admin.Fragment.SuccessfulFragment;
import com.prem.covidvaccination.Admin.Fragment.UserDetailsFragment;
import com.prem.covidvaccination.Admin.Fragment.VaccineRequesstFragment;
import com.prem.covidvaccination.Fragment.StatusFragment;
import com.prem.covidvaccination.Fragment.UpdatesFragment;
import com.prem.covidvaccination.Fragment.VaccinationFragment;
import com.prem.covidvaccination.R;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.whatsappContainer, new UserDetailsFragment()).commit();


        findViewById(R.id.details).setOnClickListener(v-> {
            fm.beginTransaction().replace(R.id.whatsappContainer, new UserDetailsFragment()).commit();
        });
        findViewById(R.id.request).setOnClickListener(v-> {
            fm.beginTransaction().replace(R.id.whatsappContainer, new VaccineRequesstFragment()).commit();
        });
        findViewById(R.id.success).setOnClickListener(v-> {
            fm.beginTransaction().replace(R.id.whatsappContainer, new SuccessfulFragment()).commit();
        });

    }
}