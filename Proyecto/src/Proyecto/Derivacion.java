
package Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.DefaultCaret;

public class Derivacion extends JFrame{
    
    public Derivacion(){
        
        super("Casos de Derivación");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        JLabel escoger = new JLabel("Escoja un caso de derivación");
        escoger.setBounds(50, 50, 250, 50);
        escoger.setFont(new Font("arial", Font.PLAIN, 18));
        add(escoger);
        
        JButton caso1 = new JButton("<html><center>Derivada de función de grado 𝑛<html>");
        caso1.setBounds(110, 100, 250, 40);
        add(caso1);
        
        ActionListener no1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Caso1();
            }
        };
        caso1.addActionListener(no1);
        
        JButton caso2 = new JButton("<html><center>Derivada del producto de una constante por una función<html>");
        caso2.setBounds(110, 150, 250, 40);
        add(caso2);
        
        ActionListener no2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Caso2();
            }
        };
        caso2.addActionListener(no2);
        
        JButton caso3 = new JButton("<html><center>Derivada de una suma<html>");
        caso3.setBounds(110, 200, 250, 40);
        add(caso3);
        
        ActionListener no3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Caso3();
            }
        };
        caso3.addActionListener(no3);
        
        JButton caso4 = new JButton("<html><center>Derivada de un producto<html>");
        caso4.setBounds(110, 250, 250, 40);
        add(caso4);
        
        ActionListener no4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Caso4();
            }
        };
        caso4.addActionListener(no4);
        
        JButton caso5 = new JButton("<html><center>Derivada de un cociente<html>");
        caso5.setBounds(110, 300, 250, 40);
        add(caso5);
        
        ActionListener no5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Caso5();
            }
        };
        caso5.addActionListener(no5);
        
        JButton caso6 = new JButton("<html><center>Regla de la cadena<html>");
        caso6.setBounds(110, 350, 250, 40);
        add(caso6);
        
        ActionListener no6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Caso6();
            }
        };
        caso6.addActionListener(no6);
        
    }
    
    
   public static void Caso1() {
        
        JFrame casono1 = new JFrame("Derivada de grado n");
        casono1.setSize(1328,696);
        casono1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        casono1.setLayout(null);
        casono1.setLocationRelativeTo(null);
        casono1.setVisible(true);
        
        JPanel imagen = new JPanel();
        imagen.setSize(1308, 656);
        imagen.setLocation(0, 0);
        casono1.getContentPane().add(imagen);
        imagen.setLayout(null);
        casono1.add(imagen);
        imagen.setBackground(Color.black);
       
        JLabel etiqueta = new JLabel(new ImageIcon("caso1.jpg"));
        etiqueta.setBounds(10, 10, 1288, 636);
        imagen.add(etiqueta);
    }
    
    public static void Caso2() {
        
        JFrame casono1 = new JFrame("Derivada del producto de una constante con una función");
        casono1.setSize(1289,512);
        casono1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        casono1.setLayout(null);
        casono1.setLocationRelativeTo(null);
        casono1.setVisible(true);
        
        JPanel imagen = new JPanel();
        imagen.setSize(1269, 472);
        imagen.setLocation(0, 0);
        casono1.getContentPane().add(imagen);
        imagen.setLayout(null);
        casono1.add(imagen);
        imagen.setBackground(Color.black);
       
        JLabel etiqueta = new JLabel(new ImageIcon("caso2.jpg"));
        etiqueta.setBounds(10, 10, 1249, 452);
        imagen.add(etiqueta);
    }
    
    public static void Caso3() {
        
        JFrame casono1 = new JFrame("Derivada de una suma");
        casono1.setSize(928,503);
        casono1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        casono1.setLayout(null);
        casono1.setLocationRelativeTo(null);
        casono1.setVisible(true);
        
        JPanel imagen = new JPanel();
        imagen.setSize(908, 463);
        imagen.setLocation(0, 0);
        casono1.getContentPane().add(imagen);
        imagen.setLayout(null);
        casono1.add(imagen);
        imagen.setBackground(Color.black);
       
        JLabel etiqueta = new JLabel(new ImageIcon("caso3.jpg"));
        etiqueta.setBounds(10, 10, 888, 443);
        imagen.add(etiqueta);
    }
    
    public static void Caso4() {
        
        JFrame casono1 = new JFrame("Derivada de un producto");
        casono1.setSize(1308,550);
        casono1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        casono1.setLayout(null);
        casono1.setLocationRelativeTo(null);
        casono1.setVisible(true);
        
        JPanel imagen = new JPanel();
        imagen.setSize(1288, 510);
        imagen.setLocation(0, 0);
        casono1.getContentPane().add(imagen);
        imagen.setLayout(null);
        casono1.add(imagen);
        imagen.setBackground(Color.black);
       
        JLabel etiqueta = new JLabel(new ImageIcon("caso4.jpg"));
        etiqueta.setBounds(10, 10, 1268, 490);
        imagen.add(etiqueta);
    }
    
    public static void Caso5() {
        
        JFrame casono1 = new JFrame("Derivada de un cociente");
        casono1.setSize(1140,987);
        casono1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        casono1.setLayout(null);
        casono1.setLocationRelativeTo(null);
        casono1.setVisible(true);
        
        JPanel imagen = new JPanel();
        imagen.setSize(1120, 947);
        imagen.setLocation(0, 0);
        casono1.getContentPane().add(imagen);
        imagen.setLayout(null);
        casono1.add(imagen);
        imagen.setBackground(Color.black);
       
        JLabel etiqueta = new JLabel(new ImageIcon("caso5.jpg"));
        etiqueta.setBounds(10, 10, 1100, 927);
        imagen.add(etiqueta);
    }
    
    public static void Caso6() {
        
        JFrame casono1 = new JFrame("Regla de la cadena");
        casono1.setSize(1158,651);
        casono1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        casono1.setLayout(null);
        casono1.setLocationRelativeTo(null);
        casono1.setVisible(true);
        
        JPanel imagen = new JPanel();
        imagen.setSize(1138, 611);
        imagen.setLocation(0, 0);
        casono1.getContentPane().add(imagen);
        imagen.setLayout(null);
        casono1.add(imagen);
        imagen.setBackground(Color.black);
       
        JLabel etiqueta = new JLabel(new ImageIcon("caso6.jpg"));
        etiqueta.setBounds(10, 10, 1118, 591);
        imagen.add(etiqueta);
    }
}
