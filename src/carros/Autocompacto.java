/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author Nicolás Velásquez
 */
public class Autocompacto extends Vehiculo {
    
    public int pasajeros;

    public Autocompacto(int pasajeros, int seriemotor, String marca, int año, double precio) {
        super(seriemotor, marca, año, precio);
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Auto compacto: " +super.toString()+ ", numero de pasajeros= " + pasajeros;
    }
}
