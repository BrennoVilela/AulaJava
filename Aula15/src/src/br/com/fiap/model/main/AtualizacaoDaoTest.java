package br.com.fiap.model.main;

import br.com.fiap.model.dao.CarroDao;
import br.com.fiap.model.model.Carro;

public class AtualizacaoDaoTest {
    public static void main(String[] args) {
        Carro carro = new Carro(2, "Gol Bola", "ABC1234", 1, false);

        CarroDao dao = new CarroDao();

        try {
            dao.atualizar(carro);
            System.out.println("Carro atualizado");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
