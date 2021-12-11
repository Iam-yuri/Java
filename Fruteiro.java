import java.util.Scanner;

public class Fruteiro {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int macas;
        int maracuja;

        System.out.println("Digite a quantidade de maçãs (em kg): ");
        macas = sc.nextInt();

        System.out.println("Digite a quantidade de maracuja (em kg): ");
        maracuja = sc.nextInt();

        if (macas <= 5 && maracuja <= 5){

            double kgMacas = macas * 1.80;
            double kgMaracujas = maracuja * 2.50;
            double subTotal = kgMacas + kgMaracujas;
            System.out.println("O valor total e sem desconto é de: R$" + subTotal);

        } else if (macas > 5 && maracuja > 5){

            double kgMacas = macas * 1.50;
            double kgMaracujas = maracuja * 2.20;
            double subTotal = kgMacas + kgMaracujas;
            System.out.println("O valor total e sem desconto é de: R$" + subTotal);

        } else if (macas > 5 && maracuja <= 5){

            double kgMacas = macas * 1.50;
            double kgMaracujas = maracuja * 2.20;
            double subTotal = kgMacas + kgMaracujas;
            System.out.println("O valor total e sem desconto é de: R$" + subTotal);

        } else if (macas <= 5 && maracuja > 5){

            double kgMacas = macas * 1.80;
            double kgMaracujas = maracuja * 2.50;
            double subTotal = kgMacas + kgMaracujas;
            System.out.println("O valor total e sem desconto é de: R$" + subTotal);

        }
        sc.close();
    }
}
