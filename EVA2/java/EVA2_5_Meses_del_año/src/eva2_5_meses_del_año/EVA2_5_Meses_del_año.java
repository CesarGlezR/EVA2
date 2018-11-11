/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_meses_del_año;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_5_Meses_del_año {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int iM;
        
        iM = input.nextInt();
        if (iM == 1) {
            System.out.println("Enero");
        } else {
            if (iM == 2) {
                System.out.println("Febrero");
            } else {
                if (iM == 3) {
                    System.out.println("Marzo");
                } else {
                    if (iM == 4) {
                        System.out.println("Abril");
                    } else {
                        if (iM == 5) {
                            System.out.println("Mayo");
                        } else {
                            if (iM == 6) {
                                System.out.println("Junio");
                            } else {
                                if (iM == 7) {
                                    System.out.println("Julio");
                                } else {
                                    if (iM == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (iM == 9) {
                                            System.out.println("Septiembre");
                                        } else {
                                            if (iM == 10) {
                                                System.out.println("Octubre");
                                            } else {
                                                if (iM == 11) {
                                                    System.out.println("Noviembre");
                                                } else {
                                                    if (iM == 12) {
                                                        System.out.println("Disiembre");
                                                    } else {
                                                        System.out.println("No corresponde a ningun mes");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

        
        
