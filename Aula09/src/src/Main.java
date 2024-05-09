import br.com.fiap.model.loja.Livro;
import br.com.fiap.model.loja.Produto;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro(123,"Livro Livro", "Livro que é um livro", 150, 12, "Editora Livro", "Livro", "Wesley");

        System.out.println(livro.calcularPrecoComDesconto(5));
        System.out.println(livro.calcularPrecoComDesconto(3));
        System.out.println(livro.calcularPrecoComDesconto("FIAP25"));
        System.out.println(livro.calcularPrecoComDesconto("FIAP40"));
        System.out.println(livro.calcularPrecoComDesconto("FIAPLIVRO"));
        
        Produto livro2 = new Livro();
        livro2.setPreco(50);
        double valorComDesconto = livro2.calcularPrecoComDesconto("FIAPLIVRO");
        System.out.println("Segundo livro com desconto: " + valorComDesconto);

        System.out.println(livro);
    }
}