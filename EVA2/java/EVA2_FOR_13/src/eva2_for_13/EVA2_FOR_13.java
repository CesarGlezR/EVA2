/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_for_13;

/**
 *
 * @author FamFG
 */
public class EVA2_FOR_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, j;
        
        for (x = 1; x <= 10; x++) {
            for (j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

