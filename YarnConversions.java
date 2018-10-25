/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;

/**
 *
 * @author swade
 */
public class YarnConversions {

    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        int switchControl = 0;

        while (switchControl != 6) {
            System.out.println("Let's figure out if you have enough yarn");
            System.out.println("1 - ounces to grams");
            System.out.println("2 - grams to ounces");
            System.out.println("3 - meters to yards");
            System.out.println("4 - yards to meters");
            System.out.println("5 - grams to yards");
            System.out.println("6 - exit");
            System.out.println("What would you like to do?:");
            switchControl = userScanner.nextInt();
            
            switch (switchControl) {
                case 1:
                    System.out.println("How many ounces of yarn do you have?:");
                    double inputOunces = userScanner.nextDouble();
                    double calcGrams = ozToGram(inputOunces);
                    System.out.println("You have " + calcGrams + " grams of yarn.");
                    break;
                case 2:
                    System.out.println("How many grams of yarn do you have?:");
                    double inputGrams = userScanner.nextDouble();
                    double calcOunce = gToOz(inputGrams);
                    System.out.println("You have " + calcOunce + " ounces of yarn.");
                    break;
                case 3:
                    System.out.println("Please enter the length of yarn in meters:");
                    double inputMeters = userScanner.nextDouble();
                    double calcYards = meterToYards(inputMeters);
                    System.out.println("You have " + calcYards + " yards of yarn.");
                    break;
                case 4:
                    System.out.println("Please enter the length of yarn in yards:");
                    double inputYards = userScanner.nextDouble();
                    double calcMeters = yardToMeter(inputYards);
                    System.out.println("You have " + calcMeters + " meters of yarn.");
                    break;
                case 5:
                    System.out.println("From the yarn label please enter the length of yarn in yards:");
                    double origYards = userScanner.nextDouble();
                    System.out.println("From the yarn label please enter the weight of yarn in grams:");
                    double origGrams = userScanner.nextDouble();
                    System.out.println("How many grams of yarn do you currently have?:");
                    double currentGrams = userScanner.nextDouble();
                    double currentYards = gramsToYards(origYards, origGrams, currentGrams);
                    System.out.println("You have " + currentYards + " yards of yarn.");
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("That is an invalid choice.");
            }//end switch
        }//end while
    }//end main

    public static double ozToGram(double oz) {
        double gr = oz * 28.3495;
        return gr;
    }//end ozToGrams
    
    public static double gToOz(double g) {
        double oz = g * 0.035274;
        return oz;
    }//end gToOz

    public static double meterToYards(double m) {
        double yard = m * 1.09361;
        return yard;
    }//end meterToYards

    public static double yardToMeter(double y) {
        double meter = y * 0.9144;
        return meter;
    }//end yardToMeter
    
    public static double gramsToYards(double oY, double oG, double cG){
        double cYards = (oY/oG) * cG;
        return cYards;
    }//end gramsToYards
}
