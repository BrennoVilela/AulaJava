import br.com.fiap.model.ContaCorrente;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ContaCorrente teste = new ContaCorrente(12000, 50000);

        double sacar = Integer.parseInt(JOptionPane.showInputDialog("Quanto você quer sacar?"));
        double depositar = Integer.parseInt(JOptionPane.showInputDialog("Quanto você quer depositar?"));

        try{
            System.out.println("Você tem na sua conta: " + teste.depositar(depositar));
        }catch (NumberFormatException e){
            System.out.println("Digite um número");
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Processo finalizado");
        }

        try{
            System.out.println("Você tem na sua conta: " + teste.sacar(sacar));
        }catch (NumberFormatException e) {
            System.out.println("Digite um número");
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Processo finalizado");
        }

    }
}