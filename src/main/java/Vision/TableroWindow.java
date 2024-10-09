package Vision;

import javax.swing.*;
import java.awt.*;



public class TableroWindow {

    private static  JFrame window;

    public static void createWindow(){
        window = new JFrame("BuscaMinas");
        window.setDefaultCloseOperation(3);
        window.setSize(800,800);
        window.setVisible(true);
        //window.setResizable(false);
        TableroWindow.createBasePanel(window);

    }
    private static void createBasePanel(JFrame window){
        window.setLayout(new BorderLayout());
        JPanel base = new JPanel(new BorderLayout());
        base.setBackground(Color.gray);
        editBasePanel(base);
        TableroWindow.createTableroPanel(base);
        window.add(base,BorderLayout.CENTER);


    }

    private static void editBasePanel(JPanel base){
        JLabel name = new JLabel("BuscaMinas");
        name.setBackground(Color.black);
        JPanel namepanel = new JPanel();
        namepanel.add(name);
        base.add(namepanel,BorderLayout.NORTH);
    }

    private static void createTableroPanel(JPanel base){
        JPanel tablero = new JPanel();
        tablero.setPreferredSize(new Dimension(600,600));
        tablero.setBackground(Color.white);
        tablero.setBorder(BorderFactory.createLineBorder(Color.white, 4)); // Añadir borde negro

        // Usar un layout de GridBag para centrar el tablero
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(Color.gray); // Mantener el mismo color de fondo
        centerPanel.add(tablero); // Agregar el tablero al panel central

        base.add(centerPanel, BorderLayout.CENTER);
    }


}
