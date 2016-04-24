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
public class VegetarianPizza extends Pizza {
    
    void preparar ( ) {
        System.out.println("Preparando pizza Vegetariana.");
    }
    
    public VegetarianPizza () {
        super(
                "Regular",
                "Tomate",
                new String[] { "Mozzarella", "Parmesano rallado", 
                    "Cebolla picada", "Hongos en rebanadas", 
                    "Pimienta roja en rodajas", "Aceitunas negras rebanadas"}
        );
    }
}

