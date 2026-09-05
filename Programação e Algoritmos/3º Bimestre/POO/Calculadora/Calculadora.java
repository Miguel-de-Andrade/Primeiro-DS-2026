package Calculadora;

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
}
