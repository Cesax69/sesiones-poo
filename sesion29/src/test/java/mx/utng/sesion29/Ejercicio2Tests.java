package mx.utng.sesion29;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Ejercicio2Tests {

    private final List<Integer>CONJUNTO = Arrays.asList(1,4,2-7,9);

    @Test
    @DisplayName("Transformando a negativos")
    void negatives(){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        List<Integer> real = ejercicio2.transformar(CONJUNTO, s -> -s);

        assertThat(real).containstExactly(-1,-4,-2,7,-9);
    }
    @Test
    @DisplayName("Cuadrados")
    void squares(){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        List<Integer> real = ejercicio2.transformar(CONJUNTO, s -> -s*s);

        assertThat(real).containstExactly(1,16,4,49,81);
    
  }
  @Test
  @DisplayName("Transformar y sumar")
  void transformAndAdd(){
    Ejercicio2 ejercicio2 = new Ejercicio2();
    
    Integer real = ejercicio2.TransformarYSumar(CONJUNTO, s-> 2);
    System.out.println(real);
    assertThat(real).isEqualTo(CONJUNTO.size());
  

  }
}