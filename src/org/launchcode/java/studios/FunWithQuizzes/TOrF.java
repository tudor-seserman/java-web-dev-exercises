package org.launchcode.java.studios.FunWithQuizzes;

import java.util.List;

public class TOrF extends Question implements Answer<Boolean>{
    Boolean answer;
    public TOrF(String question, boolean correctAnswer) {
        super(question);
        this.answer=correctAnswer;
    }

    @Override
    public boolean checkAnswer(Boolean answerGiven) {
        return this.answer.equals(answerGiven);
    }
}
