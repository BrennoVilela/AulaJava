package br.com.fiap.tds.model.produto;

public class Smartphone extends Produto{

    private String modelo;
    private String fabricante;
    private int memoria;

    public Smartphone(String codigo, String preco, String modelo, String fabricante, int memoria) {
        super(codigo, preco);
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.memoria = memoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
