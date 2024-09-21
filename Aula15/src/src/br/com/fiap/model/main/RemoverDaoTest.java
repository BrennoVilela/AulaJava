package br.com.fiap.model.main;

import br.com.fiap.model.dao.CarroDao;
import br.com.fiap.model.model.Carro;

public class RemoverDaoTest {
    public static void main(String[] args) {
        CarroDao dao = new CarroDao();

        try{
            dao.remover(2);
            System.out.println("Carro excluido com sucesso!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
