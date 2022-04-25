/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author Luis Fernando
 */
public class PruebaEjemplo {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se debe crear un arreglo de 5 cuentahabientes con datos de ejemplo
        y con un FOR EACH deben mostrar quien es Premium y quien es Regular*/
        Cuentahabiente datos = new Cuentahabiente();
        
        Cuentahabiente [] usuarios = new Cuentahabiente[5];
        usuarios[0] = new Cuentahabiente(2372619, "Luis", 155499);
        usuarios[1] = new Cuentahabiente(3432424, "Juan", 87543);
        usuarios[2] = new Cuentahabiente(3553237, "Gael", 98642);
        usuarios[3] = new Cuentahabiente(2325887, "Angel", 125364);
        usuarios[4] = new Cuentahabiente(7654786, "Carlos", 99453);
        
        for (Cuentahabiente usuario : usuarios) {
            usuario.retirarDinero(60000);
            usuario.evaluarNivelCliente();
            String nivel = usuario.nivel;
            System.out.println(nivel);
        }  
    }
}
