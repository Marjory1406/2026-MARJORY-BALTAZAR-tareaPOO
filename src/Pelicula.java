public class Pelicula {
    private String nombre;
    private Categoria categoria;
    private String restricciones;
    private String idioma;
    private String duracion;

    public Pelicula(String nombre, Categoria categoria, String restricciones, String idioma, String duracion){
        this.nombre=nombre;
        this.categoria= categoria;
        this.restricciones=restricciones;
        this.idioma=idioma;
        this.duracion=duracion;
    }

    public String getNombre(){
        return nombre;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public String getRestricciones(){
        return restricciones;
    }

    public String getIdioma(){
        return idioma;
    }

    public String getDuracion(){
        return duracion;
    }

}
