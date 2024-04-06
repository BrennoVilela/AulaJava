import javax.swing.*;

public class Menu {

    public static void main(String[] args) {
        // Solicitar ao usuário dois números e a operação desejada
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir"));

        float resultado = 0;
        String operacaoString = "";

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                operacaoString = "soma";
                break;
            case 2:
                resultado = numero1 - numero2;
                operacaoString = "subtração";
                break;
            case 3:
                resultado = numero1 * numero2;
                operacaoString = "multiplicação";
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    operacaoString = "divisão";
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida.");
                return;
        }

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O resultado da " + operacaoString + " é: " + resultado);
    }
}
