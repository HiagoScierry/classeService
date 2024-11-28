package org.example.services;

import org.example.models.Bonus;
import org.example.models.Funcionario;

public class CalculoBonusPorDistancia implements IModuloCalculoBonus {
    @Override
    public void calcular(Funcionario funcionario) {
        double bonus = 0;
        double distancia = funcionario.getDistanciaTrabalho();


        if (distancia >= 50 && distancia <= 100) {
            bonus = 80;
        } else if (distancia > 100 && distancia <= 150) {
            bonus = 120;
        } else if (distancia > 150) {
            bonus = 170;
        }
        funcionario.adicionarBonus(new Bonus("Bônus por Distância", bonus));
    }
}



