/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

/**
 *
 * @author almap
 */

// Clase Usuario.
public class Usuario {

    // ID del usuario
    private final int idUsuario;

    // nombre del usuario
    private String nombre;

    // tipo de cuenta
    private String tipoCuenta;

    // contador de usuarios
    private static int contadorUsuarios;

    // constructor.
    public Usuario(String nombre, String tipoCuenta) {

        // generamos el ID automáticamente
        this.idUsuario = ++contadorUsuarios;
        // guardamos el nombre recibido en la variable nombre
        this.nombre = nombre;
        // guardamos el tipo de cuenta recibido
        this.tipoCuenta = tipoCuenta;

    }

    // GETTERS
    // el metodo devuelve el id del usuario
    // no existe setter porque el id no debe cambiar del ususario
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    // toString()
    // mostrar la informacin del usuario de una forma ms ordenada.
    @Override
    public String toString() {

        return "ID Usuario: " + idUsuario
                + " | Nombre: " + nombre
                + " | Tipo de cuenta: " + tipoCuenta;

    }

}