package Impostos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MetodosImposto metodos = new MetodosImposto();
        System.out.print("\nRenda anual com salário: ");
        float salarioAnual = Float.parseFloat(input.nextLine());

        System.out.print("\nRenda anual com prestação de serviço: ");
        float prestacaoServico = Float.parseFloat(input.nextLine());

        System.out.print("\nRenda anual com ganho de capital: ");
        float ganhoCapital = Float.parseFloat(input.nextLine());

        System.out.print("\nGastos médicos: ");
        float gastosMedicos = Float.parseFloat(input.nextLine());

        System.out.print("\nGastos educacionais: ");
        float gastosEducacionais = Float.parseFloat(input.nextLine());

        float maxDedutivel = metodos.calculaMaxDedutivel(salarioAnual, prestacaoServico, ganhoCapital);
        float gastosDedutiveis = metodos.calculaGastosDedutiveis(gastosMedicos, gastosEducacionais);
        float abatimento = metodos.calculaAbatimento(maxDedutivel, gastosDedutiveis);
        float impostoBruto = metodos.calculaImpostoBruto(salarioAnual, prestacaoServico, ganhoCapital);
        float impostoDevido = metodos.calculaImpostoTotal(impostoBruto, abatimento);

        System.out.println("### RELATÓRIO DE IMPOSTO DE RENDA ###");

        System.out.println("\n* CONSOLIDADO DE RENDA:");
        System.out.println("\nImposto sobre salário: " + metodos.calculaImpostoRenda(salarioAnual));
        System.out.println("Imposto sobre serviços: " + metodos.calculaImpostoServicos(prestacaoServico));
        System.out.println("Imposto sobre ganho de capital: " + metodos.calculaImpostoCapital(ganhoCapital));

        System.out.println("\n* DEDUÇÕES:");
        System.out.println("Máximo dedutível: " + maxDedutivel);
        System.out.println("Gastos dedutíveis: " + gastosDedutiveis);

        System.out.println("\n* RESUMO:");
        System.out.println("Imposto bruto total: " + metodos.calculaImpostoBruto(salarioAnual, prestacaoServico, ganhoCapital));
        System.out.println("Abatimento: " + abatimento);
        System.out.println("Imposto devido: " + impostoDevido);

    }
}