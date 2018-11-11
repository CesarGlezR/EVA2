/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_califas;

import java.util.Scanner;

/**
 *
 * @author Temporal2
 */
public class EVA2_8_califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);
     System.out.println("Introduce tu calificacion");
    String iC;
    iC= Leer.nextLine();
    switch(iC){
    case "A":
        System.out.println("100");
    case "B":
        System.out.println("90"); 
    case "C":
        System.out.println("80");
    case "D":
        System.out.println("70");
    case "F":
        System.out.println("0");
    default:
        System.out.println("Letra invalida");
    }
            
    }
    
}
