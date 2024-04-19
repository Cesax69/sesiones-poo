package mx.utng.s16;

import java.io.File;
import java.io.IOException;

public class ArchivoTest {

    public static void main(String[] args) throws IOException{
        File archivo = new File("C:/temp/cursos/cursos.txt");
        //Consultar el nombre, ruta, directorio padre, si esta oculto
        //Si existe o no existe el archivo 
        System.out.println("Nombre del archivoz:"+archivo.getName());
        System.out.println("Ruta:" +archivo.getPath());
        System.out.println("Ruta absoluta:" +archivo.getAbsolutePath());
        System.out.println("Directorio padre:" +archivo.getParent());        
        System.out.println("Existe el archivo? " +(archivo.exists()?"Si":"No"));
        System.out.println("Es oculto?" +(archivo.isHidden()?"Si":"No"));
        //Tienes permiso de lectura, escritura, ejecucion del archivo
        System.out.printf("%s puede escribir%n",archivo.canWrite()?"Si":"No");
        System.out.printf("%s puede leer%n",archivo.canRead()?"Si":"No");
        System.out.printf("%s puede ejecutar%n",archivo.canExecute()?"Si":"No");
        System.out.printf("%s puede directorio%n",archivo.isDirectory()?"Si":"No");
        System.out.printf("%s bytes de tamaño%n",archivo.length());
    }

}    

