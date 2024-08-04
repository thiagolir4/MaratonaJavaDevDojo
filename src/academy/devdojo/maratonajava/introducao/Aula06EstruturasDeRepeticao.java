package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while, do while e for
        int count = 10;
        while (count < 10) { // vai executar se for verdadeiro
            System.out.println(++count);
        }

        do { //vai executar o do pelo menos uma vez e verificar se a condição é verdadeira
            System.out.println("dentro do do-while");
        }while (count < 10);

        for (int i = 0; i < 11; i++){
            System.out.println("For " + i);
        }

    }
}
