package org.launchcode.java.studios.FunWithQuizzes;

import java.util.*;

public class QuizRunner {
    public static void main(String[] args) {
        Question first= new TOrF(
                "True/False: Is this the first question?",
                true
        );

        Question second = new MultipleChoice(
                "Is this the second question?",
                new ArrayList<>(Arrays.asList( "Yes", "No", "This is the last question", "This is the third")),
                "Yes"
                );

        Question third = new Checkbox(
                "Is this the last question? Please select all possible answers.",
                new ArrayList<>(Arrays.asList("Yes", "No", "This is the last question", "This is the third")),
                new ArrayList<>(Arrays.asList("Yes", "This is the last question", "This is the third")));

        Quiz test=new Quiz(new ArrayList<>(Arrays.asList(first, second, third)));
        test.runQuiz();

    }
}
