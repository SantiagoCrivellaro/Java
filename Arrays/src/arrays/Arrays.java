/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Arrays
            System.out.println("Trabajando con vectores.");
      // Los vectores son un tipo de array undimensional, podemos guardar datos
      // en una sola dimension.
        
      // Reservamos espacio en memoria y establecemos cuanta memoria usamos
      
      int numeros [] = new int [2];
      // Scanner 
      Scanner teclado = new Scanner(System.in);
      // le damos un valor a cada vector  
      /*numeros [0] = 30;
      numeros [1] = 20;*/
      
      // Mostramos en pantalla el elemento de la Segunda Posicion : 
        System.out.println("El numero de la Segunda posicion es : " + numeros [1]);
        
       // declaramos un for
       
       
           // Mostramos en pantalla
           for (int i=0; i<numeros.length; i++) {
           System.out.println("Ingrese el valor para el indicie :" + i  );
           numeros[i] = teclado.nextInt();
           
       }
        System.out.println("Los valores ingresados fueron :");
           for (int i=0;i<numeros.length;i++) {
            System.out.println("Indice :" + i + "valor : " + numeros[i]);
    }
    }  
}
