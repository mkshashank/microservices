package com.wipro.java.ms.solid;

class ElectricSwitch {
    private Switchable device;

    public ElectricSwitch(Switchable device) {
        this.device = device;
    }

    public void press() {
        System.out.println("Switching device");
        device.turnOn();
    }
}