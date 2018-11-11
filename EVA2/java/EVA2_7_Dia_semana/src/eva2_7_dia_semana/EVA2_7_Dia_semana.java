/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_dia_semana;

import java.util.Scanner;

/**
 *
 * @author Temporal2
 */
public class EVA2_7_Dia_semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
       System.out.println("Introduce un numero");
        int iDia;
        iDia = Leer.nextInt();
       switch(iDia){
           case 1:
               System.out.println("Lunes");
               break;
            case 2:
               System.out.println("Martes");
               break; 
            case 3:
               System.out.println("Miercoles");
               break;
            case 4:
               System.out.println("Jueves");
               break;
            case 5:
               System.out.println("Viernes");
               break;
            case 6:
               System.out.println("Sabado");
               break;
            case 7:
               System.out.println("Domingo");
               break;
            default:
            System.out.println("Numero invalido");
       }
    }
    
}
