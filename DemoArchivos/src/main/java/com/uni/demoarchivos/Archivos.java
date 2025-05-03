
package com.uni.demoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {
    public void escribeArchivo(String nombreArchivo) throws IOException{
        File myObj = new File(nombreArchivo);
        boolean secreo = myObj.createNewFile();
        if(secreo){
            System.out.println("Se creo el archivo");
        }else{
            System.out.println("No se creo");
        }
    }
    
    public void leerArchivo(String nombreArchivo) throws FileNotFoundException{
        File objFile = new File(nombreArchivo);
        Scanner myReader = new Scanner(objFile);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
        
    }
    
        public void escribeArchivoCompleto(String nombreFile) throws IOException{
        FileWriter myWriter = new FileWriter(nombreFile);
        myWriter.write("Línea 1 del archivo");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    }
}
