import java.util.Scanner;

public class SomaDiagonalSecundaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz: ");
        int linhas = sc.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz: ");
        int colunas = sc.nextInt();

        if (colunas != linhas){
            System.out.println("A matriz não é quadrada, sendo assim não é possível calcular a diagonal secundaria");
        } else {

            int [][] matriz = new int[linhas][colunas];
            int soma = 0;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {

                    System.out.println("Digite o valor da linha " +i+  " coluna " +j);
                    matriz[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                int coluna = (matriz.length - 1) - i;
                soma += matriz[i][coluna];
            }

            System.out.println("A soma da diagonal secundaria da matriz é: " +soma);

            sc.close();
        }
    }
}
