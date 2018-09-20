/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canwebefriends;
import java.util.Scanner;

/**
 *
 * @author swade
 */
public class CanWeBeFriends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yarn, craft, read, support, think, argue, score;  //define variables
        System.out.println("Can we be friends?");
        System.out.println("Do you like to play with yarn? (1=yes, 0=no)");
        Scanner keyboardReader = new Scanner(System.in);  //read keyboard input
        yarn = keyboardReader.nextInt();
        System.out.println("Do you like to craft? (1=yes, 0=no)");
        craft = keyboardReader.nextInt();
        System.out.println("Do you read everyday? (1=yes, 0=no)");
        read = keyboardReader.nextInt();
        System.out.println("Could you support yourself if you had to? (1=yes, 0=no)");
        support = keyboardReader.nextInt();
        System.out.println("Can you admit to yourself other peoples opinions might be valid? (1=yes, 0=no)");
        think = keyboardReader.nextInt();
        System.out.println("Can you discuss news and politics without getting into an argument? (1=yes, 0=no)");
        argue = keyboardReader.nextInt();
        score = 0;
        if(yarn == 1){
            score = score + 10;
        }else if(craft == 1){
                score = score + 5;
        }//you get yarn points or craft points but not both
        if(read == 1){
            score = score + 20;            
        }//points for reading
        if(support == 1){
            score = score + 10;
        }else{
            score = score - 5;
        }//add points for ability to support yourself but subtract if you can't
        if(think == 1){
            score = score + 20;
        }else{
            score = score - 100;
        }//you are not the only one with a valid opinion
        if(argue == 1){
            score = score + 20;
        }else{
            score = score - 5;
        }//discussion is good; fighting is not
        System.out.println("Final Score: " + score);
        if(score>50){
            System.out.println("Shall we play a game?");
        }else{
            System.out.println("I have to wash my hair.");
        }//final output
    }//close main
}//close class
