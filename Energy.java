/*
* Copyright (c) 2020
*
* This program calculates the amount of energy released 
* by an object given its mass.
*
* @author  Wajd Mariam
* @version 1.0
* @since   2020/11/23
*/
 
import java.util.Scanner;

public class Energy {
  /**
   * This function calculates the amount of energy released
   * by an object based on the mass of it. It also calculates how
   * many bombs that energy is equivalent to.
   */
  public static void main(String[] args) {
    
    // Constants
    final double C = 2.998 * Math.pow(10, 8);
    
    // Input 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the mass of an object in kg:");
    double massObject = input.nextDouble();
    // closing the scanner object 
    input.close();
        
    // Process
    double energyCreated = (massObject * C * C);
    double numberOfBombs = (energyCreated / (4 * Math.pow(10, 12)));
        
    // Output
    System.out.println();
    System.out.println("The energy released from the object is " + (energyCreated) + " Joules.");
    System.out.println("This energy is equivalent to " + numberOfBombs + " bombs.");
  }
}