/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_20_while_perpetuo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author temporal2
 */
public class EVA_20_while_perpetuo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    while(true){
        System.out.println("Si ves este mensaje, se trabo tu programa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(EVA_20_while_perpetuo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
}
