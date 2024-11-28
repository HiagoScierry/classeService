package org.example.models;

public class DesempenhoMensal {
    private final String desempenho;
    private final String mesAno;


    public DesempenhoMensal(String desempenho, String mesAno) {
        this.desempenho = desempenho;
        this.mesAno = mesAno;
    }


    public String getDesempenho() {
        return desempenho;
    }


    public String getMesAno() {
        return mesAno;
    }
}

