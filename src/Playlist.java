public class Playlist {
    private Pelicula VerMasTarde;
    private Pelicula Vistas;
    private Pelicula SeguirViendo;

    public Playlist(){
        this.VerMasTarde=null;
        this.Vistas=null;
        this.SeguirViendo=null;
    }

    //SET
    public void setVerMasTarde(Pelicula pelicula){
        this.VerMasTarde=pelicula;
    }
    public void setVistas(Pelicula pelicula){
        this.Vistas=pelicula;
    }
    public void setSeguirViendo(Pelicula pelicula){
        this.SeguirViendo=pelicula;
    }

    // GET
    public Pelicula getVerMasTarde(){
        return VerMasTarde;
    }
    public Pelicula getVistas(){
        return Vistas;
    }
    public Pelicula getSeguirViendo(){
        return SeguirViendo;
    }
}
