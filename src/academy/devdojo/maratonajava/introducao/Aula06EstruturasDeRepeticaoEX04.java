package academy.devdojo.maratonajava.introducao;
public class Aula06EstruturasDeRepeticaoEX04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição, valor tem que ser >= a 1.000 testando o continue
        double valorTotal = 30000;
        for(int parcela = (int)valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);

        }
    }
}
