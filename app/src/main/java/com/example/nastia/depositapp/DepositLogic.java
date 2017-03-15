package com.example.nastia.depositapp;

/**
 * Created by Nastia on 2017-01-13.
 */

public class DepositLogic {
public int depositCalculation( int amount, int percent, int years){
    return (int)(amount*Math.pow(1+percent/100.0,years));
}
}
