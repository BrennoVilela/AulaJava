import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            System.out.println(numero1);

            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            System.out.println(numero2);

            int divisao = numero1 / numero2;
            System.out.println("Esse é o resultado da divisão: " + divisao);
        } catch (NumberFormatException e) {
            System.out.println("Coloque apenas números nos campos");
        } catch (ArithmeticException e) {
            System.out.println("Não é possivel fazer uma divisão por zero");
        } catch (Exception e ) {
            System.out.println("Tente novamente");
        } finally {
            System.out.println("Kaique desempregado");
        }
        System.out.println("Finalizando o sistema");
    }
}