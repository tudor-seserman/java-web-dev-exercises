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
                question.printQuestion();
                boolean validation = true;
                while(validation) {
                    if (question instanceof TOrF) {
                        try {
                            if (((TOrF) question).checkAnswer(scanner.nextBoolean())) score++;
                            validation = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter true or false");
                            scanner.next();
                        }
                    } else if (question instanceof MultipleChoice) {
                        try {
                            if (((MultipleChoice) question).checkAnswer(scanner.nextInt())) score++;
                            validation = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Please type in the number of the correct answer");
                            scanner.next();
                        }
                    } else {
                        System.out.println("Enter 'x' to finish");
                        try {
                            List<Integer> answersToEvaluate= new ArrayList<>();
                            for(int i=0; i < question.size() ; i++) {
                                if(scanner.hasNextInt()){
                                    answersToEvaluate.add(scanner.nextInt());
                                }else if(scanner.next().equals("x")){
                                    i=question.size();
                                }else{
                                    throw new InputMismatchException();
                                }
                            }

                            if (((Checkbox) question).checkAnswer(answersToEvaluate)) score++;;
                            validation = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Please type in the number of the correct answer or 'x' to finish");
                            scanner.next();
                        }
                    }
                }
            }
            scanner.close();
        System.out.println("Your score is "+score);
    }
}
