/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_control_if_antro_final;

import java.util.Scanner;

/**
 *
 * @author FamFG
 */
public class EVA2_4_control_if_antro_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("¿Cuantos años tienes?");
        int iEdad;
        
        iEdad = input.nextInt();
        System.out.println("¿Tienes INE?");
        boolean bINE;
        
        bINE = input.nextBoolean();
        if (iEdad >= 18) {
            if (bINE == true) {
                System.out.println("Pásale");
            } else {
                System.out.println("No puedes entrar");
            }
        } else {
            System.out.println("No puedes entrar");
        }
    }
}

 