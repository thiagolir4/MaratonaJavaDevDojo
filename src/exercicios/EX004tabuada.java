package exercicios;
import java.util.Scanner;

public class EX004tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que você quer ver a tabuada: ");
        int numero = scanner.nextInt();
        System.out.println("Digite até qual número você quer ver a multiplicação: ");
        int multiplicador = scanner.nextInt();
        for(int i = 0; i < multiplicador + 1; i++ ){
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }


    }
}
