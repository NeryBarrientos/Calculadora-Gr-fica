
package Proyecto;

import static Proyecto.Calculadora.procedimiento;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class AlgebraLineal   extends JFrame {
    
    JLabel texto;
    JTextField dato,resultado;
    float[][] matriz;
    public AlgebraLineal(){
        
        
        super("Algebra Lineal");
                
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        dato = new JTextField();
        resultado = new JTextField();
        
        if(VentanaPrincipal.b1 == true){
            //titulo
            texto = new JLabel("Matriz Transpuesta:");
            texto.setBounds(40, 50, 200, 50);
            texto.setFont(new Font("arial", Font.PLAIN, 12));
            add(texto);
            
            //campo
            dato.setFont(new Font("arial", Font.ITALIC, 20));
            dato.setHorizontalAlignment(SwingConstants.CENTER);
            dato.setBounds(200, 50, 150, 40);
            add(dato);          
        }else if(VentanaPrincipal.b2 == true){
            //titulo
            JLabel texto = new JLabel("Matriz Inversa:");
            texto.setBounds(40, 50, 200, 50);
            texto.setFont(new Font("arial", Font.PLAIN, 12));
            add(texto);
            
            
            //campo
            dato.setFont(new Font("arial", Font.ITALIC, 20));
            dato.setHorizontalAlignment(SwingConstants.CENTER);
            dato.setBounds(200, 50, 150, 40);
            add(dato);        
            
        }else if(VentanaPrincipal.b3 == true){
            //titulo
            JLabel texto = new JLabel("Determinante:");
            texto.setBounds(40, 50, 200, 50);
            texto.setFont(new Font("arial", Font.PLAIN, 12));
            add(texto);
            //campo
            dato.setFont(new Font("arial", Font.ITALIC, 20));
            dato.setHorizontalAlignment(SwingConstants.CENTER);
            dato.setBounds(200, 50, 150, 40);
            add(dato);
        }
        
        
        //campo
        texto = new JLabel("Resultado:");
        texto.setBounds(40, 250, 200, 50);
        texto.setFont(new Font("arial", Font.PLAIN, 12));
        add(texto);
        
        //resultado
        resultado.setFont(new Font("arial", Font.ITALIC, 20));
        resultado.setHorizontalAlignment(SwingConstants.CENTER);
        resultado.setBounds(200, 250, 150, 50);
        add(resultado);
            
        JButton calcular = new JButton("Calcular");
        calcular.setBounds(200, 150, 100, 50);
        add(calcular); 
        
        
         ActionListener calcula = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h = 0;
                String[] cadena =  dato.getText().split(",");
                int x = Integer.valueOf(cadena.length);
                x = CalcularRaiz(x);  
                matriz = new float[x][x];
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < x; j++) {
                        matriz[i][j] = Integer.valueOf(cadena[h]);
                        h++;
                    }
                }
                
                if(VentanaPrincipal.b1 == true){
                    matriz = Tranpuesta(matriz);
                    resultado.setText(mostrarMatriz(matriz));
                }
                else if(VentanaPrincipal.b2 == true){
                    matriz = matrizInversa(matriz);
                    resultado.setText(mostrarMatriz(matriz));
                }
                else if(VentanaPrincipal.b3 == true){
                    resultado.setText(String.valueOf(determinante(matriz)));
                }        
            }
        };
        calcular.addActionListener(calcula);
       
       
    
    }
    
    
    public int CalcularRaiz(int x){
        int num = x;
        for(int i = 0; i < 20; i ++){
                        x = (((x * x) + num) / (2 * x));
        }
        
        return x;    
    }
    
    public float[][] Tranpuesta(float[][] matriz){
        float[][] matrizCopia =  new float[matriz.length][matriz.length];
              for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {                
                            matrizCopia[j][i] = matriz[i][j];
                        }
              }
              
        return matrizCopia;
    }   
    
    public  float[][] matrizInversa(float[][] matriz) {
        float det=1/determinante(matriz);
        float[][] nmatriz=matrizAdjunta(matriz);
        multiplicarMatriz(det,nmatriz);
        return nmatriz;
    }
    
     public void multiplicarMatriz(float n, float[][] matriz) {
        for(int i=0;i<matriz.length;i++)
            for(int j=0;j<matriz.length;j++)
                matriz[i][j]*=n;
    }
    
    public  float[][] matrizAdjunta(float [][] matriz){
        return Tranpuesta(matrizCofactores(matriz));
    }

    public  float[][] matrizCofactores(float[][] matriz){
        float[][] nm=new float[matriz.length][matriz.length];
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz.length;j++) {
                float[][] det=new float[matriz.length-1][matriz.length-1];
                float detValor;
                for(int k=0;k<matriz.length;k++) {
                    if(k!=i) {
                        for(int l=0;l<matriz.length;l++) {
                            if(l!=j){
                                int indice1=k<i ? k : k-1 ;
                                int indice2=l<j ? l : l-1 ;
                                det[indice1][indice2]=matriz[k][l];
                            }
                        }
                    }
                }
                detValor = det[0][0];
                nm[i][j]=detValor * CalcularPotencia(-1, i+j+2);
            }
        }
        return nm;
    }

    
    public String mostrarMatriz(float[][] matriz){
        String cadena = "";
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        cadena += String.valueOf(matriz[i][j])+ ",";
                    }
                }
                
        return cadena.substring(0, cadena.length() - 1);
    }
    
    public  float determinante(float[][] matriz){
        float det;
        if(matriz.length==2){
            det=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
            return det;
        }
        float suma=0;
        for(int i=0; i<matriz.length; i++){
        float[][] nm=new float[matriz.length-1][matriz.length-1];
            for(int j=0; j<matriz.length; j++){
                if(j!=i){
                    for(int k=1; k<matriz.length; k++){
                        int indice=-1;
                        if(j<i)
                            indice=j;
                        else if(j>i)
                            indice=j-1;
                            nm[indice][k-1]=matriz[j][k];
                    }
                }
            }
            if(i%2==0)
                suma+=matriz[i][0] * determinante(nm);
            else
                suma-=matriz[i][0] * determinante(nm);
        }
        return suma;
    }
    
    
    public float CalcularPotencia(float n, float potencia){
        float resultado = 1;
        for (int i = 1; i <= potencia; i++) {
            resultado = resultado * n;
        }
        
        return resultado;
    }
}
