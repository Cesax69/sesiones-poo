package mx.utng.s23.Factory;

import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        //Crear un objeto Logger 
        LoggerFactory factory = new LoggerFactory();
        //El usuario tecleara el tipo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea el tipo de Logger:(1)Archivo (2)Consola");
        int type = scanner.nextInt();
        scanner.close();
        //Crear el Logger de acuerdo al tipo elegido por el usuario 
        Logger logger = factory.getLogger(type);
        logger.log("Registro de eventos del sistema");

    
    }
}
