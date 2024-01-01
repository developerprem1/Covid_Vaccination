package com.prem.covidvaccination.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.prem.covidvaccination.R;

import java.util.ArrayList;
import java.util.List;

public class UpdatesFragment extends Fragment implements AdapterView.OnItemSelectedListener{

    String[] courses = { "Uttar Pradesh", "Bihar",
            "Delhi", "Panjab",
            "Assam", "Mau" };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_updates, container, false);

        Spinner spino = view.findViewById(R.id.coursesspinner);
        spino.setOnItemSelectedListener(this);

        ArrayAdapter ad
                = new ArrayAdapter(
                getContext(),
                android.R.layout.simple_spinner_item,
                courses);

        // set simple layout resource file
        // for each item of spinner
        ad.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);

        // Set the ArrayAdapter (ad) data on the
        // Spinner which binds data to spinner
        spino.setAdapter(ad);

        List<SlideModel> imageList = new ArrayList<>();

        ImageSlider imageSlider = view.findViewById(R.id.image_slider);

        imageList.add(new SlideModel(R.drawable.vacc1,  ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.vacc2,  ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.vacc3,  ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.vacc4,  ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.vacc5,  ScaleTypes.FIT));

        imageSlider.setImageList(imageList);

        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}