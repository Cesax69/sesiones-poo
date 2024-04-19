package mx.utng.ej1;

import java.time.LocalDate;
public class ProfesorInterino extends Profesor {
    private LocalDate fechaTerminacion;

    public LocalDate getFechaTerminacion() {
        return fechaTerminacion;
    }

    


    public ProfesorInterino(String nombre, String apellidos, String idProfesor, LocalDate fechaTerminacion) {
        super(nombre, apellidos, idProfesor);
        this.fechaTerminacion = fechaTerminacion;
    }




    public Profesor(String nombre) {
        super(nombre);
        this.fechaTerminacion = fechaTerminacion;
    }

    @Override
public void vivir(){
    super.vivir();
    System.out.println("Como foraneo");
}

public void setFechaTerminacion(LocalDate fechaTerminacion) {

}

    
    
}
