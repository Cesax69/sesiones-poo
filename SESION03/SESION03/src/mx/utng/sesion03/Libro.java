package mx.utng.sesion03;

public class Libro {
    private String titulo;
    private Autor autor;
    private int anio;
    private int numeroPginas;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getNumeroPginas() {
        return numeroPginas;
    }
    public void setNumeroPginas(int numeroPginas) {
        this.numeroPginas = numeroPginas;
    }
    

}
