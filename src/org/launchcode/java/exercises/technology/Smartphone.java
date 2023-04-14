package org.launchcode.java.exercises.technology;

public class Smartphone extends Computer{
    double weight;

    public Smartphone(int ram, String processor, String os, double weight) {
        super(ram, processor, os);
        this.weight = weight;
    }

    public void addCover(){
        this.weight+=.25;
    }
}
