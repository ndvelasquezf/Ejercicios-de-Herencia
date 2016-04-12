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
public class Profesor extends Empleado{
    
    private String carrera;

    public Profesor(String carrera, String jefe, String nombre, String domicilio, String horario) {
        super(jefe, nombre, domicilio, horario);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void enseñar (){
        System.out.println("Debe realizar el parcial hoy, y calificar los laboratorios.");
    }

    @Override
    public String toString() {
        return "Profesor: " +super.toString()+ " carrera= " + carrera ;
    }
    
}
