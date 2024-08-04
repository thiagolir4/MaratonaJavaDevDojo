package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisEX02 {
    public static void main(String[] args) {
        byte dia = 7;
        switch (dia) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção invalida");
                break;

        }
    }
}
