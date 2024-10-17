/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerapp;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando variables, es decir el programa reserva un lugar.
        Scanner teclado = new Scanner(System.in);
        double num1,num2,suma;
        
        /*System.out.println("Ingrese el primer numero a operar :");
        num1 = teclado.nextInt();
       
        System.out.println("Ingrese el segundo numero a operar");
        num2 = teclado.nextInt();
        
        suma = num1 + num2;
                
        System.out.println("El resultado de tu cuenta es :" + suma);*/
        
        // Con Doubles
        

        
        System.out.println("Ingrese el primer numero a operar :");
        num1 = teclado.nextDouble();
       
        System.out.println("Ingrese el segundo numero a operar");
        num2 = teclado.nextDouble();
        
        suma = num1 + num2;
        
        System.out.println("El resultado de tu cuenta es :" + suma);
        
        
                
    }
    
}