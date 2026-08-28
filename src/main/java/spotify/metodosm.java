/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

import java.util.Scanner;
import spotifyGestion.Playlist;

/**
 *
 * @author Avi Cervantes
 */
public class metodosm {
    public static void agregarCancion(Scanner sc, Playlist playlist) {
        
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        double duracion;

        while (true) {
            System.out.print("Duración (minutos): ");

            if (sc.hasNextDouble()) {
                duracion = sc.nextDouble();
                sc.nextLine(); // Limpiar el buffer
                break;
            } else {
                System.out.println("Ingrese una duración válida.");
                sc.nextLine(); // Limpiar dato incorrecto
            }
        }

        System.out.print("Artista: ");
        String artista = sc.nextLine();

        System.out.print("Género: ");
        String genero = sc.nextLine();

        // Crear la canción y agregarla a la playlist recibida
        Cancion cancion = new Cancion(titulo, duracion, artista, genero);
        playlist.agregarContenido(cancion);

        System.out.println("Canción agregada correctamente.");
        
        
    }
    public static void agregarPodcast(Scanner sc, Playlist playlist) {
        
        // Pedimos el título del podcast
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        // Variable para guardar la duración
        double duracion;

        // Validamos la entrada de la duración
        while (true) {
            System.out.print("Duración (minutos): ");

            if (sc.hasNextDouble()) {
                duracion = sc.nextDouble();
                sc.nextLine(); // Limpiamos el buffer
                break;
            } else {
                System.out.println("Ingrese una duración válida.");
                sc.nextLine(); // Eliminamos el dato incorrecto
            }
        }

        // Pedimos el nombre del conductor
        System.out.print("Conductor: ");
        String conductor = sc.nextLine();

        // Variable para guardar el episodio
        int episodio;

        // Validamos la entrada del número de episodio
        while (true) {
            System.out.print("Número de episodio: ");

            if (sc.hasNextInt()) {
                episodio = sc.nextInt();
                sc.nextLine(); // Limpiamos el buffer
                break;
            } else {
                System.out.println("Ingrese un número de episodio válido.");
                sc.nextLine(); // Eliminamos el dato incorrecto
            }
        }

        // Creamos el objeto Podcast y lo agregamos a la playlist recibida
        Podcast podcast = new Podcast(titulo, duracion, conductor, episodio);
        playlist.agregarContenido(podcast);

        // Mensaje de confirmación
        System.out.println("Podcast agregado correctamente.");
    }
    
    // aca ya creamos dos metodos para subir las dos primeras opciones del menu  para que el la pagina main sea un poco mas limpio 
    // actualizamos el 3 metodo para subirlos 
    
    // aca es para mostrar el contenido de las playlist 
    public static void mostrarPlaylist(Playlist playlist) {
        
        // Verificamos si la playlist está vacía
        if (playlist.getContadorContenidos() == 0) {
            System.out.println("La playlist está vacía.");
        } else {
            // Mostramos toda la información de la playlist
            playlist.mostrarPlaylist();
        }
    }
    // aca seria el metodo 4
    
}
    

