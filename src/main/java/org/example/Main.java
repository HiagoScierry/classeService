package org.example;

import org.example.models.Funcionario;
import org.example.services.CalculadoraBonusService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 =
                new Funcionario("João", 2000, 35, "Analista", 1, 75, 2, LocalDate.now());
        Funcionario funcionario2 =
                new Funcionario("Maria", 3000, 42, "Gerente", 0, 120, 4, LocalDate.now());


        CalculadoraBonusService calculadoraBonusService =
                new CalculadoraBonusService();


        calculadoraBonusService.processar(funcionario1);
        calculadoraBonusService.processar(funcionario2);


        System.out.println("Salário total de João: "
                + funcionario1.getSalarioTotal());
        System.out.println("Salário total de Maria: "
                + funcionario2.getSalarioTotal());
    }

}