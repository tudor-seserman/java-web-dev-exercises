package org.launchcode.java.studios.FunWithQuizzes;


import java.util.List;

public class MultipleChoice extends Question implements Answer{
    public MultipleChoice(String question, List answers, List correctAnswer) {
        super(question, answers, correctAnswer);
    }

    @Override
    public boolean checkAnswer(Object answerGiven) {

        return (answer.get(0)).equals(((String)answerGiven).trim().toLowerCase());
    }
}
