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
public class Triangle extends Shape{
    
   private double width;
   private double heigth;

    public Triangle(double width, double heigth, int numSides) {
        super(numSides);
        this.width = width;
        this.heigth = heigth;
    }
   

    @Override
    public double getArea() {
        return((this.width*this.heigth)/2);
    }

    @Override
    public double getPerimeter() {//Considerando Triangulos rectangulos
        return ((Math.sqrt((this.heigth*this.heigth)+(this.width*this.width)))+this.heigth+this.width);
    }
    
}
