package C04;
import javax.swing.JOptionPane;

public class C04EX04 
{
        public static void main(String[] args) 
    {
        String nome, sobrenome;
        byte idade;

        nome = JOptionPane.showInputDialog(null, 
        "Informe seu nome: ", 
        "", 
        JOptionPane.QUESTION_MESSAGE);
        sobrenome = JOptionPane.showInputDialog(null, 
        "Informe seu sobrenome: ", 
        "", 
        JOptionPane.QUESTION_MESSAGE);
        idade = Byte.valueOf(JOptionPane.showInputDialog(null, 
        "Informe a sua idade: ",
        "",
        JOptionPane.QUESTION_MESSAGE));

        System.out.printf("%s, %s\nIdade: %d", sobrenome, nome, idade);
    }
}
