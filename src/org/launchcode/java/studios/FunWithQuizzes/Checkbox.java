package org.launchcode.java.studios.FunWithQuizzes;

import java.util.List;

public class Checkbox extends Question implements Answer{
    public Checkbox(String question, List answers, List correctAnswer) {
        super(question, answers, correctAnswer);
    }

    @Override
    public boolean checkAnswer(Object answerGiven) {
        return answer.contains((String)answerGiven);    }
}
