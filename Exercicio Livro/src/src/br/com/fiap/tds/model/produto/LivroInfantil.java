package br.com.fiap.tds.model.produto;

public class LivroInfantil extends Livro{

    private String ilustrado;

    public LivroInfantil(String nome, String endereco, String autor, String titulo, String isbn, Editora editora, String ilustrado) {
        super(nome, endereco, autor, titulo, isbn, editora);
        this.ilustrado = ilustrado;
    }

    public String getIlustrado() {
        return ilustrado;
    }

    public void setIlustrado(String ilustrado) {
        this.ilustrado = ilustrado;
    }
}
