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
public final class MiVentana extends JFrame {

    public MiVentana() {

        super("zGetGUI v1.20 | You are using GNU Wget 1.9-beta - 1.7 is minimum.");
        setSize(750, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel Superior
        crearPanelSuperior();

        //Pestañas
        crearPestañas();

    }

    public void crearPanelSuperior() {

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.add(new JLabel("URL to download :"));
        panelSuperior.add(new JTextField(30));
        panelSuperior.add(new JButton("-"));
        panelSuperior.add(new JButton("Start the grabbing!"));
        panelSuperior.add(new JButton("?"));

        getContentPane().add(panelSuperior, BorderLayout.NORTH);

    }

    public void crearPestañas() {

        //Creacion de conjunto de pestañas
        JTabbedPane pestañas = new JTabbedPane();

        //Creacion del panel de pestañas
        JPanel panel1 = new JPanel();

        //Componentes del panel 1 
        JLabel pSimple = new JLabel("You can change the options for each URL you add"
                + "to the textbox.");
        panel1.add(pSimple);

        panel1.add(new JTextField(10));

        //Nombre de la pestaña
        pestañas.addTab("Panel 1", panel1);

        //Introducir en la interfaz
        getContentPane().add(pestañas);

    }

}
