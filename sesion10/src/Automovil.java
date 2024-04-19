package mx.utng;

import java.util.Arrays;

public class Automovil {
    private String marca;
    private String modelo;
    private int aniofabricacion;
    private int kilometraje;
    private Llanta [] llantas = new Llanta[4];
    private Combustible combustible = new Combustible();

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass())
        return false;
        Automovil that = (Automovil) obj;

        if(!that.marca.equals(this.marca)) return false;
        if(!that.modelo.equals(this.modelo)) return false;
        if(that.aniofabricacion!=this.aniofabricacion) return false;
        if(that.kilometraje!=this.kilometraje) return false;
        if(!Arrays.equals(that.llantas, this.llantas)) return false;
        return that.combustible.equals(this.combustible);
    }
 
    public Automovil(String marca, String modelo, int aniofabricacion, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.aniofabricacion = aniofabricacion;
        this.kilometraje = kilometraje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash+=marca.hashCode();
        hash+=modelo.hashCode();
        hash+=aniofabricacion;
        hash+=kilometraje;
        return  hash;
    }
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void colocaLlantas(Llanta delanteraIzquierda, Llanta delanteraDerecha, Llanta traseraIzquiera, Llanta traseraDerecha){
        llantas[0]= delanteraIzquierda;
        llantas[1]= delanteraDerecha;
        llantas[2]= traseraIzquiera;
        llantas[3]= traseraDerecha;
    }
    
    public void llenaTanque(){
        combustible.setlitrosActuales(combustible.getlitrosMaximos());
         }

       public void avanzar() {
        if(combustible.getlitrosActuales() > 0){
            for (Llanta llanta : llantas){
                llanta.rodar();
            }
            combustible.usar();

        } else {
            System.out.println("No hay combustible");
        }


    }
        
}
    

