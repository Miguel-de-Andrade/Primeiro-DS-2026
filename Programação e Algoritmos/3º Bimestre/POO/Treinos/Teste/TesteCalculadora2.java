package Treinos.Teste;

import Treinos.Dominios.Calculadora;

public class TesteCalculadora2 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int [] n ={1,2,3,4,5};

        calculadora.somaArray(n);

        calculadora.somaVarAargs(1,2, 3,45,6,5,5);

    }
}
