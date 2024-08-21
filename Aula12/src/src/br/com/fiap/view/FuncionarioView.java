package br.com.fiap.view;

import br.com.fiap.model.Funcionario;

import javax.swing.*;

public class FuncionarioView {
    public static void main(String[] args) {
        Funcionario brenno = new Funcionario("Brenno", 5700);

            int meses = Integer.parseInt(JOptionPane.showInputDialog("Quantos meses você trabalhou?"));
            int ferias = Integer.parseInt(JOptionPane.showInputDialog("Quantos meses de ferias você vai pegar?"));


        try {
            System.out.println(brenno.calcularPlr(true, meses));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Fim do processo");
        }

        try {
            System.out.println(brenno.calcularFerias(ferias));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Fim do processo");
        }
    }
}
