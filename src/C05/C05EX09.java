package C05;

import javax.swing.JOptionPane;

public class C05EX09 
{
    public static void main(String[] args) 
    {
        float nota1, nota2, nota3, mediaPonderada;

        nota1 = Float.valueOf(JOptionPane.showInputDialog(null,
            "Informe a primeira nota do aluno",
            null,
            JOptionPane.QUESTION_MESSAGE));
        nota2 = Float.valueOf(JOptionPane.showInputDialog(null,
            "Informe a segunda nota do aluno",
            null,
            JOptionPane.QUESTION_MESSAGE));
        nota3 = Float.valueOf(JOptionPane.showInputDialog(null,
            "Informe a terceira nota do aluno",
            null,
            JOptionPane.QUESTION_MESSAGE));

        mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);

        System.out.printf("Média ponderada = %.2f", mediaPonderada);
    }    
}
