package exercicios;

import java.util.Scanner;

public class EX002ConversaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número decimal: ");
        String input = scanner.nextLine();
        try {
            float convertido = Float.parseFloat(input);
            System.out.println("Número convertido: " + convertido);
        } catch (NumberFormatException e) {
            System.out.println("Número invalido, tente novamente com um número decimal valido");
        }
    }
}
