/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_media2;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_15_Media2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int iS = 0;
    for(int i = 1; i <=5; i++){
        System.out.println("Edad " + i + ":" );
        iS += input.nextInt();}
    double dM = (float)iS/5;
    System.out.println("La media es " + dM);
    }
    
}
