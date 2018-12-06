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
    public String ballName;
    public String brand;
    public String name;
    public String material;
    public String color;
    private int weightClass;
    private double lengthInYards;
    
    public void setWeight(int weight){
        weightClass = weight;
    }//close method setWeight
    
    public void setLength(double length){
        lengthInYards = length;
    }//close method setLength
    
    public int getWeight(){
        return weightClass;
    }//close method getWeight
    
    public double getLength(){
        return lengthInYards;
    }//close methos getLength
    
}//close class Yarn
