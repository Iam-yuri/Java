import java.util.Scanner;

public class PositivoNegativo {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if (num >= 0){

            System.out.println("O número é positivo!");

        } else {

            System.out.println("O número é negativo!");

        }
        sc.close();
    }
}
