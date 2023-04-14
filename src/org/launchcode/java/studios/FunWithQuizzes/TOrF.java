package org.launchcode.java.studios.FunWithQuizzes;

import java.util.List;

public class TOrF extends Question{
    public TOrF(String question, List<String> answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answerGiven){
        if(this.answer.contains(answerGiven)){
            return true;
        }
        return false;
    }

}
