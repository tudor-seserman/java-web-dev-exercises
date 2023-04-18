package org.launchcode.java.studios.FunWithQuizzes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MultipleChoice extends Question<String> implements Answer<Integer>{
    List<Integer> answer;
    public MultipleChoice(String question, List<String> answers, String correctAnswer) {
        super(question);
        this.answer=new ArrayList<>();
        for(int i=0; i < answers.size(); i++){
            answerOptions.put(i+1,answers.get(i));
            if(correctAnswer.equals(answers.get(i)))answer.add(i+1);
        }
    }

    @Override
    public boolean checkAnswer(Integer answerGiven) {
        return answer.get(0) == answerGiven;
    }
}
