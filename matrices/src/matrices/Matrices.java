/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Matrices {

   
    public static void main(String[] args) {
        // Matrices ( Tipo de Array ) Bidimensional
        System.out.println("Trabajando con matrices");
        
        // Declarando una matriz
        // Tendriamos una matriz (cuadrada) con 3 Filas y 3 Columnas
       int matriz [][] = new int [3][4];
       Scanner teclado = new Scanner(System.in);
      
             System.out.println("Tamaño : " + matriz.length);
             System.out.println("Tamaño columna : " + matriz[0].length);
       // Recorrido y carga de matrices
       for (int f=0; f<matriz.length; f++) {
           for(int c=0; c<matriz[0].length;c++ ) {
               System.out.println("Ingrese un valor para la fila : " + f + "y la "
                       + "columna : " + c);
               matriz[f][c] = teclado.nextInt();
               System.out.println("");
           }
       }
       // Recorrido y muestra de matrices
       for (int f=0; f<3; f++) {
           for(int c=0; c<3;c++ ) {
               System.out.println("Fila : " + f + "Columna : " + c + "Valor :"
               + matriz[f][c]);
           }
       
           }
       }
    }


