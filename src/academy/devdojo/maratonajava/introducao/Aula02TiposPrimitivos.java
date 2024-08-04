package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long e boolean
        int idade = 10;
        int idade2 = (int) 10000000000L; //conversão a força, ele vai cortar bits e vai soltar o número do jeito que der, é algo inesperado
        long numeroGrande = 10000000;
        double salarioDouble = 2000.0D;// D NO DOUBLE
        float salarioFloat = 2500.00F; // F NO FLOAT
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'C';
        String nome = "Thiago"; //string é uma classe e não um tipo primitivo, deve ser declarada com S
        var nome2 = "Thiago"; // sozinho o sistema identifica o tipo da variável

        System.out.println("A idade é " +idade + "Anos");
        System.out.println(verdadeiro);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println("Oi meu nome é " +nome);


    }
}

