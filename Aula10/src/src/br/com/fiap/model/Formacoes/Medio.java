package br.com.fiap.model.Formacoes;

public class Medio extends Formacao{

    private String tipo;

    public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
        super(descricao, periodo, mensalidade, duracao);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Descrição: " + getDescricao() + ", Período: " + getPeriodo() + ", Mensalidade: " + getMensalidade() + ", Duração: " + getDuracao();
    }

    public double calcularMensalidade(int duracao, double fator){
        double media = duracao * fator * 500;
        return media;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
