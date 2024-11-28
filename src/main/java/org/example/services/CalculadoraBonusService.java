package org.example.services;

import org.example.models.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraBonusService {
    private List<IModuloCalculoBonus> modulosCalculoBonus;


    public CalculadoraBonusService() {
        modulosCalculoBonus = new ArrayList<>();
        modulosCalculoBonus.add(new CalculoBonusPorFaltas());
        modulosCalculoBonus.add(new CalculoBonusPorDependentes());
        modulosCalculoBonus.add(new CalculoBonusPorDistancia());
        modulosCalculoBonus.add(new CalculaBonusDesempenhoTempo()); // Adicionando a nova regra de negócio

    }


    public void processar(Funcionario funcionario) {
        for (IModuloCalculoBonus modulo : modulosCalculoBonus) {
            modulo.calcular(funcionario);
        }
    }
}


