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
        
        // Se elimina la línea "return null;" ya que el método es void
    }
}
    

