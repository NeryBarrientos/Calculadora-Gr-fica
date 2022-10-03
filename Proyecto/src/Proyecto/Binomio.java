
package Proyecto;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
public class Binomio extends JFrame {
    
        static Float n,m;
    
    public Binomio(){
        
        
        super("Binomio cuadrado");
                
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        JLabel abrir = new JLabel("(");
        abrir.setBounds(20, 20, 20, 40);
        abrir.setFont(new Font("arial", Font.PLAIN, 20));
        add(abrir);
        
        JTextField cuadro1 = new JTextField();
        cuadro1.setBounds(40, 20, 40, 40);
        cuadro1.setFont(new Font("arial", Font.PLAIN, 20));
        cuadro1.setHorizontalAlignment(SwingConstants.CENTER);
        add(cuadro1);
        
        JLabel A = new JLabel("A² +");
        A.setBounds(85, 20, 40, 40);
        A.setFont(new Font("arial", Font.PLAIN, 20));
        add(A);
        
        JTextField cuadro2 = new JTextField();
        cuadro2.setBounds(130, 20, 40, 40);
        cuadro2.setFont(new Font("arial", Font.PLAIN, 20));
        cuadro2.setHorizontalAlignment(SwingConstants.CENTER);
        add(cuadro2);
        
        JLabel AB = new JLabel("AB +");
        AB.setBounds(175, 20, 50, 40);
        AB.setFont(new Font("arial", Font.PLAIN, 20));
        add(AB);
        
        JTextField cuadro3 = new JTextField();
        cuadro3.setBounds(230, 20, 40, 40);
        cuadro3.setFont(new Font("arial", Font.PLAIN, 20));
        cuadro3.setHorizontalAlignment(SwingConstants.CENTER);
        add(cuadro3);
        
        JLabel B = new JLabel("B² )");
        B.setBounds(275, 20, 50, 40);
        B.setFont(new Font("arial", Font.PLAIN, 20));
        add(B);
        
        JLabel Resultado = new JLabel("Resultado:");
        Resultado.setBounds(20, 100, 100, 40);
        Resultado.setFont(new Font("arial", Font.PLAIN, 20));
        add(Resultado);
        
        JLabel abrirR = new JLabel("(");
        abrirR.setBounds(120, 150, 20, 40);
        abrirR.setFont(new Font("arial", Font.PLAIN, 20));
        add(abrirR);
        
        JTextField cuadro1R = new JTextField();
        cuadro1R.setBounds(140, 150, 40, 40);
        cuadro1R.setFont(new Font("arial", Font.PLAIN, 20));
        cuadro1R.setHorizontalAlignment(SwingConstants.CENTER);
        add(cuadro1R);
        
        JLabel AR = new JLabel("A");
        AR.setBounds(190, 150, 20, 40);
        AR.setFont(new Font("arial", Font.PLAIN, 20));
        add(AR);
        
        JTextField signo = new JTextField("");
        signo.setBounds(220, 150, 40, 40);
        signo.setFont(new Font("arial", Font.PLAIN, 20));
        signo.setHorizontalAlignment(SwingConstants.CENTER);
        add(signo);
        
        JTextField cuadro2R = new JTextField();
        cuadro2R.setBounds(265, 150, 40, 40);
        cuadro2R.setFont(new Font("arial", Font.PLAIN, 20));
        cuadro2R.setHorizontalAlignment(SwingConstants.CENTER);
        add(cuadro2R);
        
        JLabel BR = new JLabel("B )²");
        BR.setBounds(310, 150, 60, 40);
        BR.setFont(new Font("arial", Font.PLAIN, 20));
        add(BR);
        
        JButton guardar = new JButton("Guardar resultado");
        guardar.setBounds(20, 220, 150, 50);
        add(guardar);
        
        JButton calcular = new JButton("Calcular");
        calcular.setBounds(200, 220, 100, 50);
        add(calcular);
        
        ActionListener calcu = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float x = Float.parseFloat(cuadro1.getText());
                float num = Float.parseFloat(cuadro1.getText());
                DecimalFormat df = new DecimalFormat("#.0");
                if(num >= 0){
                int i;
                for(i = 0; i < 20; i ++){
                    x = (((x * x) + num) / (2 * x));
                    n=x;
                }
                cuadro1R.setText(String.valueOf(df.format(x)));
                }else{
                    JOptionPane.showMessageDialog(null, "No se puede obtener la raiz cuadrada de un numero negativo");
                }
                
                float y = Float.parseFloat(cuadro3.getText());
                float num2 = Float.parseFloat(cuadro3.getText());
                DecimalFormat df2 = new DecimalFormat("#.0");
                if(num2 >= 0){
                int i;
                for(i = 0; i < 20; i ++){
                    y = (((y * y) + num2) / (2 * y));
                    m=y;
                }
                cuadro2R.setText(String.valueOf(df2.format(y)));
                }else{
                    JOptionPane.showMessageDialog(null, "No se puede obtener la raiz cuadrada de un numero negativo");
                }
                
                Float validacion = 2*n*m;
               
                int valor = Integer.parseInt(cuadro2.getText());
                if(valor >0){
                    signo.setText("+");
                }else {
                    signo.setText("-");
                }
                if(valor<0){
                    valor = valor*(-1);
                }
                if(validacion != valor){
                    JOptionPane.showMessageDialog(null, "No ingreso un trinomio cuadrado perfecto, vuelva a ingresar un trinomio cuadrado perfecto");
                    cuadro1R.setText("");
                    cuadro2R.setText("");
                }
            }
        };
        calcular.addActionListener(calcu);
    }
    
}   