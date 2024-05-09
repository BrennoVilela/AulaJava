import br.com.fiap.model.Formacoes.Bacharelado;
import br.com.fiap.model.Formacoes.Tecnologo;
import br.com.fiap.model.Formacoes.Medio;
import br.com.fiap.model.Formacoes.Formacao;
public class Main {
    public static void main(String[] args) {
        Medio medio = new Medio("Aulas para formação escolar", 12,500,36,"Aulas Gerais");
        Bacharelado bacharelado = new Bacharelado("Aulas para formação de ensino superior", 12,500,36,"Engenharia", 120);
        Tecnologo tecnologo = new Tecnologo("Aulas para formação de ensino superior", 12,500,36,false);
        Formacao formacao = new Formacao("Cursos profissionalizantes", 12,500,36);

        System.out.println("");
        System.out.println("Informações sobre Formação do Ensino Médio:");
        medio.definirDuracao();
        System.out.println(medio.toString());
        System.out.println("Preço total: " + medio.calcularMensalidade(medio.getDuracao(), 12));
        System.out.println("");
        System.out.println("");

        System.out.println("Informações sobre formação no Bacharelado:");
        bacharelado.definirDuracao();
        System.out.println(bacharelado.toString());
        System.out.println("Preço total: " + bacharelado.calcularMensalidade(12, bacharelado.getDuracao(), bacharelado.getCargaHorariaEstagio()));
        System.out.println("");
        System.out.println("");

        System.out.println("Informações sobre formação no Tecnologo:");
        tecnologo.definirDuracao();
        System.out.println(tecnologo.toString());
        System.out.println("Preço total: " +tecnologo.calcularMensalidade(tecnologo.getDuracao(), 12));
        System.out.println("");
        System.out.println("");
    }
}