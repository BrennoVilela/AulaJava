package br.com.fiap.model.loja;

public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private float peso;

    public Produto(){}


    public Produto(int id, String nome, String descricao, double preco, float peso) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
    }

    public double calcularPrecoComDesconto(double porcentagem){
        return preco - preco * porcentagem / 100;
    };

    public double calcularPrecoComDesconto(int quantidade) {
        if (quantidade > 5 && quantidade < 9) {
            return preco * 0.9 * quantidade;
        } else if (quantidade >= 9) {
            return preco * 0.8 * quantidade;
        } else {
            return preco * quantidade;
        }
    }

    public double calcularPrecoComDesconto(String cupom) {
        if(cupom.equalsIgnoreCase("FIAP25")){
            return calcularPrecoComDesconto(25.0);
        } else if (cupom.equalsIgnoreCase("FIAP40")){
            return calcularPrecoComDesconto(40.0);
        } else {
            System.out.println("Cupom inválido. Nenhum desconto aplicado.");
            return preco;
        }
    }

    public double calcularFrete(double distancia){
        if(preco > 250 && peso < 5 && distancia < 100){
            return 0;
        } else {
            return 0.1 * peso + 0.2 * distancia;
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}


