/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alien;

/**
 *
 * @author Rodrigo Velasquez
 */
public class Alien {
        
    static boolean transformar = false;
    static int numeroOjos;
    static double altura;
    static String tipoAlien;
    static String transf;

    public Alien(int numeroOjos, double altura, String tipoAlien, boolean transformar) {
        this.numeroOjos = numeroOjos;
        this.altura = altura;
        this.tipoAlien = tipoAlien;
        this.transformar = transformar;
    }

	public void transformar() {
            
		if (this.transformar == true) {
			this.transf = "el alien puede cambiar de forma.";
		} else {
			this.transf = "el alien no puede cambiar de forma.";
		}
	}

	@Override
	public String toString() {
		return "El alien es un "+ this.tipoAlien + ", tiene " + this.numeroOjos + " ojos y mide " + this.altura + " mts, además "
				+ this.transf;
	}
    
}
