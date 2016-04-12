/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.Scanner;

/**
 *
 * @author Nicolás Velásquez
 */
public class UI {
    
    private Scanner sc;
    Administrador admi = new Administrador("Secretaria","Julio Iglesias","Karen Plazas","Calle 25° #32-23","Tipo oficina");
    Profesor profe = new Profesor("Ing. Electrónica","Ignacio Mantilla","Jan Bacca","Cra 157° #23-1","Mañana");
    Estudiante estudiante = new Estudiante(12,"Tarde","Jose Pulido","Av Dorado #21-8","Jornada unica");

    public UI() {
        this.sc = new Scanner(System.in);
    }
    
    public void Menu(){
        System.out.println("Bienvenido a la Universidad Nacional");
        System.out.println("Par realizar acciones digite 1, para mostrar digite 2");
        int opc = this.sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Opciones= para estudiante:1, para administrador 2, para profesor 3");
                int aux = this.sc.nextInt();
                switch (aux){
                    case 1:
                        System.out.println("Asistencia:");
                        estudiante.asistir();
                        System.out.println("Estudio:");
                        estudiante.estudiar();
                        break;
                    case 2:
                        System.out.println("Asistencia:");
                        admi.asistir();
                        System.out.println("Cobrar:");
                        admi.cobrar();
                        System.out.println("Administrar:");
                        admi.administrar();
                        break;
                    case 3:
                        System.out.println("Asistencia:");
                        profe.asistir();
                        System.out.println("Cobrar:");
                        profe.cobrar();
                        System.out.println("Enseñar:");
                        profe.enseñar();
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("Opciones= para estudiante:1, para administrador 2, para profesor 3");
                int i = this.sc.nextInt();
                switch (i){
                    case 1:
                        System.out.println(estudiante.toString());
                        break;
                    case 2:
                        System.out.println(admi.toString());
                        break;
                    case 3:
                        System.out.println(profe.toString());
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }
    
}
