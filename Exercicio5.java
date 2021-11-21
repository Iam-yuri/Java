import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int base;
        int altura;

        System.out.println("Digite a base: ");
        base = sc.nextInt();

        System.out.println("Digite a Altura: ");
        altura = sc.nextInt();

        int area = (base * altura) / 2;
        System.out.println("O valor da area é: " + area);
        sc.close();
    }
}
