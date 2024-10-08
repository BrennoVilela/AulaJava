package br.com.fiap.model.main;

import br.com.fiap.model.dao.CarroDao;
import br.com.fiap.model.model.Carro;

import java.util.List;

public class ListagemDaoTest {

    public static void main(String[] args) {
        //Instanciar o DAO
        CarroDao dao = new CarroDao();

        try {
            //Chamar o metodo listar
            List<Carro> lista = dao.listar();
            //Exibir os dados pesquisados
            for(Carro c: lista){
                System.out.println(c.getId() + " " + c.getModelo() + " " + c.getPlaca() + " " + c.getMotor() + " " + c.isAutomatico());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}
