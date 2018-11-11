/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_problema8;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Input= new Scanner(System.in);
    System.out.println("Introduce el primer lado");
    int iN1 = Input.nextInt();
    System.out.println("Introduce el segundo lado");
    int iN2 = Input.nextInt();
    System.out.println("Introduce el tercer lado");
    int iN3 = Input.nextInt();
    if(iN1==iN2 && iN1==iN3)
    System.out.println("Es equilatero");
    if((iN1==iN2 && iN1!=iN3)|| (iN3==iN2 && iN1!=iN3))
    System.out.println("Es isoseles");
    if(iN1!=iN2 && iN1!=iN3 && iN2!=iN3)
    System.out.println("Es escaleno");
    }
    
}
