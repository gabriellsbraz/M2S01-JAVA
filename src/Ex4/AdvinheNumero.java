package Ex4;

import java.util.Scanner;

public class AdvinheNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Advinhe qual numero de 1 a 5 eu estou pensando: ");
        int numero = scan.nextInt();

        int numeroAleatorio = (int) (Math.random() * 5) + 1;

        if (numero >= 1 && numero <= 5) {
            String resultado = numero == numeroAleatorio ? "Você acertou o número! Era " + numeroAleatorio : "Você errou. O número correto era " + numeroAleatorio;
            System.out.println(resultado);
        } else {
            System.out.println("Você deve inserir um número entre 1 e 5.");
        }

    }
}
