package br.com.fiap.model.Formacoes;

public class Bacharelado extends Formacao{

    private String projetoConclusao;
    private int cargaHorariaEstagio;

    public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
        super(descricao, periodo, mensalidade, duracao);
        this.projetoConclusao = projetoConclusao;
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }

    @Override
    public String toString() {
        return "Descrição: " + getDescricao() + ", Período: " + getPeriodo() + ", Mensalidade: " + getMensalidade() + ", Duração: " + getDuracao();
    }

    public double calcularMensalidade(double fator, int duracao, int cargaHorariaEstagio){
        double media = (duracao * fator * 600) + (cargaHorariaEstagio * 12);
        return media;
    }

    public String getProjetoConclusao() {
        return projetoConclusao;
    }

    public void setProjetoConclusao(String projetoConclusao) {
        this.projetoConclusao = projetoConclusao;
    }

    public int getCargaHorariaEstagio() {
        return cargaHorariaEstagio;
    }

    public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }
}
