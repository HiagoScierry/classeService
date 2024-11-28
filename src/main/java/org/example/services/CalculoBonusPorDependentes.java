package org.example.services;

import org.example.models.Bonus;
import org.example.models.Funcionario;

public class CalculoBonusPorDependentes implements IModuloCalculoBonus {
    @Override
    public void calcular(Funcionario funcionario) {
        double bonus = 0;
        int dependentes = funcionario.getNumeroDependentes();
        double salarioBase = funcionario.getSalarioBase();


        if (dependentes >= 3) {
            bonus = salarioBase * 0.06;
        } else if (dependentes >= 1 && dependentes <= 2) {
            bonus = salarioBase * 0.03;
        }
        funcionario.adicionarBonus(new Bonus("Bônus por Dependentes", bonus));
    }
}