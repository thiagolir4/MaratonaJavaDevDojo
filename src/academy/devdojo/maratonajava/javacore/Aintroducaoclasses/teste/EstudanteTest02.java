package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        //os valores sairem zerados pois não foram inicializados nessa tela, a não ser que tivessem sidos inicializados na classe
        // mas caso isso fosse feito, todos os objetos seram inicializados com os mesmos dados
    }
}
