package com.mycompany.cafiean;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose Mosquera
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener{
    
    private static JLabel usuario;
    private static JTextField textoUsuario;
    private static JLabel contrasenaUsuario;
    private static JPasswordField textoContrasena;
    private static JButton botonLogin, botonRegistro;
    private static JLabel mensajeIngreso;
    private static final JFrame ventana = new JFrame();
    
    Login(){
        ventana.setSize(350, 200);    // Esto creara una ventana de 100 x 100 pixeles
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );  // Indica la accion de la ventana al seleccionar la opcion de cerrar
        ventana.setVisible(true);     // Indica la visibilidad de la ventana
         
        JPanel panel = new JPanel();    // El panel es aquello que se posiciona sobre la ventana
        ventana.add(panel);
        panel.setLayout(null);
        
        usuario = new JLabel("Usuario");
        usuario.setBounds(10, 20, 80, 25);
        panel.add(usuario);
        contrasenaUsuario = new JLabel("Contraseña");
        contrasenaUsuario.setBounds(10, 50, 80, 25);
        panel.add(contrasenaUsuario);
        
        textoUsuario = new JTextField();
        textoUsuario.setBounds(100, 20, 220, 25);
        panel.add(textoUsuario);
        
        textoContrasena = new JPasswordField();
        textoContrasena.setBounds(100, 50, 220, 25);
        panel.add(textoContrasena);
        
        botonLogin = new JButton("Iniciar sesión");
        botonLogin.setBounds(100, 80, 110, 25);
        botonLogin.addActionListener(this);
        //boton.addActionListener(new Login()); // La clase va a estar "escuchando" por una accion
        panel.add(botonLogin);
        
        botonRegistro = new JButton("Registrarse");
        botonRegistro.setBounds(215, 80, 105, 25);
        botonRegistro.addActionListener(this);
        //boton.addActionListener(new Login()); // La clase va a estar "escuchando" por una accion
        panel.add(botonRegistro);
        
        mensajeIngreso = new JLabel("");
        mensajeIngreso.setBounds(10, 110, 300, 25);
        panel.add(mensajeIngreso);   
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = textoUsuario.getText();
        String contrasena = textoContrasena.getText();
        
        if(e.getSource()==botonRegistro) {
            ventana.dispose();
            Registro registro = new Registro();
        }
        
        if(e.getSource()==botonLogin) {
            if(usuario.equals("Jose") && contrasena.equals("Alameda12")){
                mensajeIngreso.setText("Usuario logueado exitosamente!");
                ventana.dispose();
                Inicio inicio = new Inicio();
            } else {
                mensajeIngreso.setText("Usuario o contraseña equivocados");            
            }
            
        
        
        
    }
        
    }
}
    

