package C04;

import java.text.NumberFormat;
import java.util.Scanner;

public class C04EX05 
{
    public static void main(String[] args) 
    {
        double valor1, valor2, multa1, multa2, multa3;
        Scanner input = new Scanner(C04EX05.class.getResourceAsStream("multas.txt"));

        valor1 = input.nextDouble();
        valor2 = input.nextDouble();
        multa1 = input.nextDouble();
        multa2 = input.nextDouble();
        multa3 = input.nextDouble();

        System.out.printf("""
                =================================================================
                Até %.0f multa de %s
                -----------------------------------------------------------------
                Entre %.0f e %.0f multa de %s
                -----------------------------------------------------------------
                Acima de %.0f multa de %s por poluente emitido
                =================================================================
                """, valor1, NumberFormat.getCurrencyInstance().format(multa1), valor1, valor2, NumberFormat.getCurrencyInstance().format(multa2), valor2, NumberFormat.getCurrencyInstance().format(multa3));
        input.close();
    }   
}
