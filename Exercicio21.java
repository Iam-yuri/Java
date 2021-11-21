import java.util.Scanner;

public class Exercicio21 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int horainicio;
        int horafinal;

        System.out.println("Hora inicio: ");
        horainicio = sc.nextInt();

        System.out.println("Hora termino: ");
        horafinal = sc.nextInt();

        int duracao = horafinal - horainicio;

        if (duracao>0){
            System.out.println("A partida teve: " + duracao + "Horas de duração: ");
        }
        else{
            duracao = duracao + 24;
        }
        sc.close();
    }
}
