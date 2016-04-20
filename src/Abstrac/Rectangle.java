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
public class Rectangle extends Shape{
    
   private double width;
   private double heigth;

    public Rectangle(double width, double heigth, int numSides) {
        super(numSides);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return (this.heigth*this.width);
    }

    @Override
    public double getPerimeter() {
        return ((this.heigth*2)+(this.width*2));
    }
    
}
