package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        Cat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());
    }
}
