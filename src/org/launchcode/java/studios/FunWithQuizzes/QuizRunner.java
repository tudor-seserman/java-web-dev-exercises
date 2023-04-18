package org.launchcode.java.studios.FunWithQuizzes;

import java.util.*;

public class QuizRunner {
    public static void main(String[] args) {
        Question first= new TOrF(
                "Is this the first question?\nTrue or False",
                new ArrayList<>(Collections.singleton(true))
        );
        Question second = new MultipleChoice(
                "Is this the second question?\n" +
                        "a) Yes\n" +
                        "b) No\n" +
                        "c) This is the last question\n" +
                        "d) This is the third",
                new ArrayList<>(Collections.singleton("a"))
        );
        Question third = new Checkbox(
                "Is this the last question?\n" +
                        "a) Yes\n" +
                        "b) No\n" +
                        "c) This is the last question\n" +
                        "d) This is the third",
                new ArrayList<>(Arrays.asList("a", "c", "d"))
        );

        Quiz test=new Quiz(new ArrayList<>(Arrays.asList(first, second, third)));
        test.runQuiz();

    }
}
