package mx.utng.s16.ej3;

import java.time.LocalDate;

public class Formato {
    public static void main(String[] args) {
        final String NOMBRE = "Bobby";
        final int EDAD = 3;
        final float ESTATURA = 30.5f;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of(2020, 8, 3);

        System.out.println("El nombre de mi mascota es "+NOMBRE+",Tiene una edad de "+ EDAD+" Su estatura es "+ESTATURA+"Y nacio el dia:"+ FECHA_NACIMIENTO);

        System.out.printf("El nombre de mi mascota es |%8S| tiene una edad de %05d su estatura es %.2f Y nacio el dia: %4$te de mes %4$tB del %4$tY %n", NOMBRE, EDAD, ESTATURA, FECHA_NACIMIENTO);



        
    }
    
}
