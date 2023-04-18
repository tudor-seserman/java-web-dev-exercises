package org.launchcode.java.studios.FunWithQuizzes;

import java.util.HashMap;


public abstract class Question<T>{
    String question;
    HashMap<Integer, T> answerOptions;


    public Question(String question) {
        this.question = question;
        this.answerOptions = new HashMap<>();
    }

    public void printQuestion() {
        System.out.println(this.question);
        for(HashMap.Entry<Integer, T> answerOption: answerOptions.entrySet()){
            System.out.println(answerOption.getKey()+") "+answerOption.getValue());
        };
    }
    public Integer size(){
        return answerOptions.size();
    }

}