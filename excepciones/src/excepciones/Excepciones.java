/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author Santi
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int[] numeros = {1,2,3};
            try {
                        int numero = numeros[4];
                        
           
            } catch (ArrayIndexOutOfBoundsException e) {
                
                System.out.println("Error al iterar.");
           } finally {
                System.out.println("El programa termino.");
            }
            
       // Esto enviara una Excepcion ( Aproposito )
    }
    
    }
