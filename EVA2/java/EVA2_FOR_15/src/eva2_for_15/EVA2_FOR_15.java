/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_for_15;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_FOR_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero enteri");
    int iN = sc.nextInt();
    boolean bP = true;
    for(int x=2; x<iN;x++){
    if((iN%x)==0){
        bP = false;
        break;
    }
    }
    if(bP){
        System.out.println("Es primo");
    }else{
        
              System.out.println("No es primo");
    }
    }
    
}
