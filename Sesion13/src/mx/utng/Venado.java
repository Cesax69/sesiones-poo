package mx.utng;

public class Venado extends Animal implements Hervivoro {
    private boolean tieneCuernos;


    public void respirar(){
        System.out.println("Respirando como venado");

    }
    public void comer(){
        System.out.println("Comiendo plantas");

    }
    
    public boolean isTieneCuernos(){
        return tieneCuernos;
    }

    public void setTieneCuernos(boolean tieneCuernos){

    }
}
