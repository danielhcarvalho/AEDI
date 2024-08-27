package C05;

import javax.swing.JOptionPane;

public class C05EX05 
{
    public static void main(String[] args) 
    {
        float tempCelsius, tempKelvin, tempFahrenheit;

        tempCelsius = Float.valueOf(JOptionPane.showInputDialog(null,
        "Informe a temperatura em graus Celsius: ",
        null, 
        JOptionPane.QUESTION_MESSAGE));

        tempKelvin = tempCelsius + 273;
        tempFahrenheit = (float)(tempCelsius * 1.8 + 32);

        System.out.printf("""
            Kelvin = %.1f°
            Fahrenheit = %.1f°
            """, tempKelvin, tempFahrenheit);
    }
}
