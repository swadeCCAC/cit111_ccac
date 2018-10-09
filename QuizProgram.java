/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author swade
 */
public class QuizProgram {
    public static void main(String[] args){
        final int MATH_ANSWER = 20;
        int loopCount = 0;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("**Math Quiz**");
        while(loopCount < 3){
        System.out.println("What is the value of 6*3+4/2?");
        int userAnswer = inputScanner.nextInt();
        if(userAnswer == MATH_ANSWER){
            System.out.println("Correct. Nice work");
            System.out.println("Solution: 6*3+4/2 = 18+2 = 20");
            loopCount = 5;
        }else if(userAnswer > MATH_ANSWER){
            System.out.println("Sorry, your answer is too high");
            loopCount = loopCount + 1;
        }else{
            System.out.println("Sorry, your answer is too low");
            loopCount = loopCount + 1;
        }//end if/else
        }//end while
        if(loopCount < 4){
            System.out.println("I'm sorry you are out of tries.");
            System.out.println("Solution: 6*3+4/2 = 18+2 = 20");
        }//end if
    }//end main
}//end class
