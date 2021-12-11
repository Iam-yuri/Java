import java.util.Scanner;

public class ContaBanco {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float saldo;
        float debito;
        float credito;

        System.out.println("Digite o número da sua conta no banco: ");
        @SuppressWarnings("unused")
        int agencia = sc.nextInt();

        System.out.println("Digite o seu saldo disponivel:");
        saldo = sc.nextFloat();

        System.out.println("Digite o seu débito disponivel:");
        debito = sc.nextFloat();

        System.out.println("Digite o seu crédito disponivel:");
        credito = sc.nextFloat();

        float saldoatual = saldo - debito + credito;

        if (saldoatual >= 0){
            System.out.println("Seu saldo é positivo!");
        } else{
            System.out.println("Seu saldo é negativo!");
        }
        sc.close();
    }
}
