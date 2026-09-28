/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circulo;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class Circulo {

    public static void main(String[] args) {
        final double PI=3.14;
        double radio,longitud,area=0.0;
        System.out.println("Introduzca el radio de su circulo");
        Scanner lector=new Scanner(System.in);
        radio=lector.nextDouble();
        longitud=2*PI*radio;
        area=PI*radio*radio;
        System.out.println("La longitud del circulo es "+longitud+" y el area del circulo es "+area);
    }
}
