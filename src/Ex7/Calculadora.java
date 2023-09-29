package Ex7;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double n1 = scan.nextDouble();
        System.out.println("Informe mais um numero: ");
        double n2 = scan.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int operacoes = scan.nextInt();
        double resultado;

        switch (operacoes){
            case 1:
                resultado = n1+n2;
                break;

            case 2:
                resultado = n1-n2;
                break;
            case 3:
                resultado = n1*n2;
                break;
            case 4:
                resultado = n1/n2;
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        System.out.printf("A operação escolhida foi %d, sendo os numero %.2f e %.2f. Resultando no valor: %.2f",operacoes, n1, n2, resultado);

//        Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora.
//        O programa deve pedir um número, depois outro, e por último uma operação.
//        O sistema deve aceitar como operação qualquer uma dessas 4 opções: “somar”, “subtrair”, “multiplicar” ou "dividir",
//            e realizar a operação correspondente entre os 2 números inseridos, para então escrever na tela do usuário o resultado.
    }
}
