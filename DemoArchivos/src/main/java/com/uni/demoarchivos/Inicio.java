
package com.uni.demoarchivos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Inicio {
    public static void main(String [] args){
        Archivos objArchivo = new Archivos();
        
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese nombre de archivo");
            //objArchivo.escribeArchivo(nombre);
            //objArchivo.leerArchivo(nombre);
            objArchivo.escribeArchivoCompleto(nombre);
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}
