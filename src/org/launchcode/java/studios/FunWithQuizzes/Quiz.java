package org.launchcode.java.studios.FunWithQuizzes;

import java.util.*;
import java.util.regex.Pattern;

public class Quiz <T>{

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
        Scanner scanner = new Scanner(System.in);
        int score=0;
            for(Question question:quizQuestions){
                System.out.println(question.getQuestion());
                boolean validation = true;
                if(question instanceof TOrF) {
                    while(validation) {
                        try {
                            if (((TOrF) question).checkAnswer(scanner.nextBoolean())) score++;
                            validation = false;
                        }catch (InputMismatchException e){
                            System.out.println("Please enter true or false");
                            scanner.next();
                        }
                    }
                } else if (question instanceof MultipleChoice) {
                    if(((MultipleChoice) question).checkAnswer(scanner.next())) score++;
                }else{
                    if(((Checkbox) question).checkAnswer(scanner.next()) )score++;
                }

            }
            scanner.close();
        System.out.println("Your score is "+score);
    }
}
