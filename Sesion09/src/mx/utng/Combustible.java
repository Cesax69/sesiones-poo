package mx.utng;

public class Combustible {

    private short litrosMaximos;
    private  short litrosActuales;

    public void usar(){
        litrosActuales--;
        System.out.println("Quedan"+ litrosActuales+ "litros.");


    }
    public short getlitrosMaximos() {
        return litrosMaximos;
     

    }
    public void setlitrosActuales(short litrosMaximos){
        this.litrosMaximos = litrosMaximos;
    }
    

    
}
