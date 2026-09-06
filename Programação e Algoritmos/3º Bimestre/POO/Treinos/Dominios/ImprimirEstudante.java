package Treinos.Dominios;

public class ImprimirEstudante {

    public void imprimir (Estudante k){

        System.out.println("Nome: " +k.nome);
        System.out.println("Idade: " + k.idade);
        System.out.println("Sexo: " + k.sexo);

        k.nome = "Miguel";
    }
}
