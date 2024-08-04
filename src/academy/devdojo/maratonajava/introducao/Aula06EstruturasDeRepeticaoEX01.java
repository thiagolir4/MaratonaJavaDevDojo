package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoEX01 {
    public static void main(String[] args) {
        //imprimindo todos os números pares de 0 a 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
