import java.util.Scanner;

public class Exercicio23 {
    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float valor;
        System.out.println("Digite o valor em graus Fahrenheit: ");
        valor = sc.nextFloat();

        float valor_final = ((valor - 32) / 9 * 5);
        System.out.println("A temperatura em graus celsius é: " + valor_final + "°C");
        sc.close();
    }
}
