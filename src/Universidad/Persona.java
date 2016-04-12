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
public class Persona {
    
    java.util.Scanner lec= new java.util.Scanner(System.in);
    
    private String nombre;
    private String domicilio;
    private String horario;

    public Persona(String nombre, String domicilio, String horario) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void asistir (){
        int dia, mes , año;
        System.out.print("Ingrese Día");
        dia = lec.nextInt();
        System.out.print("Ingrese Mes");
        mes = lec.nextInt();
        System.out.print("Año");
        año = lec.nextInt();
        System.out.println("Asistio el día "+dia+" del mes de "+mes+" del año "+año);
    }

    @Override
    public String toString() {
        return  "nombre= " + nombre + ", domicilio= " + domicilio + ", horario= " + horario ;
    }
    
    
}
