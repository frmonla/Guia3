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
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        int num = read.nextInt();
        if (num % 2 == 0 ){
            System.out.println("Correcto");
        } 
        else{
            System.out.println("Incorrecto");} 
        }
    }
