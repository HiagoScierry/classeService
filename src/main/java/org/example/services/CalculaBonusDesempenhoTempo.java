package org.example.services;

import org.example.models.Bonus;
import org.example.models.DesempenhoMensal;
import org.example.models.Funcionario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculaBonusDesempenhoTempo implements IModuloCalculoBonus {
    @Override
    public void calcular(Funcionario funcionario) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        String mesAnoAtual = LocalDate.now().format(formatter);
        String desempenhoAtual = null;


        for (DesempenhoMensal desempenhoMensal : funcionario.getDesempenhoMensais()) {
            if (desempenhoMensal.getMesAno().equals(mesAnoAtual)) {
                desempenhoAtual = desempenhoMensal.getDesempenho();
                break;
            }
        }


        if (desempenhoAtual != null) {
            int tempoDeEmpresa = funcionario.getTempoDeEmpresa();
            double bonus = 0;


            switch (desempenhoAtual) {
                case "Excelente":
                    if (tempoDeEmpresa > 5) {
                        bonus = funcionario.getSalarioBase() * 0.08;
                    }
                    break;
                case "Bom":
                    if (tempoDeEmpresa > 3) {
                        bonus = funcionario.getSalarioBase() * 0.04;
                    }
                    break;
                case "Regular":
                    if (tempoDeEmpresa > 1) {
                        bonus = funcionario.getSalarioBase() * 0.02;
                    }
                    break;
            }


            if (bonus > 0) {
                funcionario.adicionarBonus(new Bonus("Bônus por Desempenho e Tempo de Empresa", bonus));
            }
        }
    }

}

