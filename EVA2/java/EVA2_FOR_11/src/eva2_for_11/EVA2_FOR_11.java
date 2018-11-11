/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_for_11;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_FOR_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int num, x;
        
        System.out.println("Ingrese un número entero");
        num = input.nextInt();
        for (x = 1; x <= 100; x++) {
            if (x % num != 0) {
                System.out.println(x);
            }
        }
    }
}

