/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author Nicolás Velásquez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UI mostrar = new UI();
        java.util.Scanner lec= new java.util.Scanner(System.in);
        System.out.println("Desea continuar 1, desea salir 0");
        int opc = lec.nextInt();
        while(opc==1){
            mostrar.Menu();
            System.out.println("Desea continuar 1, desea salir 0");
            opc = lec.nextInt();
        }
    }
    
}
