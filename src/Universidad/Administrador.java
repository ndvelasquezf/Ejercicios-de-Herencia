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
public class Administrador extends Empleado {
    
    private String puesto;

    public Administrador(String puesto, String jefe, String nombre, String domicilio, String horario) {
        super(jefe, nombre, domicilio, horario);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void administrar(){
        System.out.println("Incia jornada de administración a las 8:00 am y termina a las 6:00 pm");
    }

    @Override
    public String toString() {
        return "Administrador: " +super.toString()+ " puesto= " + puesto ;
    }
    
}
