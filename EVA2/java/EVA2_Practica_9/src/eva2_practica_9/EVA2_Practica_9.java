/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica_9;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_Practica_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Introduce el primer num");
    int iN1 = input.nextInt();
    System.out.println("Introduce el segundo num");
    int iN2 = input.nextInt();
    System.out.println("Introduce el tercer num");
    int iN3 = input.nextInt();
    int iDisc = (iN2 * iN2) - (4*iN1*iN3);
    boolean bBande = true;
    if (iDisc>0){
    System.out.println("Trinomio Ax2");
    } else if(iDisc ==0){
    System.out.println("T.C.P");
    }else{
    bBande=false;
    System.out.println("Sin solucion");        
    } 
    if(bBande){
        double dX1, dX2;
        double dR= Math.sqrt(iDisc);
        dX1=(-iN2+dR)/(2*iN1);
        dX2=(-iN2-dR)/(2*iN1);
        System.out.println("X1=" + dX1 );
        System.out.println("X2=" + dX2 );
    }
    }
    
}
