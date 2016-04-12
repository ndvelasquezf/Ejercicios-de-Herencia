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
public class Estudiante extends Persona{
    
    private int grado;
    private String grupo;

    public Estudiante(int grado, String grupo, String nombre, String domicilio, String horario) {
        super(nombre, domicilio, horario);
        this.grado = grado;
        this.grupo = grupo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    public void estudiar(){
        System.out.println("Hoy presenta parcial, y entrega laboratorio.");
    }

    @Override
    public String toString() {
        return "Estudiante: " +super.toString()+ " grado= " + grado + ", grupo= " + grupo ;
    }
    
}
