/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica2;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);
    System.out.println("Introduce un num");
    int iN1 = Leer.nextInt();
    if (iN1%2 == 0)
    System.out.println("Es par");
    else 
    System.out.println("Es impar");
    }
    
}
