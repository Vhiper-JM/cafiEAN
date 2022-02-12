/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafiean;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Jose Mosquera
 */
public class Registro implements ActionListener {
    
    JLabel tituloInicio = new JLabel("Pagina de registro");
    
    private static JLabel nombres, apellidos;
    private static JTextField nombresUsuario, apellidosUsuario;
    private static JLabel contrasena, confirmar, contrasenaC, tipoDe, programa, programaUsuario;
    private static JPasswordField textoContrasena, confirmarTextoContrasena;
    private static JButton botonRegistro;
    private static JCheckBox pregrado, posgrado;
    private static JComboBox programas;
    private static JLabel mensajeIngreso;
    private static final JFrame ventana = new JFrame();
    
    Registro(){
        ventana.setSize(350, 500);    // Esto creara una ventana de 350 x 200 pixeles
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );  // Indica la accion de la ventana al seleccionar la opcion de cerrar
        ventana.setVisible(true);     // Indica la visibilidad de la ventana
         
        JPanel panel = new JPanel();    // El panel es aquello que se posiciona sobre la ventana
        ventana.add(panel);
        panel.setLayout(null);
        
        nombres = new JLabel("Nombres");
        nombres.setBounds(10, 20, 80, 25);
        panel.add(nombres);
        apellidos = new JLabel("Apellidos");
        apellidos.setBounds(10, 50, 80, 25);
        panel.add(apellidos);
        
        contrasena = new JLabel("Contraseña");
        contrasena.setBounds(10, 80, 80, 25);
        panel.add(contrasena);
        confirmar = new JLabel("Confirmar");
        confirmar.setBounds(13, 110, 80, 25);
        panel.add(confirmar);
        contrasenaC = new JLabel("contraseña");
        contrasenaC.setBounds(10, 122, 80, 25);
        panel.add(contrasenaC);
        
        tipoDe = new JLabel("Tipo de");
        tipoDe.setBounds(13, 143, 80, 25);
        panel.add(tipoDe);
        programa = new JLabel("programa");
        programa.setBounds(10, 155, 80, 25);
        panel.add(programa);
        
        programaUsuario = new JLabel("Programa");
        programaUsuario.setBounds(10, 180, 80, 25);
        panel.add(programaUsuario);
        
        nombresUsuario = new JTextField();
        nombresUsuario.setBounds(100, 25, 220, 25);
        panel.add(nombresUsuario);
        apellidosUsuario = new JTextField();
        apellidosUsuario.setBounds(100, 55, 220, 25);
        panel.add(apellidosUsuario);
        
        textoContrasena = new JPasswordField();
        textoContrasena.setBounds(100, 85, 220, 25);
        panel.add(textoContrasena);
        confirmarTextoContrasena = new JPasswordField();
        confirmarTextoContrasena.setBounds(100, 115, 220, 25);
        panel.add(confirmarTextoContrasena);
        
        pregrado = new JCheckBox();
        pregrado.setText("Pregrado");
        pregrado.setFocusable(false);
        pregrado.setBounds(100, 150, 110, 25);
        panel.add(pregrado);
        
        posgrado = new JCheckBox();
        posgrado.setText("Posgrado");
        posgrado.setFocusable(false);
        posgrado.setBounds(210, 150, 110, 25);
        panel.add(posgrado);
        
        String[] listaProgramas = 
        {"Seleccione un programa...", "Administracion de Empresas", "Comunicación", "Contaduria Pública",
        "Economía", "Estudios y Gestión Cultural", "Ingeniería Ambiental",
        "Ingeniería de Producción", "Ingeniería de Sistemas", "Ingeniería en Energías",
        "Ingeniería Industrial", "Ingeniería Mecatrónica", "Ingeniería Química",
        "Lenguas Modernas", "Mercadeo", "Mercadeo y Estrategia Comercial",
        "Negocios Internacionales", "Psicología"};
        programas = new JComboBox(listaProgramas);
        programas.setBounds(100, 180, 220, 25);
        panel.add(programas);
        
        botonRegistro = new JButton("Registrar");
        botonRegistro.setBounds(100, 210, 110, 25);
        botonRegistro.addActionListener(this);
        //boton.addActionListener(new Login()); // La clase va a estar "escuchando" por una accion
        panel.add(botonRegistro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
