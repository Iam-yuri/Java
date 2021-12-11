import java.util.Scanner;

public class Idade {
   
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int idadeHomem1;
        int idadeHomem2;
        int idadeMulher1;
        int idadeMulher2;

        System.out.println("Digite a idade do homem 1: ");
        idadeHomem1 = sc.nextInt();

        System.out.println("Digite a idade do homem 2: ");
        idadeHomem2 = sc.nextInt();

        System.out.println("Digite a idade do mulher 1: ");
        idadeMulher1 = sc.nextInt();

        System.out.println("Digite a idade do mullher 2: ");
        idadeMulher2 = sc.nextInt();

        if (idadeHomem1 > idadeHomem2 && idadeMulher1 > idadeMulher2){

            int soma = idadeHomem1 + idadeMulher2;
            int produto = idadeMulher1 * idadeMulher2;

            System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma);
            System.out.println("O produto de idade entre a mulher mais velha e o homem mais novo é: " + produto);

        } else {

            int soma = idadeHomem2 + idadeMulher1;
            float produto = idadeMulher2 * idadeHomem1;

            System.out.println("A soma das idades entre o homem mais velho e a mulher mais nova é: " + soma);
            System.out.println("O produto das idades entre a mulher mais velha e o homem mais novo é: " + produto);

        }
        sc.close();
    }
}
