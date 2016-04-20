/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author PC
 */
public class CD extends Soporte{
    
    private String genero;
    private int duracion;
    private Autor [] musicos;

    public CD(String genero, int duracion, Autor[] musicos, String titulo,Autor autor) {
        super(titulo);
        this.genero = genero;
        this.duracion = duracion;
        this.musicos = musicos;
        super.setAutor(autor);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Autor[] getMusicos() {
        return musicos;
    }

    public void setMusicos(Autor[] musicos) {
        this.musicos = musicos;
    }

    @Override
    public String toString() {
        return "CD{"+ super.toString()+ "genero=" + genero + ", duracion=" + duracion + ", musicos=" + musicos[0].toString() +musicos[1].toString()+ '}';
    }
    
    
    
    
}
