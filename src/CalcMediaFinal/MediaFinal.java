package CalcMediaFinal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe abaixo suas notas");
        System.out.println("NP1: ");
        double np1 = scan.nextDouble();
        System.out.println("NP2: ");
        double np2 = scan.nextDouble();
        System.out.println("NP3: ");
        double np3 = scan.nextDouble();

        double mediaFinal = ((np1+np2+np3)/3);

        System.out.printf("Sua Media Final é %.2f", mediaFinal);

//        Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir as notas do semestre, e deve retornar a média final.
//        O programa deve pedir 3 notas, que devem ser números reais, e retornar um número real com 2 casas depois da vírgula,
//        com o texto “Sua média final é:” seguido do valor.
    }
}
