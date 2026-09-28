/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2palometes;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
/**
 *
 * @author ago4635
 */
public class EX2Palometes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diners=0;
        int num_entrades=0;
        int preu_entrada=0;
        int Preu_entrades=0;
        int Diners_restants=0;
        // TODO code application logic here
        System.out.println("Quants diners tens?");
        Scanner lector=new Scanner(System.in);
        diners=lector.nextInt();
        System.out.println("Quantes entrades has comprat?");
        Scanner lector2=new Scanner(System.in);
        num_entrades=lector2.nextInt();
        System.out.println("Quant val una entrada?");
        Scanner lector3=new Scanner(System.in);
        preu_entrada=lector3.nextInt();
        Preu_entrades=num_entrades*preu_entrada;
        Diners_restants=diners-Preu_entrades;
        System.out.println("Diners restants "+ Diners_restants+ "euros");




    }
    
}
