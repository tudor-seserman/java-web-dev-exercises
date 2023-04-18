package org.launchcode.java.studios.FunWithQuizzes;

import java.util.List;

public class TOrF extends Question implements Answer{
    public TOrF(String question, List answers, List correctAnswer) {
        super(question, answers, correctAnswer);
    }

    @Override
    public boolean checkAnswer(Object answerGiven) {
        return this.answer.get(0).equals((Boolean)answerGiven);
    }
}
