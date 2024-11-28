package org.example.services;

import org.example.models.Bonus;
import org.example.models.Funcionario;

public class CalculoBonusPorFaltas implements IModuloCalculoBonus {
    @Override
    public void calcular(Funcionario funcionario) {
        double bonus = 0;
        int faltas = funcionario.getNumeroFaltas();
        double salarioBase = funcionario.getSalarioBase();


        if (faltas == 0) {
            bonus = salarioBase * 0.05;
        } else if (faltas >= 1 && faltas <= 3) {
            bonus = salarioBase * 0.025;
        }
        funcionario.adicionarBonus(new Bonus("Bônus por Faltas", bonus));
    }
}


