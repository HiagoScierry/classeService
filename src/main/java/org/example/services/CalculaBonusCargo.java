package org.example.services;

import org.example.models.Bonus;
import org.example.models.Funcionario;

public class CalculaBonusCargo implements IModuloCalculoBonus {
    @Override
    public void calcular(Funcionario funcionario) {
        double bonus = 0;
        String cargo = funcionario.getCargo();


        switch (cargo) {
            case "Gerente":
                bonus = funcionario.getSalarioBase() * 0.10;
                break;
            case "Analista":
                bonus = funcionario.getSalarioBase() * 0.05;
                break;
            case "Desenvolvedor":
                bonus = funcionario.getSalarioBase() * 0.03;
                break;
            default:
                break;
        }


        if (bonus > 0) {
            funcionario.adicionarBonus(new Bonus("Bônus por Cargo", bonus));
        }
    }
}
