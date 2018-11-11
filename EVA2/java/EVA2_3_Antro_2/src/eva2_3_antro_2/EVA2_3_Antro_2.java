/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_antro_2;

import java.util.Scanner;

/**
 *
 * @author FamFG
 */
public class EVA2_3_Antro_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Tienes una ine?");
        boolean ine;
        
        ine = input.nextBoolean();
        if (ine == true) {
            System.out.println("Si tienes ine");
        } else {
            System.out.println("No tienes INE");
        }
    }
}

