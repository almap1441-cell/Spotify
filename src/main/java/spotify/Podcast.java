/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

/**
 *
 * @author almap
 */

// la clase Podcast hereda de la clase Contenido.
public class Podcast extends Contenido {

    // nombre del conductor del podcast
    private String conductor;

    // nmero del episodio
    private int episodio;

    // constructor
    public Podcast(String titulo, double duracion, String conductor, int episodio) {

        // llamamos al constructor de la clase padre
        super(titulo, duracion);

        // guardamos el conductor
        this.conductor = conductor;

        // guardamos el episodio
        this.episodio = episodio;

    }

    // GETTERS

    // devuelve el conductor
    public String getConductor() {
        return conductor;
    }

    // devuelve el numero de episodio
    public int getEpisodio() {
        return episodio;
    }

    //SETTERS

    // permite modificar el conductor
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    // permite modificar el episodio
    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    // implementamos el metodo abstracto
    @Override
    public void reproducir() {

        System.out.println("Reproduciendo podcast [ID "
            + getIdContenido()
            + "]: "
            + getTitulo());

    }

    // sobrescribimos el método toString().
    @Override
    public String toString() {

        return super.toString()
                + " | Conductor: " + conductor
                + " | Episodio: " + episodio;

    }

}
