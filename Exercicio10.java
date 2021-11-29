import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o custo de fabrica do carro:");
        float custoFabricaCarro = sc.nextFloat();
        
        float custoDistribuidor = (custoFabricaCarro * 28 / 100);
        float custoImpostos = + (custoFabricaCarro * 45 / 100);
        
        float custoFinal= custoDistribuidor;
        custoFinal+= custoImpostos;
        custoFinal+= custoFabricaCarro;
         
        System.out.println("O custo final do automóvel corresponde a : R$" + custoFinal);
        sc.close();
    }
         
}
