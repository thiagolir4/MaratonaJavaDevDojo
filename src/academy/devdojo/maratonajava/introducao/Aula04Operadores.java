package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //números inteiros divididos por números inteiros, sempre será um inteiro
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02; //se tirarmos a conversão para double, o sistema vai dar erro
        double resultado2 = numero01 / numero02;
        System.out.println(resultado);
        System.out.println(resultado2);

        // relacionais < > <= >= == !=

        // lógicos && (AND) || (or) !

        //atribuição = += -= *= /= %= ++ --

    }
}
