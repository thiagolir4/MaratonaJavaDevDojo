package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String [] nomes = new String[3];

        nomes[0] = "Thiago";
        nomes[1] = "Diogo";
        nomes[2] = "Joao";
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
