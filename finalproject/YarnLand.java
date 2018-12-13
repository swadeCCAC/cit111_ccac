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

    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("How many balls of yarn do you want to enter?");
        int numBalls = userInputScanner.nextInt();
        Yarn[] stash = new Yarn[numBalls];
        //the for loop will run through once for each element in the users stash
        for (int i = 0; i < stash.length; i++) {
            System.out.println(" ");
            System.out.println("*** Let's add ball " + (i + 1) + "***");
            stash[i] = addYarn();
        }//end for
        
        //print out users stash before joining balls of yarn
        printArrayContents(stash, numBalls);
        
        System.out.println(" ");
        System.out.println("What is the first ball you would like to join? 1-" + numBalls);
        int b1 = userInputScanner.nextInt();
        System.out.println("What is the second ball you would like to join? 1-" + numBalls);
        int b2 = userInputScanner.nextInt();
        //verify the user is not trying to join a ball of yarn to itself
        if (b1 != b2) {
            joinYarn(stash, (b1 - 1), (b2 - 1));
        } else {
            System.out.println("You must select different balls of yarn to join them.");
        }

        //print out users stash now that yarn has been joined into a bigger ball
        printArrayContents(stash, numBalls);

    }//end main

    //a method to add balls of yarn to your stash. It collects the information about
    //the ball of yarn from the user and returns it to the calling line.
    public static Yarn addYarn() {
        Scanner userInputScanner = new Scanner(System.in);
        Yarn ball = new Yarn();
        System.out.println("What would you like to call this ball of yarn?");
        ball.ballName = userInputScanner.nextLine();
        System.out.println("What brand is this yarn?");
        ball.brand = userInputScanner.nextLine();
        System.out.println("What name is this yarn?");
        ball.name = userInputScanner.nextLine();
        System.out.println("What color is this yarn?");
        ball.color = userInputScanner.nextLine();
        System.out.println("What type of fiber is this yarn?");
        ball.material = userInputScanner.nextLine();
        System.out.println("What weight class is this yarn? 0-7:");
        int weight = userInputScanner.nextInt();
        ball.setWeight(weight);
        System.out.println("How many yards do you have of this yarn?");
        double length = userInputScanner.nextDouble();
        ball.setLength(length);
        return ball;
    }//close method addYarn

    //a method to print out the contents of an array of type Yarn
    public static void printArrayContents(Yarn[] arrayInsideMethod, int reps) {
        System.out.println(" ");
        //the for loop will repeat once for each element in the array presuming 
        //reps is = to the numbr of elements in the array
        for (int i = 0; i < reps; i++) {
            System.out.println(" ");
            System.out.println("*** Ball " + (i + 1) + " ***");
            System.out.println("Ball name " + (i + 1) + " = " + arrayInsideMethod[i].ballName);
            System.out.println("Brand " + (i + 1) + " = " + arrayInsideMethod[i].brand);
            System.out.println("Name " + (i + 1) + " = " + arrayInsideMethod[i].name);
            System.out.println("Color " + (i + 1) + " = " + arrayInsideMethod[i].color);
            System.out.println("Material " + (i + 1) + " = " + arrayInsideMethod[i].material);
            System.out.println("Weight class " + (i + 1) + " = " + arrayInsideMethod[i].getWeight());
            System.out.println("Yards " + (i + 1) + " = " + arrayInsideMethod[i].getLength());
        }//end for loop
    }//end printArrayContents

    //this method will join 2 balls of yarn in your array if they are the same weight class.
    //the new ball will be stored in the element previously holding ball1 and the element
    //for ball2 will be set to null
    public static void joinYarn(Yarn[] arrayInMethod, int ball1, int ball2) {
        System.out.println("Let's verify the 2 balls of yarn can be joined");

        //test to make sure weight classes match
        if (arrayInMethod[ball1].getWeight() == arrayInMethod[ball2].getWeight()) {
            System.out.println("Joining yarn...");
            
            //concatinate ballNames for new ball of yarn
            String bn = arrayInMethod[ball1].ballName + " " + arrayInMethod[ball2].ballName;
            //test to see if the ball names are the same. If they are keep the name the
            //same; if not use the concatinated name as the new name
            if (!(arrayInMethod[ball1].ballName.equalsIgnoreCase(arrayInMethod[ball2].ballName))) {
                arrayInMethod[ball1].ballName = bn;
            }
            //since ball2 no longer exists change the ballName to null
            arrayInMethod[ball2].ballName = "";
            
            //treat each String the same as ballName
            String br = arrayInMethod[ball1].brand + " " + arrayInMethod[ball2].brand;
            if (!(arrayInMethod[ball1].brand.equalsIgnoreCase(arrayInMethod[ball2].brand))) {
                arrayInMethod[ball1].brand = br;
            }
            arrayInMethod[ball2].brand = "";

            String n = arrayInMethod[ball1].name + " " + arrayInMethod[ball2].name;
            if (!(arrayInMethod[ball1].name.equalsIgnoreCase(arrayInMethod[ball2].name))) {
                arrayInMethod[ball1].name = n;
            }
            arrayInMethod[ball2].name = "";

            String m = arrayInMethod[ball1].material + " " + arrayInMethod[ball2].material;
            if (!(arrayInMethod[ball1].material.equalsIgnoreCase(arrayInMethod[ball2].material))) {
                arrayInMethod[ball1].material = m;
            }
            arrayInMethod[ball2].material = "";

            String c = arrayInMethod[ball1].color + " " + arrayInMethod[ball2].color;
            if (!(arrayInMethod[ball1].color.equalsIgnoreCase(arrayInMethod[ball2].color))) {
                arrayInMethod[ball1].color = c;
            }
            arrayInMethod[ball2].color = "";

            //since the 2 balls of yarn are in the same weight class you do not need to
            //change ball1. ball2 is set to -1 as there isn't a ball2 anymore.
            arrayInMethod[ball2].setWeight(-1);

            //the length of the new ball of yarn will be the combined length of the 2 balls
            //minus 2 inches for the knot used to join them together. Ball 2 will have 0 
            //length as it is now part of ball 1
            double l = arrayInMethod[ball1].getLength() + arrayInMethod[ball2].getLength() - 0.06;
            arrayInMethod[ball1].setLength(l);
            arrayInMethod[ball2].setLength(0);
        } else {
            //if the balls of yarn are different weights they can't be joined
            System.out.println("I'm sorry these 2 balls of yarn are different weights and cannot be joined.");
        }
    }//end joinYarn
}//end class YarnLand
