package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoEX03 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição, valor tem que ser >= a 1.000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <=valorTotal; parcela++){ //esta fazendo uma verificação para ver a quantidade de parcelas
            double valorParcela = valorTotal / parcela; //esta fazendo  uma verificação para descobrir o valor da parcela
            if (valorParcela < 1000){ //esta vendo se o valor da parcela não é menor que 1000
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }
        }
    }

