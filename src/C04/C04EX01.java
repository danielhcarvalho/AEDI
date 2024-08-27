package C04;

import java.util.Scanner;

public class C04EX01 
{
    public static void main(String[] args) 
    {
        String nome, sobrenome;
        byte idade;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu primeiro nome?");
        nome = input.nextLine();
        System.out.println("Qual o seu sobrenome?");
        sobrenome = input.nextLine();
        System.out.println("Quantos anos você tem?");
        idade = input.nextByte();

        System.out.printf("%s, %s\nIdade: %d", sobrenome, nome, idade);
        input.close();
    }
}
