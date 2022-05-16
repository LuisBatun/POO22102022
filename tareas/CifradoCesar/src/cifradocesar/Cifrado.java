/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Luis Fernando
 */
public class Cifrado extends JFrame{
    
    private FlowLayout layout;
    private JTextField cuadroTexto;
    private JTextField cuadroNumero;
    private JLabel texto1;
    private JLabel texto2;
    private JLabel texto3;
    private JLabel resultado;
    private JButton boton;
    
    //El abecedario en mayusculas
    String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    
    
    public Cifrado() throws HeadlessException{
        this.setTitle("Cifrador Cesar");
        this.setSize(600, 400);
        this.setVisible(true);
        layout = new FlowLayout();
        this.setLayout(layout);
        texto1 = new JLabel("Texto");
        cuadroTexto = new JTextField(30);
        texto2 = new JLabel("Llave (key)");
        cuadroNumero = new JTextField(2);
        boton = new JButton("Cifrar");
        texto3 = new JLabel("Resultado: ");
        resultado = new JLabel("");
        
        this.getContentPane().add(texto1);
        this.getContentPane().add(cuadroTexto);
        this.getContentPane().add(texto2);
        this.getContentPane().add(cuadroNumero);
        this.getContentPane().add(boton);
        this.getContentPane().add(texto3);
        this.getContentPane().add(resultado);
        
        this.pack();
        this.setVisible(true);
        
        
        //Cerrar el programa al apretar la "x" en la interfaz
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                //Pasar a variables los datos en la interfaz grafica
                String textoIngresado = cuadroTexto.getText();
                String textoCodificado = "";
                int llave = Integer.parseInt(cuadroNumero.getText());
                
                textoIngresado = textoIngresado.toUpperCase();
                
                char caracter;
                for (int i = 0; i < textoIngresado.length(); i++) {
                    caracter = textoIngresado.charAt(i);
                    
                    int pos = letras.indexOf(caracter);
                    
                    if(pos == -1){
                        textoCodificado += caracter;
                    }else{
                        textoCodificado += letras.charAt((pos + llave) % letras.length());
                    }
                }
                //Se muestra el resultado en el JTextField
                resultado.setText(textoCodificado);
                
                /*
                Nota: Preguntar por mejoras para el programa a futuro
                */
            }
        });
    }
}
