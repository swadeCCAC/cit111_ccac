/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author swade
 */
public class KennywoodRideTracker {
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    final static int MIN_HEIGHT_THRILL = 36;
    final static int MIN_HEIGHT_THEME = 24;
    
    public static void main(String[] args){
        Scanner userScanner = new Scanner(System.in);
        printRideStats();
        System.out.println("Welcome to the Black Widow. How many people are in your group?:");
        int numGroup = userScanner.nextInt();
        System.out.println("What is the average height of your group?:");
        int heightGroup = userScanner.nextInt();
        rideBlackWidow(numGroup, heightGroup);
        printRideStats();
        System.out.println("Welcome to the Merry-Go-Round. How many people are in your group?:");
        int numGroup2 = userScanner.nextInt();
        System.out.println("What is the average height of your group?:");
        int heightGroup2 = userScanner.nextInt();
        rideMerryGoRound(numGroup2, heightGroup2);
        printRideStats();
        System.out.println("Welcome to the Black Widow. How many people are in your group?:");
        int numGroup3 = userScanner.nextInt();
        System.out.println("What is the average height of your group?:");
        int heightGroup3 = userScanner.nextInt();
        rideBlackWidow(numGroup3, heightGroup3);
        printRideStats();
        System.out.println("Welcome to the Merry-Go-Round. How many people are in your group?:");
        int numGroup4 = userScanner.nextInt();
        System.out.println("What is the average height of your group?:");
        int heightGroup4 = userScanner.nextInt();
        rideMerryGoRound(numGroup4, heightGroup4);
        printRideStats();
        System.out.println("Welcome to the Black Widow. How many people are in your group?:");
        int numGroup5 = userScanner.nextInt();
        System.out.println("What is the average height of your group?:");
        int heightGroup5 = userScanner.nextInt();
        rideBlackWidow(numGroup5, heightGroup5);
        printRideStats();
    }//end main
    
    public static void rideBlackWidow(int riders, int avgHeight){
        Random rand = new Random();
        if (avgHeight >= MIN_HEIGHT_THRILL){
            System.out.println("Riding black widow!");
            totalRiders = totalRiders + riders;
            int sick = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + sick;
        } else {
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
            System.out.println("I'm sorry, your group of " + riders + " was too short to ride.");
        }
    }//end rideBlackWidow
    
    public static void rideMerryGoRound(int riders, int avgHeight){
        Random rand = new Random();
        if (avgHeight >= MIN_HEIGHT_THEME){
            System.out.println("Riding the Merry-Go-Round!");
            totalRiders = totalRiders + riders;
            int sick = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + sick;
        } else {
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
            System.out.println("I'm sorry, your group of " + riders + " was too short to ride.");
        }
    }//end rideMerryGoRound
    
    public static void printRideStats(){
        System.out.println("*******RIDER STATS*********");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRideAttempts);
        System.out.println("Total sick riders: " + totalSickRiders);
        System.out.println("***************************");
    }//end printRideStats
    
}//end class
