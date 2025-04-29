package com.sysdesign.lld.strategy;

public class StrategyExample {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();
        gateway.setPaymentStrategy(new CreditCard());
        gateway.makePayment(20);
        gateway.setPaymentStrategy(new UPI());
        gateway.makePayment(20);
    }
}
