package Treinos.Dominios;

public class Funcionario {

    public String nome;
    public int idade;

    public double[] salario;

    public void imprimir() {

        System.out.println(this.nome);
        System.out.println(this.idade);


        if (salario == null) {
            return;
        }

        for (int i = 0; i < salario.length; i++) {
            System.out.print(salario[i] + "\t");
        }

    }

    public void imprimirMediaSalarial(){

        if (salario == null){
            return;
        }

        double soma = 0;

        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }

        double media = soma/ salario.length;

        System.out.printf("\nMédia do salário: %.2f ",media);

    }

}

