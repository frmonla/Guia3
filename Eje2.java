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
public class Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese una frase:");
        String frase = read.next();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        } 
        else{
            System.out.println("Incorrecto");} 
        }
    }