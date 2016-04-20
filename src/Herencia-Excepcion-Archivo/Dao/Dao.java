/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Exception.LibroException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import data.*;


/**
 * @author fabian.giraldo
 * Luego va ser mejorada
 */
public class Dao {
         
    public Autor cargarAutor(Scanner sc) {
	Autor autor = null;
	String nombre = sc.next().trim();
        String apellido = sc.next().trim();
        autor = new Autor(nombre, apellido);
        return autor;
    }
        
    public Libro cargarLibro(Scanner sc) throws LibroException{
	Libro libro = null;
	String titulo = sc.next().trim();
        
        if(titulo.length()< 5){
           throw new LibroException("Titulo incorrecto" + titulo);
        }
        Autor autor = cargarAutor(sc);
	String isbn = sc.next().trim();	
        libro = new Libro(isbn, titulo);
        libro.setAutor(autor);
         
        return libro;
    }
    
    public CD cargarCD(Scanner sc) {
        CD cd=null;
        String titulo = sc.next().trim();
        Autor musicos[] = new Autor [2];
        Autor autor = cargarAutor(sc);
        musicos[0] = cargarAutor(sc);
        musicos[1] = cargarAutor(sc);
        int duracion = sc.nextInt();
        if(duracion<10||duracion>200){
            System.out.println("Duracion no valida: " + duracion);
        }
        String genero=sc.next().trim();
        cd = new CD(genero,duracion, musicos, titulo, autor);
       
        return cd;
        
    }
    
    public Soporte leerSoporte(Scanner sc) throws LibroException{
	String type = sc.next().trim();
	if (type.equals("Libro"))
            return cargarLibro(sc);
        else if (type.equals("DVD")) 
            return cargarDVD(sc);
        else if 
                (type.equals("CD")) return cargarCD(sc);
        else {return null;} //Se debe completar
    }
	
    public ArrayList<Soporte> cargarSoportes(String archivo) throws FileNotFoundException, LibroException{
  	ArrayList<Soporte> soportes = new ArrayList<Soporte>();
	Scanner sc;
	sc = new Scanner(new File(archivo));
	sc.useDelimiter(",");
	while (sc.hasNext()) {
		soportes.add(leerSoporte(sc));
	}
	
	return soportes;
   }

    private Soporte cargarDVD(Scanner sc) {
        
        DVD dvd = null;
	String titulo = sc.next().trim();
        Autor actores[] = new Autor [2];
        Autor autor = cargarAutor(sc);
        actores[0] = cargarAutor(sc);
        actores[1] = cargarAutor(sc);
        int duracion = sc.nextInt();
        dvd = new DVD(duracion, actores, titulo, autor);
       
        return dvd;
        
    }
    
}
