package Exercicio1;

public class Transporte {

    // ATRIBUTOS
    private Integer id;
    private Integer ano;
    private String modelo;
    private Double cargaMaxima;
    private Double potencia;

    // CONSTRUTOR
    public Transporte() { }

    public Transporte(Integer id, Integer ano, String modelo, Double cargaMaxima, Double potencia) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.potencia = potencia;
    }

    // GETTER'S AND SETTER'S
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public Double calcularConsumo(){
        return  potencia * cargaMaxima * 100;
    }
}
