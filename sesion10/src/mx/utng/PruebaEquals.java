package mx.utng;

public class PruebaEquals {
  public static void main(String[] args) {
    Llanta llanta1 = new Llanta(205, 16, 35);
    Llanta llanta2 = new Llanta(205, 16, 35);
    Llanta llanta3 = new Llanta(205, 16, 35);
    Llanta llanta4 = new Llanta(205, 16, 35);

    Combustible combustible= new Combustible ((short)40);
    
    Automovil automovil1 new Automovil("Ford", "Fiesta", 2015, 10000);
    automovil1.setCombustible(combustible);
    automovil1.colocaLlantas(llanta1, llanta2, llanta3, llanta4);
    automovil1.llenaTanque();

    Llanta llanta5 = new Llanta(205,16,35);
    Llanta llanta6 = new Llanta(205,16,35);
    Llanta llanta7 = new Llanta(205,16,35);
    Llanta llanta8 = new Llanta(205,16,35);

    Combustible combustible2= new Combustible ((short)40);
    
    Automovil automovil2 new Automovil("Chevrolet", "Chevy", 2002, 80000);
    automovil1.setCombustible(combustible2);
    automovil1.colocaLlantas(llanta5, llanta6, llanta7, llanta8);
    automovil1.llenaTanque();

    System.out.println(automovil1.equals(automovil2));
        
    }
    
}
