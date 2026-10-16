/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, Integer> retiro = new HashMap<>();
        var num = new HashMap<Integer, Integer>();
        retiro.put(10000, 100);
        retiro.put(20000, 100);
        retiro.put(50000, 100);
        retiro.put(100000, 100);
        
        // Crear una instancia de tu ventana gráfica
        interfaz4 ventana = new interfaz4();
        
        // Centrar la ventana en la pantalla (opcional pero muy recomendado)
        ventana.setLocationRelativeTo(null);
        
        // Hacer la ventana visible al usuario
        ventana.setVisible(true);
    }
    
}
