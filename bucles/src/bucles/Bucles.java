/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Bucles 
   
   // Bucle Do-While
     //   System.out.println("Bucle do-while");
   int contador = 5;
   
  /* do {
       System.out.println("Estoy en la vuelta :" + contador );
       contador++;
       } while (contador <10); */
    
   // Bucle While, Controlado por controlador;
       /* System.out.println("Bucle While");
       
       
       while (contador <10) {
           System.out.println("Estoy en la vuelta :" + contador);
           contador++;
       }
     
       // Bucle While, Controlado por centinela;
       Scanner teclado = new Scanner(System.in);
       String respuesta;
         
       boolean bandera = true;
       
       while (bandera == true) {
           System.out.println("El valor de mi bandera es:" + bandera);
           System.out.println("Estas actualmente Suscrito?" + bandera);
           System.out.println("Queres desuscribirte?");
           respuesta = teclado.next();
           
           if (respuesta.equalsIgnoreCase("Si")) {
               bandera = false;
           }
       } */
       
       // Bucle For 
       
       int suma;
               
       for (int i=0; i<10; i++) {
           System.out.println("Estoy en la vuelta numero;" + i);    
           
           suma = 3 + i;
                   
             if (suma>= 4) {
                 i = 14;
             }
       }
   }
}