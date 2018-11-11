/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_17_encontrar_num;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA_17_encontrar_num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Numeros entre 1 y 10
    int iN = (int) (Math.random()*10)+1;
    for(int i = 0; i <3; i++){
        System.out.println("Adivina el numero");
    int iN2 = input.nextInt();
    if(iN == iN2){
        System.out.println("Felicidades,ganaste");
        break;
    }
    if(i==2){
        System.out.println("Perdiste");
    }
    }        
    
    }
    
}
