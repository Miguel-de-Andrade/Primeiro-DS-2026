package Treinos.Teste;

import Treinos.Dominios.Estudante;
import Treinos.Dominios.ImprimirEstudante;

public class TesteEstudante {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImprimirEstudante impressora = new ImprimirEstudante();

        estudante1.nome = "João";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 22;
        estudante2.sexo = 'F';

        impressora.imprimir(estudante1);

        System.out.println("------------------");

        impressora.imprimir(estudante2);

        System.out.println("------------------");

        impressora.imprimir(estudante1);

        System.out.println("------------------");

        impressora.imprimir(estudante2);



    }
}
