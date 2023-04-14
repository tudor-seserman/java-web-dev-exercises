package org.launchcode.java.studios.FunWithQuizzes;

import java.util.HashMap;
import java.util.List;

public abstract class Question<T>{
    String question;
    HashMap<Integer, String> options;
    List<T> answer;

    public Question(String question, List<T> answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

}