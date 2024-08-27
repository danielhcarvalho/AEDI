package C04;

import java.text.NumberFormat;
import java.util.Scanner;

public class C04EX03 
{
    public static void main(String[] args) 
    {
        double valor1, valor2, multa1, multa2, multa3;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de poluentes 01: ");
        valor1 = input.nextDouble();
        System.out.print("Informe a quantidade de poluentes 02: ");
        valor2 = input.nextDouble();
        System.out.print("Informe o valor da multa 01: ");
        multa1 = input.nextDouble();
        System.out.print("Informe o valor da multa 02: ");
        multa2 = input.nextDouble();
        System.out.print("Informe o valor da multa 03: ");
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
