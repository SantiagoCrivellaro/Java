/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int edad;
         Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a la English School");
        System.out.println("Ingrese su edad : ");
        edad = teclado.nextInt();
        
        if (edad >=4 && edad <=6) {
            System.out.println("El Horario del Kinder es : Lunes y miercoles"
                    + "de 16 a 17hs");
        }
        if (edad >=7 && edad <=8) {
            System.out.println("El horario de 1st es martes y jueves"
                    + "de 16 30 a 17 30");
        }
        if (edad >=9 && edad <=10) {
            System.out.println("El horario de 2nd es martes y jueves"
                    + "de 17 30 a 19");
        }
        if (edad >=11 && edad <=13) {
            System.out.println("El Horario de 3rd es lunes y miercoles"
                    + "de 17 a 18 30");
        } else {
            System.out.println("Ingrese un numero dentro del rango"
                    + "[ 4 - 13 ]" );
            
        }
            
    }
    
}
