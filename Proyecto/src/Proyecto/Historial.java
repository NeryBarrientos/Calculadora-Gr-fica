
package Proyecto;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Historial extends JFrame{
    
    
    public static String[]  Favoritos = new String[1000];
    JTextArea dato;
    
    public Historial(){
        
        super("Favoritos");
        
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        
        dato = new JTextArea();
        dato.setFont(new Font("arial", Font.ITALIC, 20));
        dato.setBounds(0, 0, 400, 400);
        add(dato);          
        
        String fav  = "";
        for (int i = 0; i < Favoritos.length; i++) {
            if(Favoritos[i] != null)
                fav += "\n"+ Favoritos[i];
        }
        dato.setText(fav);
    }
    
    
    public static void AgregarFavorito(String valor){
        int agregado = 0;
        for (int i = 0; i < Favoritos.length; i++) {
            
            if(Favoritos[i] == null && agregado == 0){
               Favoritos[i] = valor;
               agregado = 1;
            }    
        }
    }
}
