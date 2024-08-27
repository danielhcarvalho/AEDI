package C05;

import javax.swing.JOptionPane;

public class C05EX04 
{
    public static void main(String[] args) 
    {
        double x1, x2, y1, y2, distancia;

        x1 = Double.valueOf(JOptionPane.showInputDialog(null,
        "Informe o valor das cordenadas x do ponto 1: ",
        null,
        JOptionPane.QUESTION_MESSAGE));

        y1 = Double.valueOf(JOptionPane.showInputDialog(null,
        "Informe o valor das cordenadas y do ponto 1: ",
        null,
        JOptionPane.QUESTION_MESSAGE));

        x2 = Double.valueOf(JOptionPane.showInputDialog(null,
        "Informe o valor das cordenadas x do ponto 2: ",
        null,
        JOptionPane.QUESTION_MESSAGE));

        y2 = Double.valueOf(JOptionPane.showInputDialog(null,
        "Informe o valor das cordenadas y do ponto 2: ",
        null,
        JOptionPane.QUESTION_MESSAGE));

        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        JOptionPane.showMessageDialog(null, 
        "A distância entre os dois pontos é de " + distancia);

    }
}
