/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_adivina_num_while;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_22_Adivina_num_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int iC = 0;
    int iR =(int) (Math.random()*10)+1;
    System.out.println(iR);
    while(!(iC==iR)){
        System.out.println("Adivina el numero");
        iC=input.nextInt();
        
    
    }
    }
    
}
