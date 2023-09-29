package Ex9;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu salário: ");
        double salario = scan.nextDouble();
        double aumento = 0;
        double salarioAtualizado = 0;
        double porcentagemAumento = 0;

        if (salario <= 1200){
            salarioAtualizado = salario * 1.2;
            aumento = salarioAtualizado - salario;
        } else if (salario >= 1200 && salario <= 1700) {
            salarioAtualizado = salario * 1.15;
            aumento = salarioAtualizado - salario;
        } else if (salario >= 1700 && salario <= 2500){
            salarioAtualizado = salario * 1.10;
            aumento = salarioAtualizado - salario;
        } else {
            salarioAtualizado = salario * 1.05;
            aumento = salarioAtualizado - salario;
        }

        porcentagemAumento = ((aumento/salario)*100);

        System.out.printf("Valor do salário antes do reajuste: %.2f%n", salario);
        System.out.printf("Percentual de aumento: %.0f%%%n", porcentagemAumento);
        System.out.printf("Valor do aumento: %.2f%n", aumento);
        System.out.printf("Valor do salário após o aumento: %.2f%n", salarioAtualizado);

    }
}
