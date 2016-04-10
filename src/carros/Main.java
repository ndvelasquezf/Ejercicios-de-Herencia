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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autolujo lujo = new Autolujo(3,2345,"BMW",2015,20000);
        Camioneta camioneta = new Camioneta(520,5,1200,65753,"Renault",2012,12000);
        Autocompacto compacto = new Autocompacto (4,5653,"Toyota",2014,10000);
        Vagoneta vagoneta = new Vagoneta (7,4327,"Hipie",1998,15000);
        
        System.out.println(lujo.toString());
        System.out.println(camioneta.toString());
        System.out.println(compacto.toString());
        System.out.println(vagoneta.toString());
              
    }
    
}
