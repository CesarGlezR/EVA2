/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica7;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    System.out.println("Introduce la temperatura en grados C");
    int iT= Input.nextInt();
    if (iT<=0)
    System.out.println("Freezing weather");
    if (iT>0 && iT<10)
    System.out.println("Very cool wheather");
    if (iT>=10 && iT<20)
    System.out.println("Cool wheather");
    if (iT>=20 && iT<20)
    System.out.println("Normal in temp");
    if (iT>=30 && iT<40)
    System.out.println("Its hot");
    if (iT>=40)
    System.out.println("Its very hot");
    }
    
}
