package C05;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class C05EX03 
{
    public static void main(String[] args) 
    {
        double salario, salarioLiquido, imposto;
        byte numeroDependentes;

        salario = Double.valueOf(JOptionPane.showInputDialog(null,
        "Informe o seu salário atual: ",
        null,
        JOptionPane.QUESTION_MESSAGE));
        
        numeroDependentes = Byte.valueOf(JOptionPane.showInputDialog(null,
        "Informe o número de dependentes que você possui: ",
        null,
        JOptionPane.QUESTION_MESSAGE));

        salarioLiquido = salario - numeroDependentes * 60;
        imposto = salarioLiquido * 15/100;

        System.out.printf("""
                    Salário líquido = %s
                    Imposto de renda = %s
                """, NumberFormat.getCurrencyInstance().format(salarioLiquido), NumberFormat.getCurrencyInstance().format(imposto));

    }
}
