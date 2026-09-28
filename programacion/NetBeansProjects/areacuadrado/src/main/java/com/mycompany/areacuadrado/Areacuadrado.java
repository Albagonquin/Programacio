/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areacuadrado;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class Areacuadrado {

    public static void main(String[] args) {
        double lado=0.0;
        double area=0.0;
        System.out.println("Introduzca el tamano en cm del lado del cuadrado");
        Scanner lector=new Scanner(System.in);
        lado=lector.nextDouble();
        area=lado*lado;
        System.out.println("El area del cuadrado es "+area+" cm^2" );
    }
}
