/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

import composicion.autor.Autor;
import composicion.editorial.Editorial;
import composicion.libro.Libro;

/**
 *
 * @author Luis Fernando
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Asignamos todos los datos del libro
        Libro lib = new Libro();
        lib.setNombreLib("Elden God");
        lib.setIdioma("Español");
        lib.setPaginas(452);
        lib.setEscritor(new Autor("Godfrey R. M.", "20 de septiembre de 1948", "22 de septiembre del 2019"));
        lib.setEditora(new Editorial("FromLibrary", 2022, 55236996));
        
        System.out.println(lib);
        
        lib.abrir();
        
        //Creamos objetos para llamar a los metodos de las clases "Autor" y "Editorial"
        Autor escritor = new Autor();
        Editorial edit = new Editorial();
        
        escritor.portada();
        edit.leer();
    }
    
}
