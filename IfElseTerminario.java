import java.util.Scanner;

public class IfElseTerminario {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        String msg = (idade<18)? "Não pode entrar na balada" : "Pode entrar na balada";

        System.out.println(msg);

        sc.close();
    }
}


