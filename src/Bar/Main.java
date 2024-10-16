package Bar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MetodosBar metodos = new MetodosBar();

        System.out.print("\nSexo: ");
        char sexo = input.nextLine().charAt(0);

        System.out.print("\nQuantidade de cervejas: ");
        int qtdCervejas = Integer.parseInt(input.nextLine());

        System.out.print("\nQuantidade de refrigerantes: ");
        int qtdRefrigerantes = Integer.parseInt(input.nextLine());

        System.out.print("\nQuantidade de espetinhos: ");
        int qtdEspetinhos = Integer.parseInt(input.nextLine());

        float consumo = metodos.calculaConsumo(qtdCervejas, qtdRefrigerantes, qtdEspetinhos);

        System.out.println("\nRELATÓRIO:");
        System.out.println("Consumo = R$ " + consumo);

        float taxaCouvert = 0;
        if (metodos.verificaIsentoCouvert(consumo)) {
            System.out.println("Isento de Couvert");
        } else {
            taxaCouvert = 4;
            System.out.println("Couvert = R$ " + taxaCouvert);
        }

        int valorIngresso = 0;

        if(sexo == 'F'){
            valorIngresso = 8;
        } else {
            valorIngresso = 10;
        }

        System.out.println("Ingresso = R$ " + valorIngresso);

        System.out.println("\nValor a pagar = R$ " + (consumo + valorIngresso + taxaCouvert));
    }
}

