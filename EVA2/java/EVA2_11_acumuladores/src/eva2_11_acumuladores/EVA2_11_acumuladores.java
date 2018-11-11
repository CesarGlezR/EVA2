/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_acumuladores;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_11_acumuladores {

    /**
     * Cesar Glez Ramos 18550683
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    int iSuma = 0;
    iSuma = iSuma + 10;
    System.out.println("Valor de suma: " + iSuma);
    iSuma= iSuma + 10;
    System.out.println("Valor de suma: " + iSuma);
    iSuma += 10;
    System.out.println("Valor de suma: " + iSuma);
    
    
    int iMult = 1;
    System.out.println("Valor de iMult: " + iMult);
    iMult = 1*5;
    System.out.println("Valor de Mult: "+ iMult);
    iMult *= 5;
    System.out.println("Valor de Mult: "+ iMult);
    
    
    int iRest= 100;
    System.out.println("Valor de resta: "+ iRest);
    iRest= iRest - 5;
    System.out.println("Valor de resta: "+ iRest);
    iRest -=5;
    System.out.println("Valor de resta: "+ iRest);
    
    
    int iCount=0;
    System.out.println("Cuanto tienes "+ iCount);
    iCount=iCount + 1;
    System.out.println("Cuanto tienes "+ iCount);
    iCount+= 1;
    System.out.println("Cuanto tienes "+ iCount);
    iCount++;
    System.out.println("Cuanto tienes "+ iCount);
    iCount--;
    System.out.println("Cuanto tienes "+ iCount);   
    String sCade = "Hola";
    System.out.println(sCade);
    sCade = sCade + " Mundo";
    System.out.println(sCade);
    sCade +=" Quiubo";
    System.out.println(sCade);
    
    
    System.out.println("Valor de iCount = " + iCount);
    System.out.println("Valor de iCount = " + (iCount++));
    System.out.println("Valor de iCount = " + (++iCount));
    System.out.println("Valor de iCount = " + iCount);
    //iCount++ --> se aplica despues
    //++iCount --> se aplica al momento
    iCount++;
    System.out.println("Valor de iCount = " + iCount);
    ++iCount;  
    System.out.println("Valor de iCount = " + iCount);
    }
    
}
