
package Proyecto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.text.DecimalFormat;

public class LongArco extends JFrame {
    public LongArco(){
    
    super("Longitud de arco");
                
        this.setSize(460,300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        JFrame VentanaCuadra=this;
        
        JLabel lbl1 = new JLabel("Ángulo");
        lbl1.setBounds(20, 20, 100, 50);
        lbl1.setFont(new Font("arial", Font.PLAIN, 20));
        add(lbl1);
        
        JLabel lbl2 = new JLabel("Radio");
        lbl2.setBounds(20, 70, 100, 50);
        lbl2.setFont(new Font("arial", Font.PLAIN, 20));
        add(lbl2);
        
        JLabel lbl3 = new JLabel("Resultado:");
        lbl3.setBounds(20, 150, 100, 50);
        lbl3.setFont(new Font("arial", Font.ITALIC, 20));
        add(lbl3);
        
        JTextField txt1 = new JTextField();
        txt1.setBounds(100, 20, 100, 40);
        txt1.setFont(new Font("arial", Font.PLAIN, 20));
        txt1.setHorizontalAlignment(SwingConstants.CENTER);
        add(txt1);
        
        JTextField txt2 = new JTextField();
        txt2.setBounds(100, 70, 100, 40);
        txt2.setFont(new Font("arial", Font.PLAIN, 20));
        txt2.setHorizontalAlignment(SwingConstants.CENTER);
        add(txt2);
        
        JTextField txt3 = new JTextField();
        txt3.setBounds(120, 150, 100, 40);
        txt3.setFont(new Font("arial", Font.PLAIN, 20));
        txt3.setHorizontalAlignment(SwingConstants.CENTER);
        add(txt3);
        
        JButton btn1 = new JButton("Calcular");
        btn1.setBounds(230, 150, 100, 40);
        add(btn1);
        
        String [] equipo = {"Elije una opción de Grados" , "Sexagesimales" , "Radianes"};
        
        JComboBox cmb1 = new JComboBox(equipo);
        cmb1.setAlignmentX(CENTER_ALIGNMENT);
        cmb1.setAlignmentY(CENTER_ALIGNMENT);
        cmb1.setBounds(220, 20, 180, 30);
        add(cmb1);
        
        ActionListener calcu = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if(cmb1.getSelectedItem().equals("Sexagesimales")){
                 DecimalFormat df = new DecimalFormat("#.00");
                 Double resultado =(2.0*3.141593*Double.parseDouble(txt1.getText())*Double.parseDouble(txt2.getText())/(360.0));
                 txt3.setText(df.format(resultado).toString());
             }else if(cmb1.getSelectedItem().equals("Radianes")){
                 DecimalFormat df = new DecimalFormat("#.00");
                 Double resultado = Double.parseDouble(txt1.getText()) * Double.parseDouble(txt2.getText());
                 txt3.setText(df.format(resultado).toString());
             }else{
                 JOptionPane.showMessageDialog(null, "No se eligión el sistema de Grados a trabajar");
             }
            JFrame f = new JFrame("Arco");
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            int w=Integer.parseInt(txt1.getText());
            Grafica p = new Grafica(w);
            f.add(p);
            f.setSize(500,500);
            f.setVisible(true);
       }
    };
        btn1.addActionListener(calcu);
        
        JButton btn2 = new JButton("Guardar Resultado");
        btn2.setBounds(220, 90, 150, 40);  
        ActionListener guardarfav = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Historial.AgregarFavorito(txt3.getText()+ " - Longitud de Arco");
            }
        };
        btn2.addActionListener(guardarfav);
        add(btn2);
    }
}
