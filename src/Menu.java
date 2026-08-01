import java.util.Scanner;

public class Menu {

    private Scanner sc;

    public Menu(){
        this.sc = new Scanner(System.in);
    }

    //creación de usuario se llamara al inicio del programa
    public User crearUser(){
        System.out.println("REGISTRO USUARIO");

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su dirección de correo: ");
        String email = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese su país: ");
        String pais = sc.nextLine();

        System.out.println("Ingrese su idioma preferido: ");
        String idioma = sc.nextLine();

        return new User(nombre, email, edad, pais, idioma);
    }

    public void showMenu(User user, Pelicula p1, Pelicula p2, Pelicula p3, Pelicula p4, Pelicula p5) {
        int option = -1;

        while (option != 0) {
            System.out.println("\n Hola " + user.getNombre() + "\n Qué te gustaria hacer hoy? ");
            System.out.println("1. Ver peliculas disponibles ");
            System.out.println("2. Mi Playlist ");
            System.out.println("0. Exit ");
            option = sc.nextInt();

            if (option == 1) {
                Pelicula escogida = peliculaEscogida(p1, p2, p3, p4, p5);
                if (escogida != null) {
                    ejecutar(user, escogida);
                }
            } else if (option == 2) {
                showPlaylist(user);
            }
        }
        System.out.println("Exit");
    }
    private Pelicula peliculaEscogida(Pelicula p1, Pelicula p2, Pelicula p3, Pelicula p4, Pelicula p5){
        System.out.println("\n1." + p1.getNombre() + " (" + p1.getCategoria() + ") ");
        System.out.println("\n2." + p2.getNombre() + " (" + p2.getCategoria() + ") ");
        System.out.println("\n3." + p3.getNombre() + " (" + p3.getCategoria() + ") ");
        System.out.println("\n4." + p4.getNombre() + " (" + p4.getCategoria() + ") ");
        System.out.println("\n5." + p5.getNombre() + " (" + p5.getCategoria() + ") ");
        System.out.println("Escoge una pelicula: ");
        int num = sc.nextInt();

        if (num == 1){
            return p1;
        }
        else if (num == 2){
            return p2;
        }
        else if (num == 3){
            return p3;
        }
        else if (num == 4){
            return p4;
        }
        else if (num == 5){
            return p5;
        }
        else{
            System.out.println("Pelicula no encontrada");
            return null;
        }
    }
    private void ejecutar(User user, Pelicula pelicula){
        System.out.println("\nEstás viendo: " + pelicula.getNombre());
        System.out.println("1. Play");
        System.out.println("2. Stop");
        System.out.println("3. Agregar a la Playlist ver más tarde");
        System.out.println("Selecciona una opción: ");
        int action = sc.nextInt();

        if (action == 1){
            user.getPlaylist().setVistas(pelicula);
            System.out.println(pelicula.getNombre() + "se ha marcado como vista en tu Playlist");
        }
        else if (action == 2){
            user.getPlaylist().setSeguirViendo(pelicula);
            System.out.println("Puedes encontrar " + pelicula.getNombre() + " en tu Playlist seguir viendo");
        }
        else if (action == 3){
            user.getPlaylist().setVerMasTarde(pelicula);
            System.out.println(pelicula.getNombre() + " guardada exitosamente en tu lista de reproducción Ver más tarde");
        }
        else{
            System.out.println("Opción invalida");
        }
    }

    private void showPlaylist(User user){
        System.out.println("\n Mi Playlist ");

        Pelicula vista = user.getPlaylist().getVistas();
        Pelicula masTarde = user.getPlaylist().getVerMasTarde();
        Pelicula viendo = user.getPlaylist().getSeguirViendo();

        if (vista != null){
            System.out.println("Pelicula vista: " + vista.getNombre());
        }
        else{
            System.out.println("Pelicula vista: (vacío)");
        }
        if (masTarde != null){
            System.out.println("Ver más tarde: " + masTarde.getNombre());
        }
        else{
            System.out.println("Ver más tarde: (vacío)");
        }
        if (viendo != null){
            System.out.println("Seguir viendo: " + viendo.getNombre());
        }
        else{
            System.out.println("Seguir viendo: (vacío)");
        }
    }

}