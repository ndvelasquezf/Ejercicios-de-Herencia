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
public class CheesePizza extends Pizza {
    
    void preparar ( ) {
        System.out.println("Preparando pizza de queso.");
    }
    
    public CheesePizza() {
        super(
                "Corteza regular",
                "Tomate",
                new String[] { "Queso mozzarella fresco", "Parmesano" }
        );
    }
}
