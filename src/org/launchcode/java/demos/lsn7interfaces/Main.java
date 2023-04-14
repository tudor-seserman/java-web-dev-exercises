package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
//        for (Flavor flavor:flavors) System.out.println(flavor.getName());
//        flavors.sort(comparator);
//        System.out.println();
//        for (Flavor flavor:flavors) System.out.println(flavor.getName());

        for (Cone cone:cones) System.out.println(cone.getName());
        System.out.println();
        cones.sort(new ConeComparator());
        for (Cone cone:cones) System.out.println(cone.getName());

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
