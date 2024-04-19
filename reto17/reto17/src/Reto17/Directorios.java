package Reto17;


import java.io.File;

public class Directorios {
    public static void main(String[] args) {
        String rutaDirectorio = "ruta/del/directorio"; // Reemplazar con la ruta del directorio raíz
        mostrarArchivos(new File(rutaDirectorio), 0);
    }

    private static void mostrarArchivos(File archivoODirectorio, int nivel) {
        if (archivoODirectorio != null && archivoODirectorio.exists()) {
            String prefijo = "-".repeat(nivel);
            if (archivoODirectorio.isDirectory()) {
                System.out.println(prefijo + "D " + archivoODirectorio.getName());
                for (File archivo : archivoODirectorio.listFiles()) {
                    mostrarArchivos(archivo, nivel + 1);
                }
            } else if (archivoODirectorio.isFile()) {
                System.out.println(prefijo + "A " + archivoODirectorio.getName());
            }
        }
    }
}
