import java.util.Scanner;

public class MediaAritmetica {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float n1;
        float n2;

        System.out.println("Digite o valor da primeira nota: ");
        n1 = sc.nextFloat();

        System.out.println("Digite o valor da segunda nota: ");
        n2 = sc.nextFloat();

        float mediaAritmetica = (n1 + n2) / 2;

        if (mediaAritmetica >= 6){

            System.out.println("Aluno está com a média: " + mediaAritmetica);

        } else {

            System.out.println("Aluno está com a média: " + mediaAritmetica);
        }
        sc.close();
    }
}
