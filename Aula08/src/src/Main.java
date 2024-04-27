import br.com.fiap.veiculo.model.Carro;
import br.com.fiap.veiculo.model.Cor;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        //Instanciando cor
        Cor roxo = new Cor("Roxo", 60, 20, 60);

        //Instancinado o carro
        Carro gol = new Carro("Gol", 5, 4.2, 2021, roxo, 5, "AN7DSA90", 1);

        //Exibindo alguns dados do carro
        System.out.println(gol.getModelo() + " " + gol.getCor().getNome());

    }
}