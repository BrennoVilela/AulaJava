import javax.swing.*;

public class main {

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


    }
}