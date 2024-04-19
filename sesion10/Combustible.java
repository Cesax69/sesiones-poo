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
    public void setlitrosMaximos(short litrosMaximos){
        this.litrosMaximos = litrosMaximos;


    }

    public short getlitrosActuales() {
        return litrosMaximos;
     

    }
    public void setlitrosActuales(short litrosMaximos){
        this.litrosMaximos = litrosMaximos;


    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || getClass() != obj.getClass())return false;

        Combustible that = (Combustible)obj;

        if(litrosMaximos!=that.litrosMaximos) return false;


        return litrosActuales == that.litrosActuales;
    }
    

    
}
