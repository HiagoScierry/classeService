package org.example.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private int idade;
    private String cargo;
    private int numeroFaltas;
    private double distanciaTrabalho;
    private int numeroDependentes;
    private List<Bonus> bonusRecebidos;
    private LocalDate dataContratacao;
    private String desempenho;
    private int tempoEmpresa;
    private List<DesempenhoMensal> desempenhoMensais;

    public Funcionario(String nome, double salarioBase, int idade, String cargo, int numeroFaltas, double distanciaTrabalho, int numeroDependentes, LocalDate dataContratacao, int tempoDeEmpresa, String desempenho, List<DesempenhoMensal> desempenhoMensais) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.idade = idade;
        this.cargo = cargo;
        this.numeroFaltas = numeroFaltas;
        this.distanciaTrabalho = distanciaTrabalho;
        this.numeroDependentes = numeroDependentes;
        this.bonusRecebidos = new ArrayList<>();
        this.dataContratacao = dataContratacao;
        this.tempoEmpresa = tempoDeEmpresa;
        this.desempenho = desempenho;
    }


    // Getters e Setters

    public List<DesempenhoMensal> getDesempenhoMensais() {
        return desempenhoMensais;
    }



    public int getTempoDeEmpresa() {
        return tempoEmpresa;
    }


    public String getDesempenho() {
        return desempenho;
    }


    public void adicionarBonus(Bonus bonus) {
        bonusRecebidos.add(bonus);
    }

    public String getCargo(){
        return cargo;
    }

    public double getSalarioTotal() {
        double totalBonus = bonusRecebidos.stream().mapToDouble(Bonus::getValor).sum();
        return salarioBase + totalBonus;
    }

    public double getDistanciaTrabalho() {
        return distanciaTrabalho;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public int getNumeroFaltas(){
        return numeroFaltas;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", idade=" + idade +
                ", cargo='" + cargo + '\'' +
                ", numeroDeFaltas=" + numeroFaltas +
                ", distanciaDoTrabalho=" + distanciaTrabalho +
                ", numeroDeDependentes=" + numeroDependentes +
                ", bonusRecebidos=" + bonusRecebidos +
                '}';
    }
}
