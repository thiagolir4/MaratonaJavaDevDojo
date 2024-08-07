package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][]; //inicializando o array
        int[] array = {1, 2};
        arrayInt[0] = array;// na primeira linha colocamos quantos arrays vamos ter no "emaranhado de arrays"
        arrayInt[1] = new int[]{1, 2, 3};// logo depois inicializamos o array na posição 0 com 2 posições, a posição 1 com 3 posições e a posição 2 com um array de 6 posições
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n----------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        // outra maneira de inicializar
        int [][] arrayInt2 = {{0,1}, {2,3,4},{5,6,7,8,9,10}};
    }
}
