package com.sysdesign.lld.strategy;

public class UPI implements PaymentStrategy{

    private final static int serviceCharge = 4;

    @Override
    public void pay(int amount) {

        System.out.println("Payment made via UPI! Amount paid is: "+ amount+serviceCharge);
    }
}
