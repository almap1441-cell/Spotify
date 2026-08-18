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

/**
 *
 * @author almap
 */
public class Spotify {

    public static void main(String[] args) {

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

                // Si el usuario elige la opción 1
                case 1 -> {

                    // pedimos el titulo de la cancion
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    // variable para guardar la duracion
                    double duracion;

                    // repetimos hasta que el usuario escriba un numero valido
                    while (true) {

                        // pedimos la duracion
                        System.out.print("Duración (minutos): ");

                        // verificamos si el dato es un numero
                        if (sc.hasNextDouble()) {

                            // guardamos la duracion
                            duracion = sc.nextDouble();

                            // limpiamos el buffer
                            sc.nextLine();

                            // terminamos el ciclo
                            break;

                        } else {

                            // mostramos un mensaje de error
                            System.out.println("Ingrese una duración valida.");

                            // limpiamos el dato incorrecto
                            sc.nextLine();

                        }

                    }

                    // pedimos el nombre del artista
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();

                    // pedimos el genero musical
                    System.out.print("Género: ");
                    String genero = sc.nextLine();

                    // creamos un objeto Cancion utilizando
                    // los datos que escribio el usuario
                    Cancion cancion = new Cancion(titulo, duracion, artista, genero);

                    // agregamos la cancion a la playlist
                    playlist.agregarContenido(cancion);

                    // mostramos un mensaje de confirmacion
                    System.out.println("Canción agregada correctamente.");

                }
                // Si el usuario elige la opción 2
                case 2 -> {

                    // pedimos el titulo del podcast
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    // variable para guardar la duracion
                    double duracion;

                    // repetimos hasta que el usuario escriba un numero valido
                    while (true) {

                        // pedimos la duracion
                        System.out.print("Duración (minutos): ");

                        // verificamos si el dato es un numero
                        if (sc.hasNextDouble()) {

                            // guardamos la duracion
                            duracion = sc.nextDouble();

                            // limpiamos el buffer
                            sc.nextLine();

                            // terminamos el ciclo
                            break;

                        } else {

                            // mostramos un mensaje de error
                            System.out.println("Ingrese una duración valida.");

                            // eliminamos el dato incorrecto
                            sc.nextLine();

                        }

                    }

                    // pedimos el nombre del conductor
                    System.out.print("Conductor: ");
                    String conductor = sc.nextLine();

                    // variable para guardar el episodio
                    int episodio;

                    // repetimos hasta que el usuario escriba un numero entero
                    while (true) {

                        // pedimos el numero de episodio
                        System.out.print("Numero de episodio: ");

                        // verificamos si el dato es un numero entero
                        if (sc.hasNextInt()) {

                            // guardamos el episodio
                            episodio = sc.nextInt();

                            // limpiamos el buffer
                            sc.nextLine();

                            // terminamos el ciclo
                            break;

                        } else {

                            // mostramos un mensaje de error
                            System.out.println("Ingrese un numero de episodio valido.");

                            // eliminamos el dato incorrecto
                            sc.nextLine();

                        }

                    }

                    // creamos el objeto Podcast
                    Podcast podcast = new Podcast(titulo, duracion, conductor, episodio);

                    // agregamos el podcast a la playlist
                    playlist.agregarContenido(podcast);

                    // mostramos un mensaje de confirmacion
                    System.out.println("Podcast agregado correctamente.");

                }
                                // Si el usuario elige la opcion 3
                case 3 -> {

                    // verificamos si la playlist esta vacia
                    if (playlist.getContadorContenidos() == 0) {

                        // mostramos un mensaje
                        System.out.println("La playlist esta vacia.");

                    } else {

                        // mostramos toda la informacion de la playlist
                        playlist.mostrarPlaylist();

                    }

                }
                                // Si el usuario elige la opcion 4
                case 4 -> {

                    // verificamos si la playlist tiene contenidos
                    if (playlist.getContadorContenidos() == 0) {

                        // mostramos un mensaje
                        System.out.println("No hay contenidos para reproducir.");

                    } else {

                        // mostramos un mensaje
                        System.out.println("\nReproduciendo playlist...\n");

                        // obtenemos el arreglo de contenidos
                        Contenido[] lista = playlist.getContenidos();

                        // recorremos todos los contenidos
                        for (int i = 0; i < playlist.getContadorContenidos(); i++) {

                            // mostramos el ID del contenido que se reproduce
                            System.out.println("ID: " + lista[i].getIdContenido());

                            // reproducimos el contenido
                            lista[i].reproducir();

                        }

                    }

                }
                                // Si el usuario elige la opcion 5
                case 5 -> {

                    // verificamos si la playlist esta vacia
                    if (playlist.getContadorContenidos() == 0) {

                        // mostramos un mensaje
                        System.out.println("La playlist esta vacia.");

                    } else {

                        // pedimos el ID del contenido
                        System.out.print("Ingrese el ID del contenido: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        // obtenemos el arreglo de contenidos
                        Contenido[] lista = playlist.getContenidos();

                        // variable para saber si encontramos el contenido
                        boolean encontrado = false;

                        // recorremos todos los contenidos
                        for (int i = 0; i < playlist.getContadorContenidos(); i++) {

                            // verificamos si el ID coincide
                            if (lista[i].getIdContenido() == id) {

                                // mostramos el contenido encontrado
                                System.out.println("\nContenido encontrado:");
                                System.out.println(lista[i]);

                                // reproducimos el contenido
                                lista[i].reproducir();

                                // cambiamos la variable
                                encontrado = true;

                                // salimos del ciclo
                                break;

                            }

                        }

                        // si no se encontro el ID
                        if (!encontrado) {

                            System.out.println("No existe un contenido con ese ID.");

                        }

                    }

                }
                                // Si el usuario elige la opcion 6
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