import br.com.fiap.lavanderia.model.Funcionario;
import br.com.fiap.lavanderia.model.Pessoa;
import br.com.fiap.lavanderia.model.Cliente;

public class Main {
    public static void main(String[] args) {

        //Instanciar um funcionário
       Funcionario funcionario1 = new Funcionario();

       //Setar o nome e cargo do funcionario
        funcionario1.setNome("Jorge Roberto");
        funcionario1.setCargo("Assistente técnico");

    }
}
