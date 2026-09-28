/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacionesvalores;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class Operacionesvalores {

    public static void main(String[] args) {
        double value1,value2,suma,resta,div,mult=0.0;
        System.out.println("Introduzca valor 1");
        Scanner lector = new Scanner(System.in);
        value1=lector.nextDouble();
        System.out.println("Introduzca value 2");
        value2=lector.nextDouble();
        suma=value1+value2;
        resta=value1-value2;
        mult=value1*value2;
        div=value1/value2;
        System.out.println("Los resultados de operar con los siguientes valores: " + value1 + "y" + value2 + "son:\n 22Suma: " + suma + "\n Resta: " + resta + "\n Multiplicacion: " + mult + "\n Division: " + div) ;
    }
}
