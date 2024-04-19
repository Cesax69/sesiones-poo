package mx.utng;

public class Llanta {

    private float Ancho;
    private float Diametro;
    private float Presion;

    
    public void rodar(){
 }
    public void setAncho(float ancho) {
        Ancho = ancho;
    }
    public void setDiametro(float diametro) {
        Diametro = diametro;
    }
    public void setPresion(float presion) {
        Presion = presion;
    }
    public Llanta(float ancho, float diametro, float presion) {
    }
    public float getAncho(){
        return Ancho;
     }
    public float getDiametro(){
        return Diametro;    
    }
    public float getPrecion(){
        return Presion;
       }        

       @Override
       public boolean equals(Object obj) {
        if(this == obj)
        return true;
        if(obj == null|| getClass() != obj.getClass())
        return false;
        
        Llanta llanta = (Llanta)obj;
        if(Float.compare(taht.ancho, this.ancho)!=0) 
        return false;
        if(Float.compare(that.diametro, this.diametro)!=0) 
        return false;
    return Float.compare(that.presion, this.presion)==0;

       }
 

 }

    
        
    
    

