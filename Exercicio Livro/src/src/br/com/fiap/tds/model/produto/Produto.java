package br.com.fiap.tds.model.produto;

public class Produto {

    private String codigo;
    private String preco;

    public Produto(String codigo, String preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
