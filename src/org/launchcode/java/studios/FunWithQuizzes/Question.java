package org.launchcode.java.studios.FunWithQuizzes;

import java.util.List;

public class Question<String> {
    String question;
    List<String> answer;

    public Question(String question, List<String> answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(String answerGiven){
        if(this.answer.contains(answerGiven)){
            return true;
        }
        return false;
    }
}
