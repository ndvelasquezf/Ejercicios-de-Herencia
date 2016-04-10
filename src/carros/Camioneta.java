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
public class Camioneta extends Vehiculo {
    
    public double carga;
    public int ejes;
    public double rodadas;

    public Camioneta(double carga, int ejes, double rodadas, int seriemotor, String marca, int año, double precio) {
        super(seriemotor, marca, año, precio);
        this.carga = carga;
        this.ejes = ejes;
        this.rodadas = rodadas;
    }

    @Override
    public String toString() {
        return "Camioneta: " + super.toString()+", carga maximá(Kg)= " + carga + ", numero de ejes= " + ejes + ", Km rodados= " + rodadas;
    }
}
