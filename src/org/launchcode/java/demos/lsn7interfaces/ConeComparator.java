package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        if(o1.getCost() == o2.getCost()) return 0;
        return (o1.getCost() > o2.getCost())? 1:-1;
    }
}
