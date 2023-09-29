package Ex8;

import java.util.Scanner;

public class CalcPAePG {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        System.out.println("Insera um valor inicial | OBS: Deve ser um numero inteiro: ");
        int valorInicial = scan.nextInt();

        System.out.println("Valor da raiz: ");
        int raiz = scan.nextInt();

        System.out.println("Escolha o tipo de sequência: ");
        System.out.println("1. Progressão Aritmética (PA)");
        System.out.println("2. Progressão Geométrica (PG)");
        int operacao = scan.nextInt();
        int soma = valorInicial;

        switch (operacao) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    System.out.print(soma + " ");
                    soma += raiz;
                }
                break;

            case 2:
                for (int i = 0; i < 10; i++) {
                    System.out.print(soma + " ");
                    soma *= raiz;
                }
                break;

            default:
                System.out.println("Escolha inválida.");
        }

        scan.close();
    }
}








