package br.com.fiap.model.dao;

import br.com.fiap.model.factory.ConnectionFactory;
import br.com.fiap.model.model.Carro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Classe responsável por interagir com o banco de dados e realizar ações ações na tabela T_CARRO
public class CarroDao {

    public void cadastrar(Carro carro) throws SQLException, ClassNotFoundException {
        Connection conexao = ConnectionFactory.getConnection();
        //Criar um statement configurável
        PreparedStatement stmt = conexao.prepareStatement ("insert into t_carro (id_carro, ds_modelo, " +
                "nr_placa, ds_motor, ds_automatico) values (sq_t_carro.nextval, ?, ?, ?, ?)");
        //Setar os valores do carro na query
        stmt.setString(1, carro.getModelo());
        stmt.setString(2, carro.getPlaca());
        stmt.setFloat(3, carro.getMotor());
        stmt.setBoolean(4, carro.isAutomatico());
        //Executar o comando SQL
        stmt.executeUpdate();
    }

    public Carro pesquisarPorId(int id) throws ClassNotFoundException, SQLException {
        Connection conexao = ConnectionFactory.getConnection();

        PreparedStatement stm = conexao.prepareStatement("select * from t_carro where id_carro = ?");

        stm.setInt(1, id);
        return null;
    }

    public List<Carro> listar() throws ClassNotFoundException, SQLException {
        Connection conexao = ConnectionFactory.getConnection();

        Statement stm = conexao.createStatement();

        ResultSet resultSet = stm.executeQuery("select * from t_carro");

        List<Carro> lista = new ArrayList<>();

        while(resultSet.next()) {
            int id = resultSet.getInt("id_carro");
            String modelo = resultSet.getString("ds_modelo");
            String placa = resultSet.getString("nr_placa");
            float motor = resultSet.getFloat("ds_motor");
            boolean automatico = resultSet.getBoolean("ds_automatico");

            Carro carro = new Carro(id, modelo, placa, motor, automatico);

            lista.add(carro);
        }
        return lista;
    }

    //DESAFIO
    public void atualizar(Carro carro) throws ClassNotFoundException, SQLException{
        Connection conexao = ConnectionFactory.getConnection();

        PreparedStatement stm = conexao.prepareStatement("update t_carro set ds_modelo = ?, " +
                "nr_placa = ?, ds_motor = ?, ds_automatico = ? where id_carro = ?");

        stm.setString(1, carro.getModelo());
        stm.setString(2, carro.getPlaca());
        stm.setFloat(3, carro.getMotor());
        stm.setBoolean(4, carro.isAutomatico());
        stm.setInt(5, carro.getId());

        stm.executeUpdate();
    }

    public void remover(int id) throws ClassNotFoundException, SQLException{
         Connection conexao = ConnectionFactory.getConnection();
         PreparedStatement stmt = conexao.prepareStatement("delete from t_carro where id_carr0 = ?");

         stmt.setInt(1, id);
         stmt.executeUpdate();


    }

}