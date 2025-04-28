package com.sysdesign.lld.observer;

public class TabletDevice implements Device{
    @Override
    public void notifyTempreature(int temp) {
        System.out.println("The temperature sent from station to tablet is: "+temp);
    }
}
