package TesteEstudante;

import Estudante.Estudante;

public class TesteEstudante {
    public static void main(String[] args) {

        Estudante pessoa1 = new Estudante();

        pessoa1.nome = "João";

        System.out.println(pessoa1.nome);

        pessoa1.andar();
    }
}
