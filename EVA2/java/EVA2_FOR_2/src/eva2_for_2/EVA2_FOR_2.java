/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_for_2;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Introduce el num de veces que quieres que se imprima");
        int iN = input.nextInt();
    for(int x=1; x<=iN;x++)
        System.out.println("Cesar");
    }
    
}
