/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Scanner;

/**
 *
 * @author swade
 */
public class YarnLand {
    public static void main(String[] args){
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("How many balls of yarn do you want to enter?");
        int numBalls = userInputScanner.nextInt();
        Yarn[] stash = new Yarn[numBalls];
        for(int i = 0; i<stash.length; i++){
            System.out.println("Let's add ball " + (i+1));
            stash[i] = addYarn(); 
        }//end for
        
        printArrayContents(stash, numBalls);
                
    }//end main
    
    public static Yarn addYarn(){
        Scanner userInputScanner = new Scanner(System.in);
        Yarn tempName = new Yarn();
        System.out.println("What would you like to call this ball of yarn?");
        tempName.ballName = userInputScanner.next();
        System.out.println("What brand is this yarn?");
        tempName.brand = userInputScanner.next();
        System.out.println("What name is this yarn?");
        tempName.name = userInputScanner.next();
        System.out.println("What color is this yarn?");
        tempName.color = userInputScanner.next();
        System.out.println("What type of fiber is this yarn?");
        tempName.material = userInputScanner.next();
        System.out.println("What weight class is this yarn?");
        int weight = userInputScanner.nextInt();
        tempName.setWeight(weight);
        System.out.println("How many yards do you have of this yarn?");
        double length = userInputScanner.nextDouble();
        tempName.setLength(length);
        return tempName;
    }//close method addYarn
    
    public static void printArrayContents(Yarn[] arrayInsideMethod, int reps){
        System.out.println(" ");
        for(int i=0; i<reps; i++){
            System.out.println("Ball name " + (i+1) + " = " + arrayInsideMethod[i].ballName);
            System.out.println("Brand " + (i+1) + " = " + arrayInsideMethod[i].brand);
            System.out.println("Name " + (i+1) + " = " + arrayInsideMethod[i].name);
            System.out.println("Color " + (i+1) + " = " + arrayInsideMethod[i].color);
            System.out.println("Material " + (i+1) + " = " + arrayInsideMethod[i].material);
            System.out.println("Weight class " + (i+1) + " = " + arrayInsideMethod[i].getWeight());
            System.out.println("Yards " + (i+1) + " = " + arrayInsideMethod[i].getLength());
        }//end for loop
    }//end printArrayContents2
}//end class YarnLand
