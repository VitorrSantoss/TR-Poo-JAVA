package Exercicio7;

import java.time.LocalDate;

public class Modelo extends Carro {

    // ATRIBUTOS
    private int codigo;
    private String marca;
    private String nome;
    private double motor;
    private int serie;

    // CONSTRUTORES
    public Modelo() { }

    public Modelo(String chassi, String cor, int anoFabricacao, int anoModelo, LocalDate dataEntrada, int codigo, String marca, String nome, double motor, int serie) {
        super(chassi, cor, anoFabricacao, anoModelo, dataEntrada);
        this.codigo = codigo;
        this.marca = marca;
        this.nome = nome;
        this.motor = motor;
        this.serie = serie;
    }

    // GETTER'S AND SETTER'S
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}
