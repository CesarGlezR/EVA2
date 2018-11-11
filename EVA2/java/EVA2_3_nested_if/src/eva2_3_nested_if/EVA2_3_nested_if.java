/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_nested_if;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */

public class EVA2_3_nested_if {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("introduce tu califocacion");
        int iCalifa;
        
        iCalifa = input.nextInt();
        if (iCalifa == 100) {
            System.out.println("A");
        } else if(iCalifa==90) {
         System.out.println("B");
        }else if(iCalifa==80){
         System.out.println("C");
        }else if(iCalifa==70){
         System.out.println("D");
        }else if(iCalifa==60){
        System.out.println("F");
        }else{
            System.out.println("Fuera de rango");
        }
    }
}
