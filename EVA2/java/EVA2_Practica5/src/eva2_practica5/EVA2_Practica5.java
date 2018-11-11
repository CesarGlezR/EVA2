/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica5;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);
    System.out.println("Introduce el primer num");
    int iN1= Leer.nextInt();
    System.out.println("introduce el segundo num");
    int iN2= Leer.nextInt();
    System.out.println("Introduce el tercer num");
    int iN3= Leer.nextInt();
    if(iN1>iN2 && iN1>iN3)
    System.out.println(iN1);
    if(iN3>iN2 && iN3>iN1)
    System.out.println(iN3);
    if(iN2>iN1 && iN2>iN3)
    System.out.println(iN2);
    }
    
}
