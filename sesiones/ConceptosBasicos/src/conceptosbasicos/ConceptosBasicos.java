/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.lenovo.Procesador;

/**
 *
 * @author Luis Fernando
 */
public class ConceptosBasicos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Procesador cpu = new Procesador();
        cpu.setFrecuencia(5.3f);
        System.out.println( cpu );
        
    }
    
}
