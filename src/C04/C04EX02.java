package C04;

import java.text.NumberFormat;
import java.util.Scanner;

public class C04EX02 
{
    public static void main(String[] args)
    {    
        String nome, cpf, rg, tituloEleitor, cnh, nomeEmpresa;
        double salario;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o seu nome completo: ");
        nome = input.nextLine();
        System.out.print("Informe seu CPF: ");
        cpf = input.nextLine();
        System.out.print("Informe o número da sua identidade: ");
        rg = input.nextLine();
        System.out.print("Informe o número do seu título de eleitor: ");
        tituloEleitor = input.nextLine();
        System.out.print("Informe o número da sua CNH: ");
        cnh = input.nextLine();
        System.out.print("Informe o nome da empresa em que você trabalha: ");
        nomeEmpresa = input.nextLine();
        System.out.print("Informe quanto você ganha: ");
        salario = input.nextDouble();

        System.out.printf("""
                \nFICHA FUNCIONAL DE: %s

                Documentos:
                CPF ............................................. %s
                C.I. ............................................ %s
                Título de eleitor ............................... %s
                Carteira de motorista ........................... %s

                Empresa: %s
                Salário: %s
                """, nome.toUpperCase(), cpf, rg, tituloEleitor, cnh, nomeEmpresa.toUpperCase(), NumberFormat.getCurrencyInstance().format(salario));
                input.close();

    }

    
}
