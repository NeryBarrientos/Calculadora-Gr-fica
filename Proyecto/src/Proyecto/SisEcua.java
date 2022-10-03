
package Proyecto;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


public class SisEcua extends JFrame{
    
    
        public SisEcua(){
            
                super("Sistema de Ecuaciones");
                
                this.setSize(400,430);
                this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.setLayout(null);
                this.setLocationRelativeTo(null);
                JFrame VentanaCuadra=this;
                
                int tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un tamaño"));
        
                JPanel p1 = new JPanel();
                p1.setSize(360, 370);
                p1.setLocation(10, 10);
                this.getContentPane().add(p1);
                p1.setBackground(Color.LIGHT_GRAY);
                p1.setLayout(null);
        
                JLabel lbl1 = new JLabel("Sistema:");
                lbl1.setBounds(50, 50, 100, 50);
                lbl1.setFont(new Font("arial", Font.ITALIC, 20));
                p1.add(lbl1);
                
                JTextField tamsis1 = new JTextField();
                tamsis1.setText(String.valueOf(tam));
                tamsis1.setBounds(150, 50, 50, 50);
                tamsis1.setFont(new Font("arial", Font.ITALIC, 20));
                tamsis1.setHorizontalAlignment(SwingConstants.CENTER);
                p1.add(tamsis1);
                
                JLabel lblx = new JLabel("X");
                lblx.setBounds(210, 50, 50, 50);
                lblx.setFont(new Font("arial", Font.PLAIN, 25));
                p1.add(lblx);
                
                JTextField tamsis2 = new JTextField();
                tamsis2.setText(String.valueOf(tam));
                tamsis2.setBounds(240, 50, 50, 50);
                tamsis2.setFont(new Font("arial", Font.ITALIC, 20));
                tamsis2.setHorizontalAlignment(SwingConstants.CENTER);
                p1.add(tamsis2);
                
                JTextField [] campos = new JTextField[tam];
                JLabel [] tamaño = new JLabel[tam];
                JTextField [] resultado = new JTextField[tam];
                
                char letra = 'A';
                int z=0;
                int columna=50, fila = 120, colum=110, fil=120, columresul=0,filresul=0;
                
                for(int y=0; y<tam; y++){
                    
                    for(int x=0;x<tam;x++){
                        campos[x] = new JTextField();
                        campos[x].setBounds(columna, fila, 50, 50);
                        p1.add(campos[x]);
                        columna+=80;
                    
                        tamaño[x] = new JLabel();
                    
                        if(x<tam-1){
                            tamaño[x].setText(String.valueOf(letra + " +"));
                        }else {
                            tamaño[x].setText(String.valueOf(letra + " ="));
                        }
                        tamaño[x].setBounds(colum, fil, 50, 50);
                        p1.add(tamaño[x]);
                        colum+=80;
                        letra++;
                        
                        }
                        columresul= columna + 10;
                        filresul = fila ;
                        resultado[y] = new JTextField();
                        resultado[y].setBounds(columresul, filresul, 50, 50);
                        p1.add(resultado[y]);
                        letra = 'A';
                        columna=50;
                        colum=110;
                        fil+=70;
                        fila+=70;
                    }    
                
        }
    
}
