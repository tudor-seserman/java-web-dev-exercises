package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.List;

public class Checkbox extends Question<String> implements Answer<List<Integer>>{
    List<Integer> answer;
    public Checkbox(String question, List<String> answers, List<String> correctAnswer) {
        super(question);
        this.answer=new ArrayList<>();
        for(int i=0; i < answers.size(); i++){
            answerOptions.put(i+1,answers.get(i));
            if(correctAnswer.contains(answers.get(i)))answer.add(i+1);
        }
    }

    @Override
    public boolean checkAnswer(List<Integer> answerGiven) {
        return answer.equals(answerGiven);    }
}
