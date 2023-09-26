package Ex2;

//Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário que digite sua altura (2 ou mais casas depois da vírgula),
// depois peça que o usuário digite seu peso, e então calcule o IMC e exiba essa informação ao usuário.
// Fórmula IMC = peso / (altura x altura).

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Informe seu peso: ");
        double peso = scan.nextDouble();

        double calcIMC = peso/(altura * altura);

        System.out.printf("Seu IMC é de %.2f", calcIMC);

    }
}
