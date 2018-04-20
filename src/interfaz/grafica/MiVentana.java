/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.grafica;

import com.sun.javafx.scene.control.skin.LabeledText;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dam1a07
 */
public final class MiVentana extends JFrame {

    int gridx, gridy;
    int gridwidth, gridheight;

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

        JPanel panel_1 = new JPanel();
        pestañas.addTab("Simple", panel_1);
        //Componentes del panel 1
        crearPanel1(panel_1);

        //Panel 2
        JPanel panel_2 = new JPanel();
        pestañas.addTab("Standar", panel_2);
        crearPanel2(panel_2);

        //Panel 3
        JPanel panel_3 = new JPanel();
        pestañas.addTab("direct.bat access", panel_3);
        crearPanel3(panel_3);

        getContentPane().add(pestañas);
    }

    public void crearPanel1(JPanel panel_1) {
        panel_1.setLayout(new BorderLayout());
        JLabel txtSuperior = new JLabel("<html>You can change optionsfor each URL you add to the textbox. If you have added all <br>"
                + "that you want to the job list, start the grabbing. </html>");
        panel_1.add(txtSuperior, BorderLayout.NORTH);

        JPanel container3Superior = new JPanel();
        //Distribucion de botones
        container3Superior.setLayout(new GridLayout(6, 1, 5, 5));

        JPanel contenedor_1 = new JPanel();
        contenedor_1.setBackground(Color.red);

        JPanel contenedor_2 = new JPanel();
        contenedor_2.setBackground(Color.blue);

        JPanel contenedor_3 = new JPanel();
        contenedor_3.setBackground(Color.GRAY);

        JPanel contenedor_4 = new JPanel();
        contenedor_4.setBackground(Color.ORANGE);
        
        JPanel contenedor_5 = new JPanel();
        contenedor_5.setBackground(Color.white);
        
        JPanel contenedor_6 = new JPanel();
        contenedor_6.setBackground(Color.pink);
        

        //Creacion de elementos
        container3Superior.add(contenedor_1);
        container3Superior.add(contenedor_2);
        container3Superior.add(contenedor_3);
        container3Superior.add(contenedor_4);
        container3Superior.add(contenedor_5);
        container3Superior.add(contenedor_6);

        panel_1.add(container3Superior);

    }

    public void crearPanel2(JPanel panel_2) {

        JLabel et_p2 = new JLabel("Estas en el panel 2");
        panel_2.add(et_p2);

    }

    public void crearPanel3(JPanel panel_3) {

        JPanel container3Superior = new JPanel();
        //Distribucion de botones
        container3Superior.setLayout(new GridLayout(2, 3, 20, 20));

        JButton p3Boton1 = new JButton("Add File");
        JButton p3Boton2 = new JButton("Empty TextBox");
        JButton p3Boton3 = new JButton("wGetStart.bat=textbox");
        JButton p3Boton4 = new JButton("Add wGetStart.bat");
        JButton p3Boton5 = new JButton("Empty wGetStart.bat");
        JButton p3Boton6 = new JButton("wGetStart.bat=textbox");

        //Creacion de elementos
        container3Superior.add(p3Boton1);
        container3Superior.add(p3Boton2);
        container3Superior.add(p3Boton3);
        container3Superior.add(p3Boton4);
        container3Superior.add(p3Boton5);
        container3Superior.add(p3Boton6);

        panel_3.add(container3Superior);

        //Parte inferior
        JPanel container3Inferior = new JPanel();
        JTextArea txt = new JTextArea("", 17, 60);
        JScrollPane scroll = new JScrollPane(txt);
        container3Inferior.add(scroll);

        panel_3.add(container3Inferior);

        //Cambiar color
        //container3Inferior.setBackground(Color.blue);
    }

}
