package br.com.fiap.veiculo.model;

public class Cor {

    private String nome;
    private int r, g, b;

    public Cor(String nome, int r, int g, int b) {
        this.nome = nome;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
