import java.util.Scanner;

public class SomaDiagonalPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite a quantidade de linhas da matriz para calcular a soma da diagonal principal: ");
        int linhas = sc.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz para calcular a soma da diagonal principal: ");
        int colunas = sc.nextInt();

        if (colunas != linhas){
            System.out.println("A matriz não é quadrada, sendo assim não é possível calcular a diagonal principal");
            return;
        } else {

            int [][] matriz  = new int[linhas][colunas];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {

                    System.out.println("Digite o valor da linha " +i+ " da coluna " +j);
                    matriz[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][i];
            }

            System.out.println("A soma da diagonal principal da matriz é: " +soma);

            sc.close();
        }
    }
}