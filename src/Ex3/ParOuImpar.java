package Ex3;

//Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir um número inteiro.
// O programa deve verificar se o número é par ou ímpar, e exibir essa informação de volta ao usuário.

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = scan.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "ímpar";

        System.out.printf("O número %d é %s.", numero, resultado);
    }
}
