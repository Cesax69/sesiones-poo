package mx.utng.ej1;

public abstract class Persona {
    private String nombre; 
    private String apellidos;

    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void mostrarDatos(){ 
        System.out.printf("Persona:%nNombre: %s%nApellidos: %s%n", nombre, apellidos);

    }

    public abstract void vivir();

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    }
