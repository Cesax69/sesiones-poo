package mx.utng.sesion19;

public class IntegerToBinary {
    public static void main(String[] args) {
        int num = 40;

        String binario = Integer.toBinaryString(num);

        System.out.printf("El numero %d es un binario %s.%n", num,binario);
    }
    
}
