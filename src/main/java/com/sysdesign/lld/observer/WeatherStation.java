package com.sysdesign.lld.observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Station{

    private List<Device> deviceList;
    private int temp;

    public WeatherStation(){
        this.deviceList = new ArrayList<>();
    }
    @Override
    public void notifyDevices() {
        System.out.println("Notifying all devices");
        for(Device d: deviceList) {
            d.notifyTempreature(temp);
        }
    }

    @Override
    public void addDevice(Device d) {
        this.deviceList.add(d);
    }

    public void setTempreature(int temp){
        System.out.println("The temperature is: "+temp);
        this.temp = temp;
        notifyDevices();
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<Device> deviceList) {
        this.deviceList = deviceList;
    }
}
