/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author Nicolás Velásquez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle t= new Triangle(2.5,4,3);
        Rectangle r= new Rectangle(5,3,4);
        System.out.println("Area del triangulo: "+t.getArea());
        System.out.println("Perimetro del triangulo: "+t.getPerimeter());
        System.out.println("Area del rectangulo: "+r.getArea());
        System.out.println("Perimetro del rectangulo: "+r.getPerimeter());
    }
    
}
