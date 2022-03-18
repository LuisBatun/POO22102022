/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion.autor;

/**
 *
 * @author Luis Fernando
 */
public class Autor {
    private String nombre;
    private String fechaNac;
    private String fechaFallec;

    public Autor() {
    }

    public Autor(String nombre, String fechaNac, String fechaFallec) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.fechaFallec = fechaFallec;
    }

    public String getFechaFallec() {
        return fechaFallec;
    }

    public void setFechaFallec(String fechaFallec) {
        this.fechaFallec = fechaFallec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + ", fechaFallec=" + fechaFallec + '}';
    }
    
    public void portada(){
        System.out.println("Estas viendo los datos del libro...");
    }
}
