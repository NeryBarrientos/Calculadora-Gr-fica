package Proyecto;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaPrincipal extends JFrame{
    
    
    static public boolean b1,b2,b3;
    
    public VentanaPrincipal(){
        
        super("Ventana Principal");
        this.setSize(1500,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        JFrame VentanaActual=this;
        
        JPanel p1 = new JPanel();
        p1.setSize(300, 500);
        p1.setLocation(0, 0);
        this.getContentPane().add(p1);
        p1.setLayout(null);
        
        JLabel nombre = new JLabel("EasyMath");
        nombre.setBounds(20, 20, 200, 40);
        nombre.setFont(new Font("arial", Font.ITALIC, 30));
        p1.add(nombre);
        
        JLabel jlabel1 = new JLabel("Aritmética");
        jlabel1.setBounds(20, 100, 200, 40);
        jlabel1.setFont(new Font("arial", Font.BOLD, 20));
        p1.add(jlabel1);
        
        JButton btn1 = new JButton("Calculadora");
        btn1.setSize(200, 100);
        btn1.setBounds(20, 150, 150, 40);
        p1.add(btn1);
        
        ActionListener calculadora = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculadora calcu = new Calculadora();
                calcu.setVisible(true);
            }
        };
        btn1.addActionListener(calculadora);
        
        
        
        //Panel 2
        JPanel p2 = new JPanel();
        p2.setSize(300, 500);
        p2.setLocation(300, 0);
        this.getContentPane().add(p2);
        //p2.setBackground(Color.GREEN);
        p2.setLayout(null);
        
        JLabel label2 = new JLabel("Álgebra");
        label2.setBounds(20, 100, 200, 40);
        label2.setFont(new Font("arial", Font.BOLD, 20));
        p2.add(label2);
        
        JLabel label3 = new JLabel("Ecuaciones");
        label3.setBounds(50, 150, 200, 40);
        label3.setFont(new Font("arial", Font.ITALIC, 20));
        p2.add(label3);
        
        JButton btn2 = new JButton("Ecuación cuadrática");
        btn2.setSize(250, 100);
        btn2.setBounds(70, 200, 150, 40);
        p2.add(btn2);
        
        ActionListener EcCu = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EcCuadra ventanaEc = new EcCuadra();
                ventanaEc.setVisible(true);
            }
        };
        btn2.addActionListener(EcCu);
        
        JButton btn3 = new JButton("<html><center>Sistema de Ecuaciones<html>");
        btn3.setSize(500, 100);
        btn3.setBounds(70, 250, 150, 50);
        p2.add(btn3);
        
        ActionListener SisEcu = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SisEcua ventanaEc = new SisEcua();
                ventanaEc.setVisible(true);
            }
        };
        btn3.addActionListener(SisEcu);
        
        JLabel label4 = new JLabel("Factorización");
        label4.setBounds(50, 300, 200, 40);
        label4.setFont(new Font("arial", Font.ITALIC, 20));
        p2.add(label4);
        
        JButton btn4 = new JButton("Binomio cuadrado");
        btn4.setSize(500, 100);
        btn4.setBounds(70, 340, 150, 40);
        p2.add(btn4);
        
        ActionListener binomio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Binomio cuadrado = new Binomio();
                cuadrado.setVisible(rootPaneCheckingEnabled);
            }
        };
        btn4.addActionListener(binomio);
        
        JButton btn5 = new JButton("<html><center>Diferencia de cuadrados<html>");
        btn5.setSize(500, 100);
        btn5.setBounds(70, 390, 150, 50);
        p2.add(btn5);
        
        
        
        JButton btn6 = new JButton("<html><center>Suma y diferencia de cubos<html>");
        btn6.setSize(500, 100);
        btn6.setBounds(70, 450, 150, 50);
        p2.add(btn6);
        
        //Panel 3
        JPanel p3 = new JPanel();
        p3.setSize(300, 700);
        p3.setLocation(600, 0);
        this.getContentPane().add(p3);
        //p3.setBackground(Color.BLUE);
        p3.setLayout(null);
        
        JLabel label5 = new JLabel("Trigonometría");
        label5.setBounds(20, 100, 200, 40);
        label5.setFont(new Font("arial", Font.BOLD, 20));
        p3.add(label5);
        
        JLabel label6 = new JLabel("Funciones trigonometricas");
        label6.setBounds(50, 150, 250, 40);
        label6.setFont(new Font("arial", Font.ITALIC, 20));
        p3.add(label6);
        
        JButton btn7 = new JButton("<html><center>Seno<html>");
        btn7.setSize(500, 100);
        btn7.setBounds(70, 200, 150, 40);
        p3.add(btn7);
        
        ActionListener seno = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Seno funSeno = new Seno();
                funSeno.setVisible(true);
            }
        };
        btn7.addActionListener(seno);
        
        JButton btn8 = new JButton("<html><center>Coseno<html>");
        btn8.setSize(500, 100);
        btn8.setBounds(70, 250, 150, 40);
        p3.add(btn8);
        
        ActionListener cos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Coseno funCos = new Coseno();
                funCos.setVisible(true);
            }
        };
        btn8.addActionListener(cos);
        
        JButton btn9 = new JButton("<html><center>Tangente<html>");
        btn9.setSize(500, 100);
        btn9.setBounds(70, 300, 150, 40);
        p3.add(btn9);
        
        ActionListener tan = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tangente funTan = new Tangente();
                funTan.setVisible(true);
            }
        };
        btn9.addActionListener(tan);
        
        JLabel label7 = new JLabel("Ángulos");
        label7.setBounds(50, 350, 200, 40);
        label7.setFont(new Font("arial", Font.ITALIC, 20));
        p3.add(label7);
        
        JButton btn10 = new JButton("<html><center>Longitud de arco<html>");
        btn10.setSize(500, 100);
        btn10.setBounds(70, 400, 150, 40);
        p3.add(btn10);
        
        ActionListener Arco = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LongArco ventanaArco = new LongArco();
                ventanaArco.setVisible(true);
            }
        };
        btn10.addActionListener(Arco);
        
        //Panel 4
        JPanel p4 = new JPanel();
        p4.setSize(300, 500);
        p4.setLocation(900, 0);
        this.getContentPane().add(p4);
        //p4.setBackground(Color.DARK_GRAY);
        p4.setLayout(null);
        
        JLabel label8 = new JLabel("Cálculo");
        label8.setBounds(20, 100, 200, 40);
        label8.setFont(new Font("arial", Font.BOLD, 20));
        p4.add(label8);
        
        JLabel label9 = new JLabel("Cálculo diferencial");
        label9.setBounds(50, 150, 250, 40);
        label9.setFont(new Font("arial", Font.ITALIC, 20));
        p4.add(label9);
        
        JButton btn11 = new JButton("<html><center>Casos de derivación<html>");
        btn11.setSize(500, 100);
        btn11.setBounds(70, 200, 150, 40);
        p4.add(btn11);
        
        ActionListener derivada = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Derivacion derivar = new Derivacion();
                derivar.setVisible(true);
            }
        };
        btn11.addActionListener(derivada);
        
        JLabel label10 = new JLabel("Cálculo integral");
        label10.setBounds(50, 250, 250, 40);
        label10.setFont(new Font("arial", Font.ITALIC, 20));
        p4.add(label10);
        
        JButton btn13 = new JButton("<html><center>Sumas de Riemann<html>");
        btn13.setSize(500, 100);
        btn13.setBounds(70, 350, 150, 40);
        p4.add(btn13);
        
        JButton btn12 = new JButton("<html><center>Casos de integración<html>");
        btn12.setSize(500, 100);
        btn12.setBounds(70, 300, 150, 40);
        p4.add(btn12);
        
        ActionListener integral = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integracion mostrar = new Integracion();
                mostrar.setVisible(true);
            }
        };
        btn12.addActionListener(integral);
        
        //Panel 5
        JPanel p5 = new JPanel();
        p5.setSize(300, 500);
        p5.setLocation(1200, 0);
        this.getContentPane().add(p5);
        //p5.setBackground(Color.MAGENTA);
        p5.setLayout(null);
        
        JLabel label11 = new JLabel("Álgebra lineal");
        label11.setBounds(20, 100, 200, 40);
        label11.setFont(new Font("arial", Font.BOLD, 20));
        p5.add(label11);
        
        JLabel label12 = new JLabel("Operaciones con matrices");
        label12.setBounds(30, 150, 250, 40);
        label12.setFont(new Font("arial", Font.ITALIC, 20));
        p5.add(label12);
        
        JButton btn14 = new JButton("<html><center>Transpuesta<html>");
        btn14.setSize(500, 100);
        btn14.setBounds(70, 190, 150, 40);
         ActionListener algebra1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1 = true;
                b2 = false;
                b3 = false;
                AlgebraLineal a1 = new AlgebraLineal();
                a1.setVisible(true);
                
            }
        };
        btn14.addActionListener(algebra1);
        p5.add(btn14);
        
        JButton btn15 = new JButton("<html><center>Inversa<html>");
        btn15.setSize(500, 100);
        btn15.setBounds(70, 240, 150, 40);
        p5.add(btn15);
         ActionListener algebra2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1 = false;
                b2 = true;
                b3 = false;
                AlgebraLineal a2 = new AlgebraLineal();
                a2.setVisible(true);
            }
        };
        btn15.addActionListener(algebra2);
        
        JButton btn16 = new JButton("<html><center>Determinante<html>");
        btn16.setSize(500, 100);
        btn16.setBounds(70, 290, 150, 40);
        p5.add(btn16);
        ActionListener algebra3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1 = false;
                b2 = false;
                b3 = true;
                AlgebraLineal a3 = new AlgebraLineal();
                a3.setVisible(true);
            }
        };
        btn16.addActionListener(algebra3);
        
        JLabel label13 = new JLabel("Operaciones con matrices");
        label13.setBounds(30, 340, 250, 40);
        label13.setFont(new Font("arial", Font.ITALIC, 20));
        p5.add(label13);
        
        JButton btn17 = new JButton("<html><center>Operaciones entre matrices<html>");
        btn17.setSize(500, 100);
        btn17.setBounds(70, 390, 150, 40);
        p5.add(btn17);
        //Panel 6
        JPanel p6 = new JPanel();
        p6.setSize(600, 200);
        p6.setLocation(900, 500);
        this.getContentPane().add(p6);
        //p6.setBackground(Color.RED);
        p6.setLayout(null);
        
        JButton btn18 = new JButton("<html><center>Favoritos<html>");
        btn18.setSize(500, 100);
        btn18.setBounds(230, 100, 150, 40);
        p6.add(btn18);
        
        ActionListener favs = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Historial fav = new Historial();
                fav.setVisible(true);
            }
        };
        btn18.addActionListener(favs);
        
        JButton btn19 = new JButton("<html><center>Historial<html>");
        btn19.setSize(500, 100);
        btn19.setBounds(410, 100, 150, 40);
        p6.add(btn19);
        
        JPanel img = new JPanel();
        img.setSize(341, 148);
        img.setLocation(5, 500);
        this.getContentPane().add(img);
        img.setLayout(null);
        
        JLabel imagen = new JLabel(new ImageIcon("usac.jpg"));
        imagen.setBounds(0, 0, 341, 148);
        img.add(imagen);
    }
}
