package com.sysdesign.lld.strategy;

public class CreditCard implements PaymentStrategy{

    private final static int serviceCharge = 6;
    @Override
    public void pay(int amount) {
        System.out.println("Payment made via credit card! Amount paid is: "+amount+serviceCharge);
    }
}
