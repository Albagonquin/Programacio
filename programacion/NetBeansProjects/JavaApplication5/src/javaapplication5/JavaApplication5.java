/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double diners;
        double canvi;
        double dinerstransformats;
        System.out.println("Diners que vols canviar");
        Scanner lector=new Scanner(System.in);
        diners=lector.nextDouble();
        System.out.println("Valor tipus divisa");
        Scanner lector2=new Scanner(System.in);
        canvi=lector2.nextDouble();
        dinerstransformats=diners*canvi;
        System.out.println("El diner " + diners + "en la nova moneda es " + dinerstransformats);
    }
    
}
