/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author Luis Fernando
 */
public class Perro {
    private String raza;
    private int tamaño;
    public static final String cola = "cola";

    public Perro() {
    }

    public Perro(String raza, int tamaño) {
        this.raza = raza;
        this.tamaño = tamaño;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", tama\u00f1o=" + tamaño + '}';
    }
    
    public void comer(){
        System.out.println("El perro de raza " + raza);
        System.out.println("Esta comiendo...");
    }
    
    public void ladrar (){
        System.out.println("Ladrando");
    }
}
