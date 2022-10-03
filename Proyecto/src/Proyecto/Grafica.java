
package Proyecto;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Grafica extends JPanel {
    
    private int x = 0;
    public Grafica(int x){
    this.x = x;
    }
    public void paintComponent(Graphics h){
        super.paintComponent(h);
        
        h.setColor(Color.RED);
        h.drawRect(30, 30, 420, 420);
        h.setColor(Color.BLACK);

        h.drawArc(40, 40, 400, 400, 0, x);
    }
}
