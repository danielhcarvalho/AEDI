package C05;

import javax.swing.JOptionPane;

public class C05EX06 
{
    public static void main(String[] args) 
    {
        double valorA, valorB, valorC, x, y, distancia;

        valorA = Double.valueOf(JOptionPane.showInputDialog(null,
            "Informe o valor A da reta: ",
            null, 
            JOptionPane.QUESTION_MESSAGE));
        valorB = Double.valueOf(JOptionPane.showInputDialog(null,
            "Informe o valor B da reta: ",
            null, 
            JOptionPane.QUESTION_MESSAGE));
        valorC = Double.valueOf(JOptionPane.showInputDialog(null,
         "Informe o valor C da reta: ",
            null, 
            JOptionPane.QUESTION_MESSAGE));
        x = Double.valueOf(JOptionPane.showInputDialog(null,
            "Informe o valor das coordenas x do ponto: ",
            null, 
            JOptionPane.QUESTION_MESSAGE));
        y = Double.valueOf(JOptionPane.showInputDialog(null,
            "Informe o valor das coordenas y do ponto: ",
            null, 
            JOptionPane.QUESTION_MESSAGE));

        distancia = (valorA * x + valorB * y + valorC) / Math.sqrt(Math.pow(valorA, 2) + Math.pow(valorB, 2));
        
        JOptionPane.showMessageDialog(null, 
            "A distância entre a reta e o ponto é equivalente a " + distancia);

    }
}
