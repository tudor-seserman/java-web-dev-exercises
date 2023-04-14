package org.launchcode.java.exercises.technology;

public class Laptop extends Computer{

    double batteryLife;
    public Laptop(int ram, String processor, String os, double batteryLife) {
        super(ram, processor, os);
        this.batteryLife = batteryLife;
    }

    public void plugIn(){
        this.batteryLife = 100;
    }

    public String getBatteryLife() {
        return String.valueOf(batteryLife)+"%";
    }

}
