/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_controlador_de_flujo_if;

import java.util.Scanner;

/**
 *
 *Cesar Gonzalez 18550683
 */

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Que calificacion sacaste?");
        double rCalifa;
        
        rCalifa = input.nextDouble();
        System.out.println("Tu calificaion es");
        System.out.println(rCalifa);
        if (rCalifa >= 7) {
            System.out.println("Ya pasate");
        } else {
            System.out.println("gg");
        }
    }
}
