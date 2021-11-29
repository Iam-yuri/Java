import java.util.Scanner;

public class Exercicio25 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        float n1;
        float n2;
        float n3;
        float p1;
        float p2;
        float p3;

        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextFloat();

        System.out.println("Digite o primeiro peso: ");
        p1 = sc.nextFloat();

        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextFloat();

        System.out.println("Digite o segundo peso: ");
        p2 = sc.nextFloat();

        System.out.println("Digite a terceira nota: ");
        n3 = sc.nextFloat();

        System.out.println("Digite o terceiro peso: ");
        p3 = sc.nextFloat();
        
        float media_final = (n1 * p1 + n2 * p2 + n3 * p3) / 5;
        System.out.println("A média final é: " + media_final);
        sc.close();
    }
}
