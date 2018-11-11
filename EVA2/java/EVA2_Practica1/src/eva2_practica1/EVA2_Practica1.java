/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica1;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Introduce el primer num");
        int iN1; 
        iN1 = Leer.nextInt();        
        System.out.println("Introduce el segundo num");
        int iN2;
        iN2 = Leer.nextInt();
        if (iN1 == iN2)
        System.out.println("Son iguales");
        else
        System.out.println("No son iguales");            
    }
    
}
