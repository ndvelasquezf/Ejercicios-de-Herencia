/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author Rodrigo Velasquez
 */
public class PepperonniPizza extends Pizza {
    
    void preparar ( ) {
        System.out.println("Preparando pizza de Pepperonnni.");
    }
    
    public PepperonniPizza () {
        super(
                "Regular",
                "Tomate",
                new String[] { "Rodajas de pepperonni", "Rodajas de cebolla", 
                    "Queso parmesano rallado" }
        );
    }
}

