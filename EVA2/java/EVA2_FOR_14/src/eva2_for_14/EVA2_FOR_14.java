/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_for_14;

/**
 *
 * @author FamFG
 */
public class EVA2_FOR_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, j, i, k;
        
        for (x = 1; x <= 10; x++) {
            for (j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i = 9; i >= 1; i--) {
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

