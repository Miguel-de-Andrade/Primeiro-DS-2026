package Treinos.Teste;

import Treinos.Dominios.Estudante;

public class EstudanteTeste2 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "João";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 22;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();


    }
}
