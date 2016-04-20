/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author PC
 */
public class Usuario {
    
    private String apellido;
    private String nombre;
    private String direccion;
    private int prestamo;

    public Usuario(String apellido, String nombre, String direccion, int prestamo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.prestamo=prestamo;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "apellido=" + apellido + ", nombre=" + nombre + ", direccion=" + direccion + ", articulos prestados= "+prestamo+ '}';
    }
    
    
}
