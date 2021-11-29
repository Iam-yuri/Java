import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int totalgols1;
        int totalgols2;

        System.out.println("Digite o nome do time 1: ");
        var time1 = sc.next();

        System.out.println("Digite o nome do time 2: ");
        var time2 = sc.next();

        System.out.println("Digite quantos gols o time 1 fez: ");
        totalgols1 = sc.nextInt();

        System.out.println("Digite quantos gols o time 2 fez: ");
        totalgols2 = sc.nextInt();

        if (totalgols1 > totalgols2){

            System.out.println("O time" + time1 + "ganhou a partida com" + totalgols1 + "gols");

        } else if (totalgols1 == totalgols2){

            System.out.println("Empate");

        } else if (totalgols1 < totalgols2){

            System.out.println("O time" + time2 + "ganhou a partida com" + totalgols2 + "gols");
        }
        sc.close();
    }
}
