
package Proyecto;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Coseno extends JFrame{
    public Coseno(){
    
        super("Coseno");
        this.setSize(450,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        JLabel cosenos = new JLabel("Cos( ");
        cosenos.setBounds(40, 50, 60, 50);
        cosenos.setFont(new Font("arial", Font.PLAIN, 25));
        add(cosenos);
        
        JTextField dato = new JTextField();
        dato.setFont(new Font("arial", Font.ITALIC, 20));
        dato.setHorizontalAlignment(SwingConstants.CENTER);
        dato.setBounds(100, 50, 50, 40);
        add(dato);
        
        JLabel parente = new JLabel(" )");
        parente.setBounds(150, 50, 50, 50);
        parente.setFont(new Font("arial", Font.PLAIN, 25));
        add(parente);
        
        JLabel resultado = new JLabel("Resultado:");
        resultado.setBounds(40, 100, 100, 50);
        resultado.setFont(new Font("arial", Font.PLAIN, 20));
        add(resultado);
        
        JTextField resul = new JTextField();
        resul.setBounds(140, 150, 150, 50);
        resul.setHorizontalAlignment(SwingConstants.CENTER);
        add(resul);
        
        JButton calcular = new JButton("Calcular");
        calcular.setBounds(300, 150, 100, 50);
        add(calcular);
        
        JButton guardar = new JButton("Guardar Resultado");
        guardar.setBounds(40, 210, 150, 50);
                ActionListener guardarfav = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Historial.AgregarFavorito(resul.getText() + " - Coseno");
            }
        };
        guardar.addActionListener(guardarfav);
        add(guardar);
        
        String [] grados = {"Grados" , "Sexagesimales" , "Radianes"};
        
        JComboBox cmb1 = new JComboBox(grados); 
        cmb1.setBounds(200, 50, 120, 30);
        add(cmb1);
        
                ActionListener btn = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.00");
                float n = Float.parseFloat(dato.getText())*(float)(3.1416/180);
                float muestra = cosinus(n);
                float m = Float.parseFloat(dato.getText());
                float result = cosinus(m);
                if(cmb1.getSelectedItem().equals("Sexagesimales")){
                    resul.setText(String.valueOf(df.format(muestra)));
                }else if(cmb1.getSelectedItem().equals("Radianes")){
                    resul.setText(String.valueOf(df.format(result)));
                }else{
                JOptionPane.showMessageDialog(null, "No se eligión el sistema de Grados a trabajar");
                }
            }
        };
        calcular.addActionListener(btn);
		
	}
       public static float cosinus (float graus) {
      
         int i;
      
         float s = 0;
      
         int signo = 1;
      
      
      
         for(i=0; i<10; i+=2)
        
         {
        
            s += signo*pow(graus, i) / factorial(i);
        
            signo *= -1;
        
         }
      
      
         return s;
      
      }
  
       public static float factorial(int graus){
      
         int i;
      
         float fact = 1;
      
      
      
         for(i=1; i<=graus; i++)
        
            fact *= i;
      
      
      
         return fact;
      
      }
  
       public static float pow(float graus, int n){
      
      
      
         int i;
      
         float pow =1;
      
      
      
         if(graus==0)
            return 0;
      
      
      
         for(i=1; i<=n; i++)
        
            pow = pow*graus;
      
      
      
         return pow;
      
      }
}