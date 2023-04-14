package org.launchcode.java.exercises.technology;

public abstract class AbstractEntity {
    private static int idSetter;
    private int id;
    AbstractEntity(){
        id = idSetter;
        idSetter++;
    }

    public int getId() {
        return id;
    }
}
