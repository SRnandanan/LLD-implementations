package com.sysdesign.lld.observer;

public class PhoneDevice  implements  Device{

    @Override
    public void notifyTempreature(int temp) {
        System.out.println("The temperature sent from station to phone is: "+ temp);
    }
}
