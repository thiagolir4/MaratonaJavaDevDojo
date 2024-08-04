package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisEX01 {
    public static void main(String[] args) {
        double salario = 30000.21;
        double imposto = 0;

        if (salario <= 34712) {
            imposto = (salario * 9.70) / 100;
        } else if (salario > 34712 && salario < 68507) {
            imposto = (salario * 37.35) / 100;
        } else {
            imposto = (salario * 49.50) / 100;
        }
        System.out.println("Seu salário é de " + salario + "e você vai pagar um total de R$" + imposto);
    }
}
