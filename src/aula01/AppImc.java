package aula01;

import java.util.Scanner;

public class AppImc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MassaCorporea mc = new MassaCorporea();

        System.out.println("digite a altura: ");
        mc.altura = input.nextDouble();
        System.out.println(mc.altura);

        
        System.out.println("Digite o peso: ");
        mc.peso = input.nextDouble();
        System.out.println(mc.peso);

        mc.calcularImc();
        mc.definirSituação();

        System.out.println("Imc é igual a " + mc.imc);
        System.out.println("Situação: " + mc.situacao);

        input.close();
    }
}
