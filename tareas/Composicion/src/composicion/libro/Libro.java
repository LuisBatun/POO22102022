/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion.libro;

import composicion.autor.Autor;
import composicion.editorial.Editorial;

/**
 *
 * @author Luis Fernando
 */
public class Libro {
    private String nombre;
    private String idioma;
    private int paginas;
    private Autor escritor;
    private Editorial editora;

    public Libro() {
    }

    public Libro(String nombre, String idioma, int paginas, Autor escritor, Editorial editora) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.paginas = paginas;
        this.escritor = escritor;
        this.editora = editora;
    }

    public Editorial getEditora() {
        return editora;
    }

    public void setEditora(Editorial editora) {
        this.editora = editora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombreLib(String nombreLib) {
        this.nombre = nombreLib;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", idioma=" + idioma + ", paginas=" + paginas + ", escritor=" + escritor + ", editora=" + editora + '}';
    }
    
    public void abrir(){
        System.out.println("Abriendo libro...");
    }
    
}
