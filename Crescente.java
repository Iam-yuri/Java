import java.util.Scanner;

public class Crescente {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println("Digite o primeiro valor: ");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        numero2 = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {

            System.out.println("A ordem dessa crescente é: " + numero3 + ", " + numero2 + " e " +numero1);

        } else if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {

            System.out.println("A soma dos maiores números são: " + numero2 + ", " + numero3 + " e " + numero1);
            
        } else if (numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {

            System.out.println("A soma dos maiores números são: " + numero1 + ", " + numero3 + " e " + numero2);

        } else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {

            System.out.println("A soma dos maiores números são: " + numero3 + ", " + numero1 + " e " + numero2);

        } else if (numero3 > numero1 && numero3 > numero2 && numero2 > numero1) {

            System.out.println("A soma dos maiores números são: " + numero1 + ", " + numero2 + " e " + numero3);

        } else {

            System.out.println("A soma dos maiores números são: " + numero2 + ", " + numero1 + " e " + numero3);

        }
        sc.close();
    }
}
