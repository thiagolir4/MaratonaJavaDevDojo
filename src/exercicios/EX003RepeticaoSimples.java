package exercicios;
import  java.util.Scanner;

public class EX003RepeticaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        String input = scanner.nextLine();
        int numero = Integer.parseInt(input); //converte o input em int
        if (numero == 0) {
            System.out.println("O número é igual a zero");
        } else if (numero > 0) {
            System.out.println("O número é inteiro");
        } else {
            System.out.println("O número é negativo");
        }

    }
}
