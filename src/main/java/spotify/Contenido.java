/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify; // Indicamos que esta clase pertenece al paquete spotify

/**
 *
 * @author almap
 */

//  es abstracta porque no se crearn objetos directamente de ella
// clase padre para las clases cancion y podcast
public abstract class Contenido {

    // declaro el id del contenido
    // es final porque una vez asignado ya no podra cambiar
    private final int idContenido;

    // variable para guardar el título del contenido
    private String titulo;

    // Variable para guardar la duracion del contenido en min
    private double duracion;

    // variable eststica para llevar el conteo de todos los contenidos creados
    //cada contenido tendra un id diferente
    private static int contadorContenido;

    // constructor de la clase Contenido
    // recibe como parmetros el titulo y la duracion
    public Contenido(String titulo, double duracion) {

        // increrementa el contador y lo asignamos como id del contenido
        this.idContenido = ++Contenido.contadorContenido;

        // Guardamos el titulo recibido
        this.titulo = titulo;

        // Guardamos la duracion recibida
        this.duracion = duracion;
    }

    // GETTERS

    // devuelve el id del contenido
    public int getIdContenido() {
        return idContenido;
    }

    // devuelve el título del contenido
    public String getTitulo() {
        return titulo;
    }

    // devuelve la duracion del contenido
    public double getDuracion() {
        return duracion;
    }

    // SETTERS

    // permite modificar el titulo del contenido
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // permite modificar la duracion del contenido
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    // declaramos un metodo abstracto
    // las clases hijas estaran obligadas a implementar este metodo
    public abstract void reproducir();

    // sobrescribi el metodo toString().
    // Eel metodo servira para mostrar la informacion del contenido
    @Override
    public String toString() {

        // regresamos una cadena con todos los datos del contenido
        return "ID: " + this.idContenido
                + " | Titulo: " + this.titulo
                + " | Duracion: " + this.duracion + " min";
    }

}
