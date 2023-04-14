package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    ArrayList<Question> quizQuestions;
    Scanner answerGiven;

    public Quiz(Question quizQuestions) {
        this.quizQuestions=new ArrayList<>();
        this.quizQuestions.add(quizQuestions);
    }

    public Quiz(List<Question> quizQuestions) {
        this.quizQuestions=new ArrayList<>(quizQuestions);
    }

    public void setQuizQuestions(Question quizQuestions) {
        this.quizQuestions.add(quizQuestions);
    }

    public void runQuiz(){
        System.out.println("Welcome to my quiz!");
        Scanner answerGiven = new Scanner(System.in);
        int score=0;
            for(Question question:quizQuestions){
                System.out.println(question.getQuestion());
                if(question.checkAnswer(answerGiven.next())) score++;
            }
            answerGiven.close();
        System.out.println("Your score is "+score);
    }
}
