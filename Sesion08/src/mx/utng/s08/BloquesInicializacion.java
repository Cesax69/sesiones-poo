package mx.utng.s08;

import mx.utng.Alumno;

public class BloquesInicializacion {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getCurso());
        System.out.println(alumno.getSesion());
        System.out.println(alumno.getObjetivo());
        
    }
}