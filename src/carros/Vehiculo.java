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
public class Vehiculo {
    
    public int seriemotor;
    public String marca;
    public int año;
    public double precio;

    public Vehiculo(int seriemotor, String marca, int año, double precio) {
        this.seriemotor = seriemotor;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "numero de serie del motor= " + seriemotor + ", marca= " + marca + ", año= " + año + ", precio(US)= " + precio ;
    }
}
