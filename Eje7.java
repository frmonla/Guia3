/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author Franco MONLA
 */
public class Eje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean ban;
        int corr = 0,incorr = 0 ;
        String code;
        
        ban = true;
        
        while (ban == true){
            System.out.print("Ingrese un codigo:");
            code = read.next();
            code = code.toUpperCase();
            if (code.substring(0, 1).equals("X") && code.substring(4,5).equals("O") && code.length() == 5){
                corr++;
            }
            else if (code.equals("&&&&&")){
                ban = false;
            }
            else{
                incorr++;
            }
        }
        System.out.println("Correctas: " + corr);
        System.out.println("Incorrectas: " + incorr);
    }
    
}
