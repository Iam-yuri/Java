import java.util.Scanner;

public class Exercicio15 {
   
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int quantidade;

        System.out.println("Digite a quantidade de maças compradas: ");
        quantidade = sc.nextInt();

        if(quantidade<12){
            int total = quantidade * 1;
            System.out.println("O valor é de: " + total);
        }
        else{
            double total = quantidade * 1.3;
            System.out.println("O valor é de: " + total);
        }
        sc.close();
    }
}
