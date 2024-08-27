package C05;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class C05EX02 
{
    public static void main(String[] args) 
    {
        double area, volume, raio;

        raio = Double.valueOf(JOptionPane.showInputDialog(null, 
        "Informe o raio do círculo: ", 
        null, 
        JOptionPane.QUESTION_MESSAGE));

        area = 4 * Math.PI * Math.pow(raio, 2);
        volume = 4/3.0 * Math.PI * Math.pow(raio, 3);

        JOptionPane.showMessageDialog(null, 
        "Área = " + DecimalFormat.getNumberInstance().format(area) + "\nVolume = " + DecimalFormat.getNumberInstance().format(volume), 
        null, 
        JOptionPane.INFORMATION_MESSAGE);
    }
}
