/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        String nombreDelDia;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 7 : ");
        dia = teclado.nextInt(); // lee el teclado 
        
        
        switch (dia) {
            case 1:  nombreDelDia = "lunes";
            break;
            case 2: nombreDelDia = "Martes";
            break;
            case 3: nombreDelDia = "Miercoles";
            break;
          
            default: nombreDelDia = "Dia Incorrecto, Ingrese un dia valido.";
        }
        System.out.println("El dia de la semana es : " + nombreDelDia);
    }
    
}
