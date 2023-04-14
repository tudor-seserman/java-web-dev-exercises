package org.launchcode.java.exercises.controlFlowandCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String student;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.println("Student: ");
            student = input.nextLine();

            if (!student.equals("")) {
                System.out.println("Student ID: ");
                int id = input.nextInt();
                students.put(id, student);

                input.nextLine();
            }
        } while(!student.equals(""));
            System.out.println("\nClass roster:");

            for (Map.Entry<Integer, String> currentStudent : students.entrySet()) {
                System.out.println(currentStudent.getKey() + " (" + currentStudent.getValue() + ")");
            }

        }

    }


