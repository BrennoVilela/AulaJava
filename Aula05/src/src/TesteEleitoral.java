import javax.swing.*;

public class TesteEleitoral {

    public static void main(String[] args) {
        // Solicitar a idade de três pessoas
        int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira pessoa: "));
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda pessoa: "));
        int idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da terceira pessoa: "));

        // Determinar a classe eleitoral para cada pessoa
        String classeEleitoral1 = determinarClasseEleitoral(idade1);
        String classeEleitoral2 = determinarClasseEleitoral(idade2);
        String classeEleitoral3 = determinarClasseEleitoral(idade3);

        // Exibir a classe eleitoral de cada pessoa
        JOptionPane.showMessageDialog(null,
                "Classe Eleitoral da primeira pessoa: " + classeEleitoral1 + "\n" +
                        "Classe Eleitoral da segunda pessoa: " + classeEleitoral2 + "\n" +
                        "Classe Eleitoral da terceira pessoa: " + classeEleitoral3);
    }

    public static String determinarClasseEleitoral(int idade) {
        if (idade < 16) {
            return "Não eleitor";
        } else if (idade >= 18 && idade <= 65) {
            return "Eleitor obrigatório";
        } else {
            return "Eleitor facultativo";
        }
    }
}
