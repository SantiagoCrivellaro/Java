/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hasmaps;

import java.util.HashMap;

/**
 *
 * @author Santi
 */
public class Hasmaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Los hashmaps son como los diccionarios de python
           // Clave - Valor
           
        System.out.println("Trabajando con HashMaps");
        
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1000, "Juan");
        hash.put(500, "Pepe");
        hash.put(600, "Maria");

        
            System.out.println(hash.get(500));
            
     hash.remove(600);
     
        System.out.println(hash);
        
        if  (hash.containsKey(1000)) {
        System.out.println("Contiene un indice de 1500 y su valor es" +
                hash.get(1000));
        } else {
                System.out.println("No tiene");
                }
    }
             
     
    }


