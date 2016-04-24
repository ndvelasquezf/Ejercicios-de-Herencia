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
public abstract class Pizza {
    
    private String masa, salsa, ingredientes[];
    
    void print (){
        System.out.println("Tipo de masa: " + masa + "\nTipo de salsa: " + salsa);
        System.out.println("Ingredientes:");
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println("* " + ingredientes[i]);
        }
        System.out.println("");
    }
    abstract void preparar ( );
    
    private void hornear ( ) {
        System.out.println ( "Se ha horneado la pizza en 20 minutos." );
    }
    
    private void cortar ( ) {
        int porciones = 4 + ((int)(Math.random()*7)); //[4,10]
        System.out.println ( "Se ha cortado la pizza en " + porciones + " porciones." );
    }
    
    private void empacar ( ) {
        if ( Math.random() < 0.5 )
            System.out.println("Se ha utilizado el empaque rojo." );
        else
            System.out.println("Se ha utilizado el empaque azul." );
    }

    Pizza ( String masa, String salsa, String[] ingredientes ) {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
        preparar();
        print();
        hornear();
        cortar();
        empacar();
    }
}
