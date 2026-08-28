/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotifyApp;

// Importo Scanner
import java.util.Scanner;
import spotify.Cancion;
import spotify.Contenido;
import spotifyGestion.Playlist;
import spotify.Podcast;
import spotify.Usuario;
import spotify.metodosm;

/**
 *
 * @author almap
 */
public class Spotify {

    public static void main(String[] args) {
        // se realizo la reduccion del menu para evitar que se 

        // creamos el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // creamos un objeto de tipo Usuario
        // el propietario de la playlist
        Usuario usuario = new Usuario("Alma", "Premium");

        // creamos una playlist y le asignamos un nombre y un usuario
        Playlist playlist = new Playlist("Mis Favoritas", usuario);

        // declaramos una variable para guardar la opción del menu
        int opcion;

        // utilizamos un ciclo do while para que el menu se repita
        do {

            System.out.println("\n SPOTIFY ");
            System.out.println("1. Agregar canción");
            System.out.println("2. Agregar podcast");
            System.out.println("3. Mostrar playlist");
            System.out.println("4. Reproducir todo");
            System.out.println("5. Reproducir contenido por ID");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            // guardamos la opcion seleccionada
            opcion = sc.nextInt();

            // limpiamos el buffer
            sc.nextLine();

            // utilizamos un switch para ejecutar
            // la opcion elegida por el usuario
            switch (opcion) {
             case 1 -> metodosm.agregarCancion(sc, playlist);
             case 2 -> metodosm.agregarPodcast(sc, playlist);
             case 3 -> metodosm.mostrarPlaylist(playlist);
             case 4 -> metodosm.reproducirTodo(playlist);
             case 5 -> metodosm.reproducirPorId(sc, playlist);
                
                case 6 -> {
                    // mostramos un mensaje de despedida
                    System.out.println("Gracias por utilizar Spotify.");
                }
                // Si el usuario escribe una opcion diferente
                default -> {
                    // mostramos un mensaje indicando que la opcion es incorrecta
                    System.out.println("Opción inválida.");
                }
            }
        // el ciclo terminara unicamente cuando el usuario escriba 6
        } while (opcion != 6);
        // cerramos el objeto Scanner para liberar recursos
        sc.close();
    }

}