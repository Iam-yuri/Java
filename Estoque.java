import java.util.Scanner;

public class Estoque {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int quantidadeAtual;
        int quantidadeMaxima;
        int quantidadeMinima;

        System.out.println("Digite a quantidade atual de produtos em estoque: ");
        quantidadeAtual = sc.nextInt();

        System.out.println("Digite a quantidade Máxima de produtos em estoque: ");
        quantidadeMaxima = sc.nextInt();

        System.out.println("Digite a quantidade Minima de produtos em estoque: ");
        quantidadeMinima = sc.nextInt();

        float media = quantidadeMaxima + quantidadeMinima / 2;

        if (quantidadeAtual >= media){

            System.out.println("Não pode efetuar a compra!");

        } else {

            System.out.println("Pode efetuar a compra!");

        }
        sc.close();
    }
}
