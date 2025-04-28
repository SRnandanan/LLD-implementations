package com.sysdesign.lld.observer;

public class ObserverExample {
    public static void main(String[] args) {
        WeatherStation w = new WeatherStation();
        w.addDevice(new PhoneDevice());
        w.addDevice(new TabletDevice());
        w.setTempreature(40);
        w.setTempreature(33);
        w.setTempreature(12);
    }
}
