/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafiean;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author SALA
 */
public class CafiEAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            JFrame ventana = new JFrame();
            ventana.setSize(350, 200);    // Esto creara una ventana de 100 x 100 pixeles
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );  // Indica la accion de la ventana al seleccionar la opcion de cerrar
            ventana.setVisible(true);     // Indica la visibilidad de la ventana
           
            JPanel panel = new JPanel();    // El panel es aquello que se posiciona sobre la ventana
            ventana.add(panel);
            panel.setLayout(null);

            JLabel usuario = new JLabel("Usuario");
            usuario.setBounds(10, 20, 80, 25);
            panel.add(usuario);
            JLabel contrasenaUsuario = new JLabel("Contraseña");
            contrasenaUsuario.setBounds(10, 50, 80, 25);
            panel.add(contrasenaUsuario);

            JTextField textoUsuario = new JTextField();
            textoUsuario.setBounds(100, 20, 165, 25);
            panel.add(textoUsuario);

            JPasswordField textoContrasena = new JPasswordField();
            textoContrasena.setBounds(100, 50, 165, 25);
            panel.add(textoContrasena);

            JButton boton = new JButton("Login");
            boton.setBounds(100, 80, 80, 25);
            boton.addActionListener(new GUI());
            panel.add(boton);

            JLabel ingresoExitoso = new JLabel("");
            ingresoExitoso.setBounds(10, 110, 300, 25);
            panel.add(ingresoExitoso);
            
            
    }
    
}
