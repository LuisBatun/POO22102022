/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion.editorial;

/**
 *
 * @author Luis Fernando
 */
public class Editorial {
    private String nombre;
    private int edicion;
    private int numTelef;

    public Editorial() {
    }

    public Editorial(String nombre, int edicion, int numTelef) {
        this.nombre = nombre;
        this.edicion = edicion;
        this.numTelef = numTelef;
    }

    public int getNumTelef() {
        return numTelef;
    }

    public void setNumTelef(int numTelef) {
        this.numTelef = numTelef;
    }

    public String getNombrEdit() {
        return nombre;
    }

    public void setNombrEdit(String nombrEdit) {
        this.nombre = nombrEdit;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", edicion=" + edicion + ", numTelef=" + numTelef + '}';
    }
    
    public void leer(){
        System.out.println("Terminaste de ver los datos y has empezado a leer el libro...");
    }
}
