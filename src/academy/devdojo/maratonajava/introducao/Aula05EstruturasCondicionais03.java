package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    //operador ternario
    public static void main(String[] args) {
        double salario = 6000D;
        String mensagemDoar = "Eu vou dorar 500 para o DevDojo";
        String mensagemNaoDOar = "Ainda não tenho condições, mas vou ter!";
        // sintaxe (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000D ? mensagemDoar : mensagemNaoDOar;
        System.out.println(resultado);
    }
}
