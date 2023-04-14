package org.launchcode.java.studios.FunWithQuizzes;

import java.util.List;

public class MultipleChoice extends Question implements Answer{
    public MultipleChoice(String question, List<String> answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(Object answerGiven) {
        return answer.contains((String)answerGiven);
    }
}
