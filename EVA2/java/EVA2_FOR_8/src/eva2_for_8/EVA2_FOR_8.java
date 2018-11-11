/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_for_8;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_FOR_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int iN;
        for(int x=1; x<=20;x++){
    iN =(int) (Math.random()*100)+1;    
        System.out.println(x + ".-" +iN);}
    }
    
}
