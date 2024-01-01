package com.prem.covidvaccination.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prem.covidvaccination.Appointment.AppointmentActivity;
import com.prem.covidvaccination.Appointment.DownloadActivity;
import com.prem.covidvaccination.R;

public class StatusFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_status, container, false);

        view.findViewById(R.id.bookNow).setOnClickListener(v-> {
            startActivity(new Intent(getContext(), AppointmentActivity.class));
        });
        view.findViewById(R.id.certificate).setOnClickListener(v-> {
            startActivity(new Intent(getContext(), DownloadActivity.class));
        });


        return view;
    }
}