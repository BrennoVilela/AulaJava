import br.com.fiap.tds.model.Carro;
import br.com.fiap.tds.model.Cor;
import br.com.fiap.tds.model.Aviao;
import br.com.fiap.tds.model.Lancha;
import br.com.fiap.tds.model.Elevador;

public class Main {
    public static void main(String[] args) {
        //Instanciar um Carro
        Carro mercedes = new Carro();
        mercedes.setModelo("C63");
        mercedes.setQuantidadeLugares(5);
        mercedes.setQuantidadePortas(4);
        mercedes.setComprimento(10);
        mercedes.setAnoFabricacao(2021);
        mercedes.setCor("Preta");
        mercedes.setPlaca("Br3nn0V1l3l4");

        Aviao pelicano = new Aviao();
        pelicano.setModelo("Pelicano");
        pelicano.setQuantidadeLugares(5);
        pelicano.setPrefixo("pelicano");
        pelicano.setComprimento(30);
        pelicano.setAnoFabricacao(2001);
        pelicano.setCor("Vermelho");
        pelicano.setQuantidadeTurbinas(2);

        Lancha teste = new Lancha();
        teste.setModelo("Per noite");
        teste.setQuantidadeLugares(10);
        teste.setComprimento(100);
        teste.setAnoFabricacao(2020);
        teste.setCor("Branca");
        teste.setQuantidadeMotores(2);

        Elevador elevador = new Elevador();

        //Elevador
        elevador.inicializa(10, 20);

        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());

        elevador.entra();
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
        elevador.sobe();
        System.out.println("Andar atual: " + elevador.getAndarAtual());

        elevador.sai();
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());
        elevador.desce();
        System.out.println("Andar atual: " + elevador.getAndarAtual());

        //Cor
        Cor prata = new Cor();
        prata.alterarCor(192,192,192, "Prata");

        //Carro
        System.out.println("Tenho uma mercedes " + mercedes.getModelo() + " , que tem " + mercedes.getQuantidadeLugares() + " lugares e tem " + mercedes.getQuantidadePortas() + " portas " +
                mercedes.getComprimento() + " metros, foi fabricada no ano de " + mercedes.getAnoFabricacao() + " ela tem a cor " + mercedes.getCor() + " e sua placa é " + mercedes.getPlaca());

        //Avião
        System.out.println("Avião do modelo: " + pelicano.getModelo() + " , ele tem " + pelicano.getQuantidadeLugares() + " lugares, conhecido como " +
                pelicano.getPrefixo() + ", ele tem o tamanho de: " + pelicano.getComprimento() + " metros, fabricado no ano de " + pelicano.getAnoFabricacao() +
            " sua cor é " + pelicano.getCor() + " e possui " + pelicano.getQuantidadeTurbinas() + " turbinas.");

        //Lancha
        System.out.println("Lancha do modelo: " + teste.getModelo() + " , ela tem " + teste.getQuantidadeLugares() + " lugares, " +
                " ela tem o tamanho de: " + teste.getComprimento() + " metros, fabricado no ano de " + teste.getAnoFabricacao() +
                " sua cor é " + teste.getCor() + " e possui " + teste.getQuantidadeMotores() + " motores.");

    }
}
