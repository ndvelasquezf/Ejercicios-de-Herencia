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
public class Empleado extends Persona {
    
    java.util.Scanner lec= new java.util.Scanner(System.in);
    private String jefe;

    public Empleado(String jefe, String nombre, String domicilio, String horario) {
        super(nombre, domicilio, horario);
        this.jefe = jefe;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }
    
    public void cobrar(){
        System.out.print("Ingrese sueldo base: ");
        double sueldo = lec.nextDouble();
        System.out.println("El total a pagar es= "+(sueldo+(sueldo*0.05))+" con el incremento de subsidio de transporte");
    }

    @Override
    public String toString() {
        return super.toString()+ " jefe= " + jefe ;
    }
    
}
