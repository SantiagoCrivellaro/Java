/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ternario;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ternario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operador Ternario
        System.out.println("Operador Ternario");
        
        // Operacion que nos dice si un alumno aprobo o no.
        
        // Declaramos Variables.
        
        double promedio;
        String condicionFinal;
        
        // Pedimos que ingrese un promedio por teclado.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un promedio : ");
        promedio = teclado.nextDouble();
        
        condicionFinal = (promedio>=6) ? "Aprobo " : "Desaprobo";
        
        System.out.println("El Alumno : " + condicionFinal +
                " El promedio fue " + promedio);
    }
    
}
