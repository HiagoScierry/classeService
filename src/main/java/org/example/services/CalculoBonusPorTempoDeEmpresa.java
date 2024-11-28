package org.example.services;

import org.example.models.Bonus;
import org.example.models.Funcionario;

import java.time.LocalDate;
import java.time.Period;

public class CalculoBonusPorTempoDeEmpresa implements IModuloCalculoBonus {
    @Override
    public void calcular(Funcionario funcionario) {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(funcionario.getDataContratacao(), dataAtual);
        int anosDeEmpresa = periodo.getYears();
        double bonus = 0;


        if (anosDeEmpresa >= 1 && anosDeEmpresa <= 3) {
            bonus = funcionario.getSalarioBase() * 0.01;
        } else if (anosDeEmpresa > 3) {
            bonus = funcionario.getSalarioBase() * 0.02;
        }


        if (bonus > 0) {
            funcionario.adicionarBonus(new Bonus("Bônus por Tempo de Empresa", bonus));
        }
    }
}
