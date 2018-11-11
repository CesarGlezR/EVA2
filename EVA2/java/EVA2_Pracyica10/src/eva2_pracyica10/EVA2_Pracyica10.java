/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_pracyica10;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_Pracyica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
    System.out.println("Introduce Mate");
    int iM = input.nextInt();
    System.out.println("Introduce fisica");
    int iF = input.nextInt();
    System.out.println("Introduce quimica");
    int iQ = input.nextInt();
    int iS= iM+iF+iQ;
    if(((iM>=65)&&(iF>=55)&&(iQ>=50))&&(iS>=180)||(iM>=65)&& (iS>=140)){
    System.out.println("Aceptado");
    }else{
    System.out.println("Intentalo despues");   
    }
    }
    
}
