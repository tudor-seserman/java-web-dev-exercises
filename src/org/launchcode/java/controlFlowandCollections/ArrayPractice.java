package org.launchcode.java.controlFlowandCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayPractice {

    public static int arraySum(ArrayList<Integer> toSum){
        int total =0;
        for(int d: toSum){
            total+=d;
        }
        return total;
    }

    public static void fiveLetters(ArrayList<String> sArray){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many letters per word are you looking for?");
        int input = scanner.nextInt();

        for(String word: sArray){

            if(word.length() == input){
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
//        int[] newArray={1, 1, 2, 3, 5, 8};

//        for(int d: newArray){
//            if(d%2 != 0) {
//                System.out.println(d);
//            }
//        }
//
//        String[] newStringArray= ("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.").split("\\.");
//        System.out.println(Arrays.toString(newStringArray));

        ArrayList<Integer> newArrayTwo= new ArrayList<>();
        int[] arrayTwo ={1, 1, 2, 3, 5, 8, 7, 8, 9, 10};
        for(int i: arrayTwo){
            newArrayTwo.add(i);
        }
        String[] wordArray={"Write", "a", "static", "method", "print", "out", "each", "word", "in", "exactly"};
        ArrayList<String> newWordArray=new ArrayList<>();
        Collections.addAll(newWordArray, wordArray);
        System.out.println(arraySum(newArrayTwo));
        fiveLetters(newWordArray);


    }
}
