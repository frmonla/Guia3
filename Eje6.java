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
public class Eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op,num1,num2,suma,resta,mul;
        boolean bandera;
        String sn ;
        bandera = true ;
    Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su primer numero");
        num1 = read.nextInt();
        System.out.println("Ingrese su segundo numero");
        num2 = read.nextInt();
        while (bandera == true){
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        op = read.nextInt();
        switch (op){
            case 1:
                suma = num1 + num2 ;
                System.out.println("La suma de sus numeros da: " + suma);
                break;
            case 2:
                resta = num1 - num2;
                System.out.println("La resta de sus numeros da: " + resta);
                break;
            case 3:
                mul = num1 * num2;
                System.out.println("La multiplicacion da: " + mul);
                break;
            case 4:
                System.out.println("La divicion da: " + ((double)num1/num2));
                break;
            case 5:
                System.out.println("Esta seguro que desea salir? S/N");
                sn = read.next().toUpperCase();
                if (sn.equals("S")){
                    bandera = false;
                }
        }
        }
    }
    
}
