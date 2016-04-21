/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alien;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Velasquez
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
            	int ojos;
		double altura;
		boolean transformar = false;
            
		Scanner in = new Scanner ( System.in ); 
		int opcion;
		Alien alien = null;
		Alien alien_2 = null;

		while ( true ) {
			System.out.println();
			System.out.println("1. Crear Marciano.");
			System.out.println("2. Crear Jupiteriano.");
			System.out.println("3. Mostrar Aliens creados.");
			System.out.println("4. Salir.");
			opcion = in.nextInt();

			if ( opcion == 4 ) break;           
			switch ( opcion ) {

			case 1:
				System.out.println("Ingrese el número de ojos del Alien.");
				ojos = in.nextInt();
				System.out.println("Ingrese la altura del Alien.");
				altura = in.nextDouble();
				System.out.println("Ingrese 'true' si quiere que su Alien se transforme o 'false' en caso contrario.");
				transformar = false; 
				
				try {
					transformar = in.nextBoolean();
				} catch (Exception e) {
					System.out.println("Recuerde sólo ingresar true o false.");
				}

				alien = new Marte(ojos, altura, "Marciano", transformar);

				break;

			case 2:
				System.out.println("Ingrese el número de ojos del Alien.");
				int ojos_2 = in.nextInt();
				System.out.println("Ingrese la altura del Alien.");
				double altura_2 = in.nextDouble();
				System.out.println("Ingrese 'true' si quiere que su Alien se transforme o 'false' en caso contrario.");
				boolean transformar_2 = in.nextBoolean();

				alien_2 = new Jupiter(ojos_2, altura_2, "Jupiteriano", transformar_2);

				break;

			case 3:

				if (alien != null){
					alien.transformar();
					System.out.println(alien.toString());
				}


				if (alien_2 != null) {
					alien_2.transformar();
					System.out.println(alien_2.toString());	
				}

			}

		}
	}
}
