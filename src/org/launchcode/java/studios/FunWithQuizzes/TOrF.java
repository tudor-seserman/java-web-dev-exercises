package org.launchcode.java.studios.FunWithQuizzes;

import java.util.List;

public class TOrF extends Question implements Answer{
    public TOrF(String question, List<Boolean> answer) {
        super(question, answer);
    }


    @Override
    public boolean checkAnswer(Object answerGiven) {
        return this.answer.get(0).equals((Boolean)answerGiven);
    }
}
