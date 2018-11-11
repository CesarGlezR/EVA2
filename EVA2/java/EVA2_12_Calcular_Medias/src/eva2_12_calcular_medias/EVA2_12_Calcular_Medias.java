/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_calcular_medias;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_12_Calcular_Medias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int iSum =0;
    System.out.println("introduce tu edad");
    int iE1 = input.nextInt();
    iSum += iE1;
    System.out.println("introduce tu edad");
    int iE2 = input.nextInt();
    iSum += iE2;
    System.out.println("introduce tu edad");
    int iE3 = input.nextInt();
    iSum += iE3;
    System.out.println("introduce tu edad");
    int iE4 = input.nextInt();
    iSum += iE4;
    System.out.println("introduce tu edad");
    int iE5 = input.nextInt();
    iSum += iE5;
    int iM = iSum / 5;
    System.out.println("La media es " + iM);
    }
    
}
