package Ex1;

import java.util.Scanner;

//Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome,
// depois seu nome, e então escreva na tela, em uma única “string”, o nome completo do usuário.
// Informe também ao usuário quantas letras tem no nome dele.

public class NomeDoUsuario {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu sobre nome: ");

        String nome = scan.nextLine();

        System.out.println("Informe seu nome: ");

        String sobreNome = scan.nextLine();

        System.out.printf("Olá %s %s%n", sobreNome, nome);

        int numeroDeLetras = (nome + sobreNome).replaceAll("\s+", "").length();

        System.out.printf("Seu nome tem: %d caracteres",numeroDeLetras);

        scan.close();
    }

}
