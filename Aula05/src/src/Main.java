import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Ler duas notas
        String notaStr1 = JOptionPane.showInputDialog("Digite uma nota: ");

        //Converter a String em float
        float nota1 = Float.parseFloat(notaStr1);
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite outra nota: "));

        //Exibir a média
        float media = (nota1 + nota2) / 2;

        //Exibir a média
        JOptionPane.showMessageDialog(null, "Média: " + media);


        //Exibir se o aluno passou ou não de ano
        //Acima de 6, passou de ano
        //Entre 4 e 5,9 exame
        //Abaixo de 4, dp

        if(media >= 6){
            JOptionPane.showMessageDialog(null, "Parabéns o aluno passou de ano!");
        } else if(media >= 4 && media <= 5.9){
            JOptionPane.showMessageDialog(null, "O aluno está de exame.");
        } else {
            JOptionPane.showMessageDialog(null, "O aluno ficou de DP.");
        }
    }
}