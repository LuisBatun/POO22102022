/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis Fernando
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 22;
        Integer edad2 = new Integer(2);
        float x = edad2.floatValue();
        System.out.println(x);
        String dias = "23";
        System.out.println((dias + 3));
        int temp = Integer.parseInt(dias);
        System.out.println("Días = " + ((temp + 3)));
        
        Perro dog1 = new Perro("Poodle", 1);
        Perro dog2 = new Perro("Poodle", 1);
        Perro dog3 = new Perro("Poodle", 1);
        System.out.println(dog1.cola);
        System.out.println(dog2.cola);
        System.out.println(dog3.cola);
        
        int val1 = 7;
        int val2 = 2;
        System.out.println(val1 | val2);
        System.out.println(val1 & val2);
        
        /*
        val1 = 000...0111
        val2 = 000...0010
       --------------------
               000...0010  // 2 decimal
        */
        //desplazamiento a nivel de bits
        
        int val3 = 1; // 000...0001
        int val4 = val3<<1; //desplazar los bits una posición a la IZQ
                            //000...0010
        System.out.println(val4);
        val4 = val4<<1;
        System.out.println(val4);
        
        
        //prof: Ok, cuando esten programando y alguna variable se comporta con las potencias de la Base 2
        //usen este operador y se ahorraran muuuucho código
        
        int [] edades; // aqui solo se declara
        int [] edades2 = new int[5]; // aqui se declara y reserva memoria
        int [] edades3 = {22, 21, 18, 19, 18}; // en este, se declara, reserva e inicializa
        
        /*
        Ahora se usa igual en leng C, C++, Python... etc
        */
        
        edades2[0] = 33;
        System.out.println(edades2[0]); // 33
        System.out.println(edades2[1]); // 0
        //ahora imrpimimos la edades
        System.out.println("edades3 a mano:");
        System.out.println(edades3[0]);
        System.out.println(edades3[1]);
        System.out.println(edades3[2]);
        System.out.println(edades3[3]);
        System.out.println(edades3[4]);
        //ahora, lo combinamos con FOR
        System.out.println("Automatizado");
        for (int i = 0; i < edades3.length; i++) {
            System.out.println(edades3[i]);
        }
          System.out.println("orden inverso ");
        for (int i = edades3.length-1; i >= 0; i--) {
            System.out.println(edades3[i]);
        }
        
        System.out.println("eades a 18");
        for (int i = 0; i < edades3.length; i++) {
            edades3[i] = edades3[2];
            System.out.println(edades3[i]);
        }
        
        for (int ed : edades3) {
            System.out.println(ed);
        }
        
        //Es una sintaxis totalmente nueva, los : significa que del arreglo
        //que esta al frente de los ":", sacar el siguiente elemento y asignarlo
        //a lo que esta a la izquierda de los :
        
        Perro [] lista = new Perro[3];
        lista[0] = new Perro("Poodle", 1);
        lista[1] = new Perro("San Bernardo", 2);
        lista[2] = new Perro("Akita", 3);
        
        for (Perro perro : lista) {
            perro.comer();
        }
        
        System.out.println("Todos los perros a doverman");
        for (Perro perro : lista) {
            perro.setRaza("Doverman");
        }
        
        //volvemos a imprimir la lista
        for (Perro perro : lista) {
            System.out.println(perro);
        }
        
        ArrayList mascotas = new ArrayList();
        mascotas.add(new Perro("Poodle", 1));
        mascotas.add(new Perro("Doverman", 2));
        mascotas.add(new Perro("Akita", 2));
        mascotas.add(new Perro("Gran Danes", 3));
        mascotas.add(new Perro("Chihuahua", 0));
        
        for (Object mascota : mascotas) {
            Perro tmp = (Perro)mascota;
            System.out.println(tmp);
        }
        
        //Después de la versión 2 de java se agregó el concepto de clases genericas
        
        
        System.out.println("Con genericas");
        ArrayList<Perro> mascotas2 = new ArrayList<Perro>();
        mascotas2.add(new Perro("Poodle", 1));
        mascotas2.add(new Perro("Doverman", 2));
        mascotas2.add(new Perro("Akita", 2));
        mascotas2.add(new Perro("Gran Danes", 3));
        mascotas2.add(new Perro("Chihuahua", 0));
        
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        
        
        Scanner teclado = new Scanner(System.in);
//        System.out.println("Qué raza quieres cambiar de tamaño???: ");
//        String raza = teclado.next(); //Faltan excepciones
        
//        for (Perro perro : mascotas2) {
//            if (perro.getRaza().equals(raza)) {
//                perro.setTamaño(4);
//            }
//        }
        
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        
        mascotas2.add(2, new Perro("Pug", 2));
        
        for (Perro perro : mascotas2) {
            System.out.println(perro);
            
        }
        System.out.println("--------------");
        
        System.out.println("Perro 2 es: " + mascotas2.get(2));
        
        System.out.println("Eliminar el akita, index 3");
        Perro p = mascotas2.remove(3);
        
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        
        System.out.println("------------");
        System.out.println("Perro sacado es :" + p);
        mascotas2.set(1, new Perro("Boxer", 3));
        mascotas2.set(2, new Perro("Labrador", 4));
        System.out.println("----------------");
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        
        // Manejo de excepciones
        
        System.out.println("Elige un numero entre 0 y 4:");
        
        Perro puppy = null;
        int num = 10;
        try{
            int indice = teclado.nextInt();
            num = num / indice;
            puppy = mascotas2.get(indice);
        System.out.println(mascotas2.get(indice));
        //ERROR != EXCEPCION
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Ocurrio un error, el valor debe estar entre 0 y 4");
            System.out.println(ex);
            puppy = mascotas2.get(0);
        }catch(InputMismatchException ime){
            System.out.println("Solo deben ser numeros");
            puppy = mascotas2.get(0);
        }catch(Exception e){
            System.out.println("Ultimo recurso....");
        }
        finally{
            System.out.println("En finally");
            System.out.println(puppy);
        }
        System.out.println("Se alcanzó el fin del programa!!");
    
}
    
    
    
}
