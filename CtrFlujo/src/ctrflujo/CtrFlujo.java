/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ctrflujo;

/**
 *
 * @author Santi
 */
public class CtrFlujo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
    
        // Controladores de Flujo
        // Break - Continue
        
        for(int i=0;i<10;i++) {
            System.out.println("Aun estas en el ciclo");
            if (i == 4)
            {
                
                continue; // Continuar
                 //break;// Salirse del Ciclo / Romper
            }
            
            System.out.println("El valor de i es :" + i);
        }
    
    
    }
    
}
