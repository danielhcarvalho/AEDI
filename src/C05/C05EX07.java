package C05;

import javax.swing.JOptionPane;

public class C05EX07 
{
    public static void main(String[] args) 
    {
        double fx, x;

        x = Double.valueOf(JOptionPane.showInputDialog(null,
            "Informe o valor de x: ",
            null,
            JOptionPane.QUESTION_MESSAGE));

        fx = Math.sqrt(Math.pow(x/4.0 + 1, 2) + 1/5.0 * x);

        System.out.printf("f(x) = %.2f", fx);
    }
}
