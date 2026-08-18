/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotifyGestion;

import spotify.Contenido;
import spotify.Usuario;

/**
 *
 * @author almap
 */
// la clase almacenara la informacin de cada playlist creada por un usuario
public class Playlist {

    // declaramos el id de la playlist
    // es final porque una vez asignado ya no podra modificarse
    private final int idPlaylist;

    // variable donde guardaremos el nombre de la playlist
    private String nombre;

    // variable donde guardaremos el usuario dueño de la playlist
    private Usuario usuario;

    // declaramos un arreglo de tipo Contenido
    // aqui se almacenarsan canciones y podcasts
    private Contenido[] contenidos; //poliformismo

    // variable para llevar el control de cuantos contenidos se han agregado
    private int contadorContenidos;

    // variable estatica para generar los ids automáticamente
    private static int contadorPlaylist;

    // constante que indica el numero maximo de contenidos
    private static final int MAX_CONTENIDOS = 20;

    // constructor de la clase Playlist
    // rcibe el nombre de la playlist y el usuario propietario
    public Playlist(String nombre, Usuario usuario) {

        // incrementamos el contador y lo asignamos como id
        this.idPlaylist = ++contadorPlaylist;

        // guardamos el nombre.
        this.nombre = nombre;

        // guardamos el usuario
        this.usuario = usuario;

        // creo el arreglo donde se almacenaran los contenidos.
        this.contenidos = new Contenido[MAX_CONTENIDOS];

    }

    // metodo para agregar una cancin o un podcast
    public void agregarContenido(Contenido contenido) {

        // verificamos que todavia exista espacio en el arreglo
        if (contadorContenidos < MAX_CONTENIDOS) {

            // guardamos el contenido
            contenidos[contadorContenidos] = contenido;

            // aumentamos el contador
            contadorContenidos++;

        } else {

            // si el arreglo ya esta lleno mostramos un mensaje
            System.out.println("La playlist ya alcanzó el límite de contenidos.");

        }

    }

    // metodo para calcular la duracion total de la playlist
    public double calcularDuracionTotal() {

        // variable donde acumularemos los minutos
        double total = 0;

        // recorre todo el arreglo
        for (int i = 0; i < contadorContenidos; i++) {

            // sumamos la duracion de cada contenido
            total += contenidos[i].getDuracion();

        }

        // regresa el total
        return total;

    }

    // metodo para mostrar toda la informacin de la playlist
    public void mostrarPlaylist() {

        // mostramos el id
        System.out.println("ID Playlist: " + idPlaylist);

        // mostramos el nombre
        System.out.println("Nombre: " + nombre);

        // mostramos el usuario
        System.out.println("Usuario: " + usuario.getNombre());

        // mostramos la duracion total
        System.out.println("Duración total: " + calcularDuracionTotal() + " minutos");

        System.out.println("\nCONTENIDO ");

        // recorremos el arreglo para mostrar cada contenido
        for (int i = 0; i < contadorContenidos; i++) {

            System.out.println(contenidos[i]);

        }

    }

    // GETTERS
    // devuelve el id de la playlist
    public int getIdPlaylist() {
        return idPlaylist;
    }

    // devuelve el nombre
    public String getNombre() {
        return nombre;
    }

    // devuelve el usuario
    public Usuario getUsuario() {
        return usuario;
    }

    //SETTERS

    // permite modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // permite modificar el usuario
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    // Devuelve el arreglo de contenidos.
    public Contenido[] getContenidos() {
        return contenidos;
    }

     // Devuelve cuántos contenidos tiene la playlist.
    public int getContadorContenidos() {
        return contadorContenidos;
    }

    // sobrescribimos el metodo toString()
    @Override
    public String toString() {

        return "Playlist {ID: "
                + idPlaylist
                + ", Nombre: "
                + nombre
                + ", Usuario: "
                + usuario.getNombre()
                + "}";

    }

}
