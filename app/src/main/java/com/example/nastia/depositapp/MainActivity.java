package com.example.nastia.depositapp;


import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDeposit() {
        FragmentTransaction transaction= getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameFormFragments, new DepositFragment());
        transaction.commit();
    }
    public void showCalculator() {
        FragmentTransaction transaction= getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameFormFragments, new CalculatorFragment());
        transaction.commit();
    }


}
