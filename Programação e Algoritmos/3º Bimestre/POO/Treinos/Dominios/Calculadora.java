package Treinos.Dominios;

public class Calculadora {

    public int soma(int a, int b){
        return a + b;
    }

    public int subtracao(int a, int b){
        return a - b;
    }

    public double divisao (double a, double b){
        if (b != 0){
            return (a/b);
        } else {
            return 0;
        }
    }

    public void somaArray (int[] numeros){

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println(soma);
        
    }

    public void somaVarAargs(int... numeros){
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println(soma);

    }

}
