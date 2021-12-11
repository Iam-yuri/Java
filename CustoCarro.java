import java.util.Scanner;

public class CustoCarro {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float custodocarro;
        double percentualdadistribuidora = 0.28;
        double imposto = 0.45;

        System.out.println("Digite o valor de custo do carro: ");
        custodocarro = sc.nextFloat();

        double custofinal = (custodocarro * percentualdadistribuidora) + (custodocarro * imposto) + custodocarro;
        System.out.println("O valor final do custo do carro é de: R$" + custofinal);
        sc.close();
    }
}
