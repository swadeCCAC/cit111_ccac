/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author swade
 */
public class Yarn {
    
    //member variables
    //this group of variables is public and can be set to any string
    public String ballName;
    public String brand;
    public String name;
    public String material;
    public String color;
    
    //this group of variables is private and needs to be accessed through the class Yarn
    private int weightClass;
    private double lengthInYards;
    
    //a method to set the weightClass
    public void setWeight(int weight){
        weightClass = weight;
    }//close method setWeight
    
    //a method to set the lengthInYards
    public void setLength(double length){
        lengthInYards = length;
    }//close method setLength
    
    //this method returns the value of weightClass
    public int getWeight(){
        return weightClass;
    }//close method getWeight
    
    //this method returns the value of lengthInYards
    public double getLength(){
        return lengthInYards;
    }//close method getLength
    
}//close class Yarn
