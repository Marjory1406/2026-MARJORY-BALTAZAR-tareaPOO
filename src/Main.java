public class Main {
  public static void main(String[] args){

    //PELICULAS DISPONIBLES
    Pelicula p1 = new Pelicula("SpiderMan", Categoria.ACCION, "+13", "Español", "145min");
    Pelicula p2 = new Pelicula("El Conjuro", Categoria.MIEDO, "+18", "Español", "160min");
    Pelicula p3 = new Pelicula("Barbie", Categoria.COMEDIA, "+9", "Español", "120min");
    Pelicula p4 = new Pelicula("Call Me By Your Name", Categoria.ROMANCE, "+16", "Español", "160min");
    Pelicula p5 = new Pelicula("Avatar", Categoria.ACCION, "+13", "Español", "145min");

    Menu menu = new Menu();

    User user = menu.crearUser();

    menu.showMenu(user, p1,p2,p3,p4,p5);
  }
}