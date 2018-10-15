/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author swade
 */
public class MysteryDoors {
    public static void main(String[] args){
         Scanner userScanner = new Scanner(System.in);
         
         System.out.println("****** Pick a door ******");
         System.out.println("Options:");
         System.out.println("1 - This door has the silhouette of a lady");
         System.out.println("2 - This door has the silhouette of a tiger");
         System.out.println("3 - This door has the silhouette of a guillotine");
         System.out.println("What door do you choose to open?:");
         int switchControl = userScanner.nextInt();//read in the users pick
         
         switch(switchControl){
            case 1:
                System.out.println("How many tries would you like?");
                int trys = userScanner.nextInt();
                quiz(trys);
                break;
            case 2:
                password();
                break;
            case 3:
                printStatement();
                break;
            default:
                System.out.println("The guard shoots you for failing to pick a door.");
        }//end switch
    }//end main
    
    //this method determines  if you can be friends with the lady behind the door
    public static void quiz(int numLoops){
        final int MATH_ANSWER = 20;
        int loopCount = 0;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("**To win the lady's friendship you must prove your math skills**");
        while(loopCount < numLoops){//the user will be given the number of trys they asked for
        System.out.println("What is the value of 6*3+4/2?");
        int userAnswer = inputScanner.nextInt();//reads in the users answer
        if(userAnswer == MATH_ANSWER){//if the answer is correct
            System.out.println("Correct. The lady is happy to have another friend.");
            System.out.println("Solution: 6*3+4/2 = 18+2 = 20");
            loopCount = 5;
        }else if(userAnswer > MATH_ANSWER){//if the answer is too high
            System.out.println("The lady thinks you look nice. She gives you another try.");
            loopCount = loopCount + 1;
        }else{//if the answer is too low
            System.out.println("She is unsure but agrees to another try.");
            loopCount = loopCount + 1;
        }//end if/else
        }//end while
        if(loopCount < 4){//once all the tries are used and the user has not answered oorrectly
            System.out.println("I'm sorry the lady only accepts smart friends.");
            System.out.println("(she is kind of a snob that way)");
        }//end if
    }//end quiz
    
    //this method determines if you are enough of a predator to pass the tiger.
    public static void password(){
        int remainingAttempts = 3;
        int correctPassword = 8675309;//a predator's password
        int password = 0;
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("**The tiger is hungry, can you pass her test?**");
        while(remainingAttempts > 0){
            System.out.println("Please enter your 7-digit password:");
            password = userInputScanner.nextInt();
            if (password == correctPassword){
                System.out.println("Like recognizes like. You may safely enter.");
                remainingAttempts = -1;
            }else {
                remainingAttempts = remainingAttempts - 1;
                System.out.println("Jenny (the tiger) licks her lips. You have " + remainingAttempts + " attempts left.");
            }//end if/else
        }//end while
        if (remainingAttempts == 0){
        System.out.println("The tiger eats you.");
        }//end if
    }//end password
    
    //this method lets you know the prize you won
    public static void printStatement(){
        System.out.println("Behind this door is the love of your life.");
        System.out.println("Only the brave win their hearts desire.");
    }//end printStatement
}//end class MysteryDoors
