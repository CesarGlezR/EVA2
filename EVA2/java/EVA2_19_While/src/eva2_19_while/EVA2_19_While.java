/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_while;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_19_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    String sCade = "";
    while(!sCade.equals("X")){
        System.out.println("Introduce un mesaje(X para salir)");
        sCade = input.nextLine();
        System.out.println("Tu mensaje: " + sCade);
    }
    }
    
}
