import java.util.Scanner;

public class Exercicio16 {
   
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor: ");
        valor = sc.nextInt();

        if (valor>=0){
            System.out.println("É positivo");
        }
        else{
            System.out.println("É negativo");
        }
        sc.close();
    }
}
