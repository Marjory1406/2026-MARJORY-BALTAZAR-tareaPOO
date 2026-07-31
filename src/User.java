public class User {
    // ATRIBUTOS
    private String nombre;
    private String email;
    private int edad;
    private String pais;
    private String idioma;
    private Playlist playlist;

    //METODOS
    public User(String nombre, String email, int edad, String pais, String idioma, Playlist playlist){
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.pais = pais;
        this.idioma = idioma;
        this.playlis= new Playlist();
    }
    public String getNombre(){
        return nombre;
    }
    public String getEmail(){
        return email;
    }
    public int getEdad(){
        return edad;
    }
    public String getPais(){
        return pais;
    }

    public Playlist getPlaylist() {
        return playlist;
    }
}
