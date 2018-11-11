/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_break_continue;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_16_Break_continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //for: no manipula la variable del contador
    Scanner input = new Scanner(System.in);
    for(int i = 1; i <= 10; i++){
        System.out.println(i);
        int iR = i % 5;
        if(iR == 0)
        break; // interrumpe la logica del programa     
    }
    //continue
    //Imprimir todos los numeros menos los disivisibles entre 5
    for(int i = 1; i <= 10; i++){
        int iR = i % 5;
        if(iR == 0)
        continue;
        System.out.println(i);}
    }
    
}
