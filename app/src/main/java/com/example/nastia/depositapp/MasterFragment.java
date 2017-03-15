package com.example.nastia.depositapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MasterFragment extends Fragment {
   private Button depositBut;
    private Button calculatorBut;
    private MainActivity activity;

    public MasterFragment() {
        // Required empty public constructor
    }


    public static MasterFragment newInstance(String param1, String param2) {
        MasterFragment fragment = new MasterFragment();

        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_master, container, false);
        activity=(MainActivity) getActivity();
        depositBut=(Button) v.findViewById(R.id.lokataMaster);
        depositBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showDeposit();

            }
        });
        calculatorBut=(Button)v.findViewById(R.id.calculMaster);
        calculatorBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showCalculator();
            }
        });

        return v;
    }


}
