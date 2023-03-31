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
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lim,num,suma ;
        suma = 0;
        lim = -1;
       Scanner read = new Scanner(System.in);
       while (lim < 0){
        System.out.print("Ingrese un limite:");
        lim = read.nextInt();
       }
        while (lim > suma){
            System.out.println("Ingrese un numero");
            num = read.nextInt();
            suma =  suma + num;
        }
        System.out.println("La suma da: " + suma);
    }
}
