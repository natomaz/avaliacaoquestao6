package expari;

import javax.swing.JOptionPane;

public class ExpAri {
    public static void main(String[] args) {
        //Faça um algoritmo que receba o valor do raio de um circulo qualquer. 
        //Calcule o perímetro do círculo (P = 2.pi.r) , a Área do circulo (A = PI . r²) e o Diâmetro do círculo (D = 2 . r). 
        //Mostre os resultados.
        double raio, perimetro, area, diametro;
        
        //entrada
        raio = Double.parseDouble(JOptionPane.showInputDialog("Inserir o raio"));
        
        //processamento
        perimetro = 2*Math.PI*raio;
        area = Math.PI*Math.pow(raio, 2);
        diametro = 2 * raio;
        
        //saída
        
        JOptionPane.showMessageDialog(null, "O círculo tem "+perimetro+" de perímetro, "+area+" de área e "+diametro+" de diâmetro.");
        }
    }
