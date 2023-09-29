package Ex6;

import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();

        if(idade == 16 || idade == 17 || idade >= 59){
            System.out.println("Voto Opcional");
        } else if(idade >= 18 && idade <= 59){
            System.out.println("Voto é obrigatório");
        } else {
            System.out.println("Voto é proibido");
        }


//  Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário sua data de nascimento e calcule a sua idade.
//
//  Se o usuário tiver 16, 17, ou mais de 59 anos, o voto é opcional.
//
//  Entre 18 e 59 anos, o voto é obrigatório.
//
//  Abaixo de 16, o voto é proibido.
//
//  Informe ao usuário a situação de voto.
    }
}
