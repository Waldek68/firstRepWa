package com.example.nastia.depositapp;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class DepositFragment extends Fragment {
    private DepositLogic dL= new DepositLogic();

    public DepositFragment() {
        // Required empty public constructor
    }

    public static DepositFragment newInstance(String param1, String param2) {
        DepositFragment fragment = new DepositFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_deposit, container, false);
        final EditText amountField = (EditText) v.findViewById(R.id.amountText);
        final EditText percentField = (EditText) v.findViewById(R.id.percText);
        final EditText yearsField = (EditText) v.findViewById(R.id.yearsText);
        final EditText resultField = (EditText) v.findViewById(R.id.resultText);
        final Button obliczBut= (Button) v.findViewById(R.id.butDepCount);
        obliczBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int amount = Integer.parseInt(amountField.getText().toString());
                    int percent = Integer.parseInt(percentField.getText().toString());
                    int years = Integer.parseInt(yearsField.getText().toString());
                    //int result = Integer.parseInt(resultField.getText().toString());
                    int result = dL.depositCalculation(amount, percent, years);
                    resultField.setText("your sum is:"+ result);
                }catch (NumberFormatException e){
                    resultField.setText("zle dane");
                }

            }
        });
        return v;

    }


}
