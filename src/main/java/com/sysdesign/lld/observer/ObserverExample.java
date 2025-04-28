package com.sysdesign.lld.observer;

public class ObserverExample {
    public static void main(String[] args) {
        WeatherStation w = new WeatherStation();
        w.addDevice(new PhoneDevice());
        w.addDevice(new TabletDevice());
        w.setTemperature(40);
        w.setTemperature(33);
        w.setTemperature(12);
    }
}
