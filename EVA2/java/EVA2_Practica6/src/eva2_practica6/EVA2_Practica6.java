/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica6;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);
    System.out.println("Introduce la cordenada x");
    int iN1 = Leer.nextInt();
    System.out.println("Introduce la cordenada y");
    int iN2 = Leer.nextInt();
    if (iN1>0 && iN2>0)
    System.out.println("cuadrante 1"); 
    if (iN1<0 && iN2>0)
    System.out.println("cuadrante 2");
    if (iN1<0 && iN2<0)
    System.out.println("cuadrante 3");
    if (iN1>0 && iN2<0)
    System.out.println("cuadrante 4");
    }
    
}
