package br.com.fiap.model.Formacoes;

public class Tecnologo extends Formacao{
    private boolean planoEstendido;

    public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
        super(descricao, periodo, mensalidade, duracao);
        this.planoEstendido = planoEstendido;
    }

    public double calcularMensalidade(int duracao, double fator){
        double media = duracao * fator * 600;
        return media;
    }

    @Override
    public String toString() {
        return "Descrição: " + getDescricao() + ", Período: " + getPeriodo() + ", Mensalidade: " + getMensalidade() + ", Duração: " + getDuracao();
    }

    public boolean isPlanoEstendido() {
        return planoEstendido;
    }

    public void setPlanoEstendido(boolean planoEstendido) {
        this.planoEstendido = planoEstendido;
    }
}
