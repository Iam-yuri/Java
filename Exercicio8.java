import java.util.Scanner;

public class Exercicio8 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int TotalEleitores;
        float VotosB;
        float VotosN;
        float VotosV;

        System.out.println("Digite o total de eleitores por municipio: ");
        TotalEleitores = sc.nextInt();

        System.out.println("Digite o total de votos brancos: ");
        VotosB = sc.nextFloat();

        System.out.println("Digite o total de votos nulos: ");
        VotosN = sc.nextFloat();

        System.out.println("Digite o total de votos validos: ");
        VotosV = sc.nextFloat();

        float porcetagemVotosB = VotosB * 100 / TotalEleitores;
        float porcetagemVotosN = VotosN * 100 / TotalEleitores;
        float porcetagemVotosV = VotosV * 100 / TotalEleitores;

        System.out.println("A porcetagem de votos brancos é: " + porcetagemVotosB + "%");
        System.out.println("A porcetagem de votos nulos é: " + porcetagemVotosN + "%");
        System.out.println("A porcetagem de votos validos é: " + porcetagemVotosV + "%");

        sc.close();
    }
}
