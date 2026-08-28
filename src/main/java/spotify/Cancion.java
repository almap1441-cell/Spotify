/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

/**
 *
 * @author almap
 */

// la clase cancion hereda de la clase Contenido
public class Cancion extends Contenido {
    // las clases hijas tiene muy buena estructura y orden estas no se modifican

    // variable para guardar el nombre del artista
    private String artista;

    // variable para guardar el genero musical
    private String genero;

    // constructor de la clase Cancion
    public Cancion(String titulo, double duracion, String artista, String genero) {

        // llamamos al constructor de la clase padre
        super(titulo, duracion);

        // guardamos el artista
        this.artista = artista;

        // Guardamos el género.
        this.genero = genero;
    }

    // GETTERS

    // devuelve el nombre del artista
    public String getArtista() {
        return artista;
    }

    // devuelve el genero musical
    public String getGenero() {
        return genero;
    }

    // SETTERS

    // permite modificar el artista
    public void setArtista(String artista) {
        this.artista = artista;
    }

    // permite modificar el genero
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // implementamos el mtodo abstracto reproducir()
    @Override
    public void reproducir() {

        System.out.println("Reproduciendo canción [ID "
            + getIdContenido()
            + "]: "
            + getTitulo());

    }

    // sobrescribimos el metodo toString()
    @Override
    public String toString() {

        return super.toString()
                + " | Artista: " + artista
                + " | Género: " + genero;

    }
    
   
}
