package com.mycompany.cafiean;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose Mosquera
 */
public class Inicio {
    
    JFrame frame = new JFrame();
    JLabel tituloInicio = new JLabel("Pagina de inicio");
    
    Inicio(){
        
        tituloInicio.setBounds(340, 0, 100, 100);
        //tituloInicio.setFont(new Font(null, Font.BOLD, 25));
        
        frame.add(tituloInicio);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(840, 840);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
