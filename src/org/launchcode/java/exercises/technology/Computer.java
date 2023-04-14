package org.launchcode.java.exercises.technology;

public class Computer extends AbstractEntity{

    private int ram;
    private String processor;
    private String os;

    public Computer(int ram, String processor, String os) {
        super();
        this.ram = ram;
        this.processor = processor;
        this.os = os;
    }

    public void upgradeRam(int moreRam){
        this.ram += moreRam;
    }

    public void upgradeOS(String newOs){
        this.os = newOs;
    }
}
