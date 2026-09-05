package TesteCalculadora;

import Calculadora.Calculadora;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Scanner receber = new Scanner(System.in);

        double resultado;

        System.out.println("Digite o valor do primeiro número:");
        int a = receber.nextInt();
        System.out.println("Digite o valor do segundo número");
        int b = receber.nextInt();

        System.out.println("Digite: \n 1 para somar \n 2 para subtrair \n 3 para dividir");
        int opc = receber.nextInt();

        switch (opc){
            case 1:
                resultado = calculadora.soma(a, b);
                System.out.println("Resultado: " +resultado);
                break;

            case 2:
                resultado = calculadora.subtracao(a, b);
                System.out.println("Resultado: " +resultado);
                break;


            case 3:
                resultado = calculadora.divisao(a, b);
                System.out.printf("Resultado: %.2f",resultado);
                break;
        }


    }
}
