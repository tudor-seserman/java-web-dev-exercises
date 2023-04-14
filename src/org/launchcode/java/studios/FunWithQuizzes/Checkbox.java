package org.launchcode.java.studios.FunWithQuizzes;

import java.util.List;

public class Checkbox extends Question implements Answer{
    public Checkbox(String question, List<String> answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(Object answerGiven) {
        return false;
    }
}
