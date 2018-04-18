/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.grafica;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author dam1a07
 */
public class MiVentana extends JFrame {
 public MiVentana() {
 super("zGetGUI v1.20 | You are using GNU Wget 1.9-beta - 1.7 is minimum.");
 setSize(750, 500);
 setResizable(false);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 
 //Panel Superior
 JPanel panelSuperior = new JPanel();
 panelSuperior.setLayout(new FlowLayout());
 panelSuperior.add(new JLabel("URL to download :"));
 panelSuperior.add(new JTextField(30));
 panelSuperior.add(new JButton("-"));
 panelSuperior.add(new JButton("Start the grabbing!"));
 panelSuperior.add(new JButton("?"));
 
 //Creacion de conjunto de pestañas
 JTabbedPane pestañas = new JTabbedPane();
 
 //Creacion del panel de pestañas
 JPanel panelSimple=new JPanel();
 
 //Componentes del panel
 JLabel pSimple = new JLabel("Estas en el panel Simple");

 pestañas.addTab("Simple", panelSimple);
 
 
 Container cp = getContentPane();
 cp.add(panelSuperior, BorderLayout.NORTH);
 
 
 getContentPane().add(pestañas);
 
 }
}
