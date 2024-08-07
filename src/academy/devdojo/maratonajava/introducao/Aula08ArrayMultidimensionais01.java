package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        dias[0][0]= 31;
        dias[0][1]= 28;
        dias[0][2]= 31;
        dias[1][0]= 30;
        dias[1][1]= 31;
        dias[1][2]= 30;

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        for (int [] arrBase :dias){  // nesse modelo usamos a variavel de teste no tipo int [] pq não estamos trabalhando com uma variavel comum e sim com um array de arrays --
            for (int num : arrBase){ //é confuso mas nas anotrações do notion vai fazer sentido
                System.out.println(num);
            }
        }
    }
}
