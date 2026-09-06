package Treinos.Teste;

import Treinos.Dominios.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {

     Funcionario funcionario = new Funcionario();

     funcionario.nome = "Miguel";
     funcionario.idade = 18;
     funcionario.salario = new double[] {};

     funcionario.imprimir();
     funcionario.imprimirMediaSalarial();
    }
}
