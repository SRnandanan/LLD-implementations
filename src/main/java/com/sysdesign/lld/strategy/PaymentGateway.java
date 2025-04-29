package com.sysdesign.lld.strategy;

public class PaymentGateway {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amount) {
        this.paymentStrategy.pay(amount);
    }

}
