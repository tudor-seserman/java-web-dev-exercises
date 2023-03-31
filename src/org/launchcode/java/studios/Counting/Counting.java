package org.launchcode.java.studios.Counting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Counting {

    public static void main(String[] args) throws IOException{

//        String text="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

//        Scanner scanner= new Scanner(System.in);
//        System.out.print("Put a line in: ");
//        String text = scanner.nextLine();
//        scanner.close();

        Path input = Path.of("/Users/tudorseserman/Desktop/readmeeee.rtf");
        String text = Files.readString(input);

        HashMap<Character, Integer> letters = new HashMap<>();
        for(char character: text.toCharArray()){
            if(Character.isLetter(character)) {
                character = Character.toLowerCase(character);
                letters.putIfAbsent(character, 0);
                letters.put(character, letters.get(character) + 1);
            }
//            if(letters.containsKey(character)){
//                letters.put(character, letters.get(character)+1);
//            }else{
//                letters.put(character,1);
//            }

        }
        for(Map.Entry<Character, Integer> characterCount: letters.entrySet()) {
            System.out.println(characterCount.getKey() +":"+ characterCount.getValue());
        }
    }
}

