package C05;

import javax.swing.JOptionPane;

public class C05EX08 
{
    public static void main(String[] args) 
    {
        final double pi = 3.1416;
        double area, angulo, raio;

        area = Double.valueOf(JOptionPane.showInputDialog(null,
            "Informeo o valor da área do setor circular: ",
            null,
            JOptionPane.QUESTION_MESSAGE));
        angulo = Double.valueOf(JOptionPane.showInputDialog(null,
            "Informeo o valor do ângulo do setor circular: ",
            null,
            JOptionPane.QUESTION_MESSAGE));

        raio = Math.sqrt(360 * area / (angulo * pi));

        System.out.println(raio);

    }
}
