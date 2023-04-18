package org.launchcode.java.studios.FunWithQuizzes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Question<T>{
    String question;
    HashMap<Integer, String> answerOptions;
    List<T> answer;

    public Question(String question, List<String> answers, List<T> correctAnswer) {
        this.question = question;
        answerOptions = new HashMap<>();
        for(int i=0; i < answers.size(); i++){
            answerOptions.put(i+1,answers.get(i));
        }
        this.answer = correctAnswer;
    }

    public void printQuestion() {
        System.out.println(this.question);
        for(HashMap.Entry<Integer, String> answerOption: answerOptions.entrySet()){
            System.out.println(answerOption.getKey()+") "+answerOption.getValue());
        };
    }

    public HashMap<Integer, String> getAnswerOptions() {
        return answerOptions;
    }
}