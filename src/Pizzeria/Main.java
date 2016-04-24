/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

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
        int opcion;
        Scanner in = new Scanner ( System.in );
        while ( true ) {
            System.out.println();
            System.out.println("1. Pedir Pizza de Pepperonni.");
            System.out.println("2. Pedir Pizza de Queso.");
            System.out.println("3. Pedir Pizza Vegetariana.");
            System.out.println("4. Salir.");
            opcion = in.nextInt();
            System.out.println("");
            
            if ( opcion == 0 ) break;
            Pizza p = null;
            switch ( opcion ) {

                case 1:
                    p = new PepperonniPizza();
                                        
                    break;
                case 2:
                    p = new CheesePizza();
                                        
                    break;
                case 3:
                    p = new VegetarianPizza();
                                       
                    break;
                case 4:
                    
                    return;
    }
    
}
}
}
