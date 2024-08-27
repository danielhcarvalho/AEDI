package C05;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class C05EX01 
{
    public static void main(String[] args) 
    {
        double fx, x;

        x = Double.valueOf(JOptionPane.showInputDialog(null, 
        "Informe o valor de x", 
        null, 
        JOptionPane.QUESTION_MESSAGE));

        fx = Math.pow(x, 3) + 4 * x + 10;

        JOptionPane.showMessageDialog(null, 
        "f(x) = " + DecimalFormat.getNumberInstance().format(fx), 
        null, 
        JOptionPane.INFORMATION_MESSAGE);
    }
}
