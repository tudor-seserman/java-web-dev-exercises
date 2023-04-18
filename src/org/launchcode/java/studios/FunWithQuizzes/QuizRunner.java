package org.launchcode.java.studios.FunWithQuizzes;

import java.util.*;

public class QuizRunner {
    public static void main(String[] args) {
        Question first= new TOrF(
                "Is this the first question?",
                new ArrayList<>(Arrays.asList("True","False")),
                new ArrayList<>(Collections.singleton(true))
        );

        Question second = new MultipleChoice(
                "Is this the second question?",
                new ArrayList<>(Arrays.asList( "Yes", "No", "This is the last question", "This is the third")),
                new ArrayList<>(Collections.singleton("yes"))
                );

//        Question third = new Checkbox(
//                "Is this the last question?",
//                new ArrayList<>(Arrays.asList("Yes", "No", "This is the last question", "This is the third"),
//                new ArrayList<>(Arrays.asList("a", "c", "d")));

        Quiz test=new Quiz(new ArrayList<>(Arrays.asList(first, second)));
        test.runQuiz();

    }
}
