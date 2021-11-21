import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int ano;
        int mes;
        int dia;

        System.out.println("Digite o ano de nascimento: ");
        ano = sc.nextInt();

        System.out.println("Digite o mes de nascimento: ");
        mes = sc.nextInt();

        System.out.println("Digite o dia de nascimento: ");
        dia = sc.nextInt();

        int total = ano * 365 + mes * 30 + dia;
        System.out.println("O total de dias é: " + total);
        sc.close();
    }
}
