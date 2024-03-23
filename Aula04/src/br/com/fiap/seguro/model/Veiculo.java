package br.com.fiap.seguro.model;

import java.util.Vector;

public class Veiculo {

    private String placa;
    private String modelo;
    private double motor;
    private String cor;

    public String getPlaca() {
        return placa;
    }

    public Veiculo(String placa){
        this.placa = placa;
    }

    public Veiculo(String placa, String modelo){
        this.placa = placa;
        this.modelo = modelo;
    }

    public Veiculo(String placa, String modelo, double motor){
        this.placa = placa;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Veiculo(String placa, String modelo, double motor, String cor){
        this.placa = placa;
        this.modelo = modelo;
        this.motor = motor;
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
