package org.launchcode.java.studios.FunWithQuizzes;

import java.util.*;

public class QuizRunner {
    public static void main(String[] args) {
        Question first= new Question(
                "Is this the first question?\nTrue or False",
                new ArrayList<>(Collections.singleton("True"))
        );
        Question second = new Question(
                "Is this the second question?\n" +
                        "a) Yes\n" +
                        "b) No\n" +
                        "c) This is the last question\n" +
                        "d) This is the third",
                new ArrayList<>(Collections.singleton("a"))
        );
        Question third = new Question(
                "Is this the last question?\n" +
                        "a) Yes\n" +
                        "b) No\n" +
                        "c) This is the last question\n" +
                        "d) This is the third",
                new ArrayList<>(Arrays.asList("a", "b", "c"))
        );


//        ArrayList<Question> stuff = new ArrayList<>();
//        stuff.add(first);
//        stuff.add(second);
//        stuff.add(third);
//        Quiz test=new Quiz(stuff);
        Quiz test=new Quiz(new ArrayList<>(Arrays.asList(first, second, third)));
        test.runQuiz();

    }
}
