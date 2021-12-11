import java.util.Scanner;

public class Usuario {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int codigodoUsuario;

        System.out.println("Digite o seu código: ");
        codigodoUsuario = sc.nextInt();

        if (codigodoUsuario != 12345){

            System.out.println("Usuário Invalido");

        } else {

            System.out.println("Usuário reconhecido, agora digite sua senha");

        }

        int senha = sc.nextInt();

        if (senha != 5555){

            System.out.println("Senha incorreta");

        } else{

            System.out.println("Senha aceita");

        }
        sc.close();
    }
}
