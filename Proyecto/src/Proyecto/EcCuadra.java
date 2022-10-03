
package Proyecto;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.text.DecimalFormat;
public class EcCuadra extends JFrame{

    public EcCuadra(){
    
        super("Ecuación cuadrática");
        this.setSize(400,430);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        JFrame VentanaCuadra=this;
        
        JPanel p1 = new JPanel();
        p1.setSize(360, 370);
        p1.setLocation(10, 10);
        this.getContentPane().add(p1);
        p1.setBackground(Color.GREEN);
        p1.setLayout(null);
        
        JLabel lbl1 = new JLabel("Ecuación cuadratica");
        lbl1.setBounds(50, 50, 230, 50);
        lbl1.setFont(new Font("arial", Font.ITALIC, 20));
        p1.add(lbl1);
        
        JTextField txt1 = new JTextField();
        txt1.setBounds(50, 110, 40, 40);
        p1.add(txt1);
               
        JLabel x2 = new JLabel("X² + ");
        x2.setBounds(100, 110, 60, 40);
        x2.setFont(new Font("arial", Font.PLAIN, 20));
        p1.add(x2);
        
        JTextField txt2 = new JTextField();
        txt2.setBounds(150, 110, 40, 40);
        p1.add(txt2);
        
        JLabel x = new JLabel("X + ");
        x.setBounds(200, 110, 60, 40);
        x.setFont(new Font("arial", Font.PLAIN, 20));
        p1.add(x);
        
        JTextField txt3 = new JTextField();
        txt3.setBounds(240, 110, 40, 40);
        p1.add(txt3);
        
        JLabel lbl2 = new JLabel("Resultado:");
        lbl2.setBounds(50, 160, 230, 50);
        lbl2.setFont(new Font("arial", Font.ITALIC, 20));
        p1.add(lbl2);
        
        JLabel resultado1 = new JLabel("X1");
        resultado1.setBounds(80, 200, 230, 50);
        resultado1.setFont(new Font("arial", Font.PLAIN, 20));
        p1.add(resultado1);
        
        JLabel resultado2 = new JLabel("X2");
        resultado2.setBounds(80, 250, 230, 50);
        resultado2.setFont(new Font("arial", Font.PLAIN, 20));
        p1.add(resultado2);
        
        JTextField resudonum1 = new JTextField();
        resudonum1.setBounds(130, 200, 80, 40);
        p1.add(resudonum1);
        
        JTextField resudonum2 = new JTextField();
        resudonum2.setBounds(130, 250, 80, 40);
        p1.add(resudonum2);
        
        JButton calcular = new JButton("Calcular");
        calcular.setBounds(240, 200, 100, 50);
        p1.add(calcular);
        
        ActionListener calculad = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a,b,c;
                a = Double.parseDouble(txt1.getText());
                b = Double.parseDouble(txt2.getText());
                c = Double.parseDouble(txt3.getText());
                DecimalFormat df = new DecimalFormat("#.00");
                
                Double determina = (b*b)-(4*a*c);
                    Double x1,x2,x=1.0;                
                if(determina>=0){
                    for(int i = 0; i < 20; i ++){
                    x = (x + (determina/x))/2;
                }
                    x1 = ((b*(-1))+ x) / (2*a);
                    x2 = ((b*(-1))- x) / (2*a);
                    resudonum1.setText(String.valueOf(df.format(x1)));
                    resudonum2.setText(String.valueOf(df.format(x2)));
                }else
                    JOptionPane.showMessageDialog(null,
                    "Discriminante < 0, no se puede realizar operaciones con numeros imaginarios",
                    "Error en el discriminante",
                    JOptionPane.WARNING_MESSAGE);
            }
        };
        calcular.addActionListener(calculad);
        
        JButton guardar = new JButton("Guardar resultado");
        guardar.setBounds(100, 300, 150, 50);
        p1.add(guardar);
        
    }
   /* public Double procedimiento(){
        a= Double.parseDouble(valor1);
        b = Double.parseDouble(valor2);
        c = Double.parseDouble(valor3);
    Double determina = (b*b)-(4*a*c);
        if(determina>0.0){
    }
        return 0.0;
    }*/
}
