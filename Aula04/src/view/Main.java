package view;

import br.com.fiap.seguro.model.Cliente;
import br.com.fiap.seguro.model.Veiculo;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Brenno", "09479132621");

        System.out.println(cliente.getNome());

        Veiculo veiculo = new Veiculo("BR3NN0V1L3L4", "BMW", 2.5, "Preta");

        Cliente cliente1 = new Cliente("Brenno", "09479132622", veiculo);


        System.out.println(cliente1.getNome() + " " + cliente1.getCpf());
        System.out.println(cliente1.getVeiculo().getModelo() + " " + cliente1.getVeiculo().getCor());
    }
}