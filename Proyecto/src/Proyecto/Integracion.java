
package Proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Integracion extends JFrame{
    
    public Integracion(){
    
        super("Casos de Integración");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        JLabel escoger = new JLabel("Escoja un caso de Integración");
        escoger.setBounds(50, 50, 250, 50);
        escoger.setFont(new Font("arial", Font.PLAIN, 18));
        add(escoger);
        
        JButton caso1 = new JButton("<html><center>Integración por sustitución<html>");
        caso1.setBounds(110, 100, 250, 40);
        add(caso1);
        
        JButton caso2 = new JButton("<html><center>Integración por partes<html>");
        caso2.setBounds(110, 150, 250, 40);
        add(caso2);
        
        ActionListener no2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Caso2();
            }
        };
        caso2.addActionListener(no2);
        
        JButton caso3 = new JButton("<html><center>Integración por cambio de variables<html>");
        caso3.setBounds(110, 200, 250, 40);
        add(caso3);
        
        ActionListener no3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Caso3();
            }
        };
        caso3.addActionListener(no3);
    }
    
    public static void Caso2() {
        
        JFrame casono1 = new JFrame("Integración por partes");
        casono1.setSize(1186,745);
        casono1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        casono1.setLayout(null);
        casono1.setLocationRelativeTo(null);
        casono1.setVisible(true);
        
        JPanel imagen = new JPanel();
        imagen.setSize(1166, 705);
        imagen.setLocation(0, 0);
        casono1.getContentPane().add(imagen);
        imagen.setLayout(null);
        casono1.add(imagen);
        imagen.setBackground(Color.black);
       
        JLabel etiqueta = new JLabel(new ImageIcon("integral2.jpg"));
        etiqueta.setBounds(10, 10, 1146, 585);
        imagen.add(etiqueta);
        
        JButton ejemplo1 = new JButton("<html><center>Mostrar ejemplo<html>");
        ejemplo1.setBounds(523, 650, 100, 40);
        imagen.add(ejemplo1);
        
        ActionListener ejem1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejemplo2();
            }
        };
        ejemplo1.addActionListener(ejem1);
    }
    
    public static void ejemplo2() {
        
        JFrame casono1 = new JFrame("Derivada de grado n");
        casono1.setSize(432,1029);
        casono1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        casono1.setLayout(null);
        casono1.setLocationRelativeTo(null);
        casono1.setVisible(true);
        
        JPanel imagen = new JPanel();
        imagen.setSize(412, 989);
        imagen.setLocation(0, 0);
        casono1.getContentPane().add(imagen);
        imagen.setLayout(null);
        casono1.add(imagen);
        imagen.setBackground(Color.black);
       
        JLabel etiqueta = new JLabel(new ImageIcon("ejemplo2.jpg"));
        etiqueta.setBounds(10, 10, 392, 969);
        imagen.add(etiqueta);
    }
    public static void Caso3() {
        
        JFrame casono1 = new JFrame("Integración por cambio de variables");
        casono1.setSize(1169,327);
        casono1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        casono1.setLayout(null);
        casono1.setLocationRelativeTo(null);
        casono1.setVisible(true);
        
        JPanel imagen = new JPanel();
        imagen.setSize(1149, 287);
        imagen.setLocation(0, 0);
        casono1.getContentPane().add(imagen);
        imagen.setLayout(null);
        casono1.add(imagen);
        imagen.setBackground(Color.black);
       
        JLabel etiqueta = new JLabel(new ImageIcon("integral3.jpg"));
        etiqueta.setBounds(10, 10, 1129, 167);
        imagen.add(etiqueta);
        
        JButton ejemplo1 = new JButton("<html><center>Mostrar ejemplo<html>");
        ejemplo1.setBounds(474, 200, 100, 40);
        imagen.add(ejemplo1);
        
        ActionListener ejem1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejemplo3();
            }
        };
        ejemplo1.addActionListener(ejem1);
    }
    public static void ejemplo3() {
        
        JFrame casono1 = new JFrame("Integral por cambio de variable");
        casono1.setSize(463,1009);
        casono1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        casono1.setLayout(null);
        casono1.setLocationRelativeTo(null);
        casono1.setVisible(true);
        
        JPanel imagen = new JPanel();
        imagen.setSize(443, 969);
        imagen.setLocation(0, 0);
        casono1.getContentPane().add(imagen);
        imagen.setLayout(null);
        casono1.add(imagen);
        imagen.setBackground(Color.black);
       
        JLabel etiqueta = new JLabel(new ImageIcon("ejemplo3.jpg"));
        etiqueta.setBounds(10, 10, 423, 949);
        imagen.add(etiqueta);
    }
}
