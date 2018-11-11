/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_año_bisiesto;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_9_año_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce el año");
    int iA;
    iA = input.nextInt();
    if (iA%4==0 && iA%100!=0)
    System.out.println("Es bisiesto");
     else
     if (iA%100==0 && iA%400==0)
    System.out.println("Es bisiesto");
    else
    if (iA%400==0)
    System.out.println("Es bisiesto");
    else 
    System.out.println("No es bisiesto");
   
    
    
    
    }
    
}
