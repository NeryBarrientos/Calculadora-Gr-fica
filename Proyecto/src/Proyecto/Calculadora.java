
package Proyecto;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class Calculadora extends JFrame{
        String valor1;
        String signo;
        String valor2;
        
    public Calculadora(){
         
        super("Calculadora aritmética");
        this.setSize(530,550);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        JFrame vencalcu=this;
        Border border = LineBorder.createGrayLineBorder();
        
        JPanel p1 = new JPanel();
        p1.setSize(490, 490);
        p1.setLocation(10, 10);
        this.getContentPane().add(p1);
        //p1.setBackground(Color.GREEN);
        p1.setBorder(border);
        p1.setLayout(null);
        
        JLabel pantalla = new JLabel("0",SwingConstants.RIGHT);
        pantalla.setBounds(50, 50, 230, 50);
        pantalla.setFont(new Font("arial", Font.ITALIC, 30));
        pantalla.setBorder(border);
        p1.add(pantalla);
        
        JButton calcular = new JButton("Calcular");
        calcular.setBounds(300, 50, 150, 50);
        p1.add(calcular);
        
        ActionListener igual = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultado;
                valor2=pantalla.getText();
                
                if(!valor2.equals("")){
                    resultado = procedimiento(valor1,valor2,signo);
                    pantalla.setText(resultado);
                }
                
            }
        };
        calcular.addActionListener(igual);
        
        JButton no1 = new JButton("1");
        no1.setBounds(50, 150, 50, 50);
        p1.add(no1);
        
        ActionListener num1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               pantalla.setText(pantalla.getText()+"1");
            }
        };
        no1.addActionListener(num1);
        
        JButton no2 = new JButton("2");
        no2.setBounds(110, 150, 50, 50);
        p1.add(no2);
        
        ActionListener num2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               pantalla.setText(pantalla.getText()+"2");
            }
        };
        no2.addActionListener(num2);
        
        JButton no3 = new JButton("3");
        no3.setBounds(170, 150, 50, 50);
        p1.add(no3);
        
        ActionListener num3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               pantalla.setText(pantalla.getText()+"3");
            }
        };
        no3.addActionListener(num3);
        
        JButton suma = new JButton("+");
        suma.setBounds(230, 150, 50, 50);
        p1.add(suma);
        
        ActionListener sum = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!pantalla.getText().equals("")){
                    valor1=pantalla.getText(); 
                    signo = "+";
                    pantalla.setText("");
                    
                }
            }
        };
        suma.addActionListener(sum);
        
        JButton no4 = new JButton("4");
        no4.setBounds(50, 210, 50, 50);
        p1.add(no4);
        
        ActionListener num4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               pantalla.setText(pantalla.getText()+"4");
            }
        };
        no4.addActionListener(num4);
        
        JButton no5 = new JButton("5");
        no5.setBounds(110, 210, 50, 50);
        p1.add(no5);
        
        ActionListener num5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               pantalla.setText(pantalla.getText()+"5");
            }
        };
        no5.addActionListener(num5);
        
        JButton no6 = new JButton("6");
        no6.setBounds(170, 210, 50, 50);
        p1.add(no6);
        
        ActionListener num6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               pantalla.setText(pantalla.getText()+"6");
            }
        };
        no6.addActionListener(num6);
        
        JButton resta = new JButton("-");
        resta.setBounds(230, 210, 50, 50);
        p1.add(resta);
        
        ActionListener rest = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!pantalla.getText().equals("")){
                    valor1=pantalla.getText(); 
                    signo = "-";
                    pantalla.setText("");
                    
                }
            }
        };
        resta.addActionListener(rest);
        
        JButton no7 = new JButton("7");
        no7.setBounds(50, 270, 50, 50);
        p1.add(no7);
        
        ActionListener num7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               pantalla.setText(pantalla.getText()+"7");
            }
        };
        no7.addActionListener(num7);
        
        JButton no8 = new JButton("8");
        no8.setBounds(110, 270, 50, 50);
        p1.add(no8);
        
        ActionListener num8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               pantalla.setText(pantalla.getText()+"8");
            }
        };
        no8.addActionListener(num8);
        
        JButton no9 = new JButton("9");
        no9.setBounds(170, 270, 50, 50);
        p1.add(no9);
        
        ActionListener num9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               pantalla.setText(pantalla.getText()+"9");
            }
        };
        no9.addActionListener(num9);
        
        JButton multi = new JButton("X");
        multi.setBounds(230, 270, 50, 50);
        p1.add(multi);
        
        ActionListener mult = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!pantalla.getText().equals("")){
                    valor1=pantalla.getText(); 
                    signo = "*";
                    pantalla.setText("");
                    
                }
            }
        };
        multi.addActionListener(mult);
        
        JButton raizn = new JButton("n√");
        raizn.setBounds(50, 330, 50, 50);
        raizn.setFont(new Font("arial", Font.PLAIN, 12));
        p1.add(raizn);
        
        ActionListener btnraizn = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(!pantalla.getText().equals("")){
                    valor1=pantalla.getText(); 
                    signo = "n√";
                    pantalla.setText("");
                    
                }
            }
        };
        raizn.addActionListener(btnraizn);
        
        JButton no0 = new JButton("0");
        no0.setBounds(110, 330, 50, 50);
        p1.add(no0);
        
        ActionListener num0 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               pantalla.setText(pantalla.getText()+"0");
            }
        };
        no0.addActionListener(num0);
        
        JButton neg = new JButton("(-)");
        neg.setBounds(170, 330, 50, 50);
        p1.add(neg);
        
        ActionListener negativo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num;
                String n;
                n=pantalla.getText();
                if(n.length()>0){
                    num =(-1)* Integer.parseInt(n);
                    pantalla.setText(String.valueOf(num));
                }
            }
        };
        neg.addActionListener(negativo);
        
        JButton div = new JButton("/");
        div.setBounds(230, 330, 50, 50);
        p1.add(div);
        
        ActionListener divi = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!pantalla.getText().equals("")){
                    valor1=pantalla.getText(); 
                    signo = "/";
                    pantalla.setText("");
                    
                }
            }
        };
        div.addActionListener(divi);
        
        JButton potencia = new JButton("^");
        potencia.setBounds(50, 390, 50, 50);
        p1.add(potencia);
        
        ActionListener btnpotencia = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(!pantalla.getText().equals("")){
                    valor1=pantalla.getText(); 
                    signo = "^";
                    pantalla.setText("");
                    
                }
            }
        };
        potencia.addActionListener(btnpotencia);
        
        JButton raiz = new JButton("√");
        raiz.setBounds(110, 390, 50, 50);
        p1.add(raiz);
        
        ActionListener bottRaiz = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float x = Float.parseFloat(pantalla.getText());
                float num = Float.parseFloat(pantalla.getText());
                DecimalFormat df = new DecimalFormat("#.0000");
                if(num >= 0){
                int i;
                for(i = 0; i < 20; i ++){
                    x = (((x * x) + num) / (2 * x));
                }
                pantalla.setText(String.valueOf(df.format(x)));
                }
            }
        };                
        raiz.addActionListener(bottRaiz);
        
        JButton inverso = new JButton("1/x");
        inverso.setBounds(170, 390, 50, 50);
        inverso.setFont(new Font("arial", Font.PLAIN, 12));
        p1.add(inverso);
        
        ActionListener bottInverso = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n;
                Double num;
                DecimalFormat df = new DecimalFormat("#.0000");
                n = pantalla.getText();
                if(n.length()>0){
                    num = 1/(Double.parseDouble(n));
                    pantalla.setText(df.format(num).toString());
                }
            }
        };
        inverso.addActionListener(bottInverso);
        
        JButton fact = new JButton("!");
        fact.setBounds(230, 390, 50, 50);
        p1.add(fact);
        
        ActionListener bottFact = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n;
                Integer num,fact = 1;                
                n = pantalla.getText();
                if(n.length()>0){
                    num = Integer.parseInt(n);
                    while ( num!=0) {
                    fact=fact*num;
                    num--;
                    }
                    
                    pantalla.setText(fact.toString());
                  }
            }
        };
        fact.addActionListener(bottFact);        
        
        JButton guardar = new JButton("<html><center>Guardar Resultado <html>");
        guardar.setBounds(300, 290, 150, 150);
        ActionListener guardarfav = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Historial.AgregarFavorito(pantalla.getText() + "  - Calculadora");
            }
        };
        guardar.addActionListener(guardarfav);
        p1.add(guardar);

    }
    
        public static String procedimiento(String valor1, String valor2, String signo){
        
            Double resultado=0.0;
            String respuesta;
            DecimalFormat df = new DecimalFormat("#.00");
            if(signo.equals("-")){
            resultado = Double.parseDouble(valor1)-Double.parseDouble(valor2);
            }
        
            if(signo.equals("+")){
            resultado = Double.parseDouble(valor1)+Double.parseDouble(valor2);
            }
            
            if(signo.equals("*")){
            resultado = Double.parseDouble(valor1)*Double.parseDouble(valor2);
            }
            
            if(signo.equals("/")){
            resultado = Double.parseDouble(valor1)/Double.parseDouble(valor2);
            }
            
            if(signo.equals("^")){
            resultado = 1.0;
            
            for(int i=1;i<=Integer.parseInt(valor2);i++){
                
                resultado= resultado * Double.parseDouble(valor1);
            
            }
            
            }
            
            if(signo.equals("n√")){
            
                resultado = (Double)Math.pow(Double.parseDouble(valor1), 1.0/Double.parseDouble(valor2));
                
            }
            respuesta = String.valueOf(df.format(resultado));
            return respuesta;
        } 
    
}
