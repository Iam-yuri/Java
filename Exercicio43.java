import java.util.Scanner;

public class Exercicio43 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int ladoA;
        int ladoB;
        int ladoC;

        System.out.println("Digite o valor do lado A: ");
        ladoA = sc.nextInt();

        System.out.println("Digite o valor do lado B: ");
        ladoB = sc.nextInt();

        System.out.println("Digite o valor do lado C: ");
        ladoC = sc.nextInt();

        var mens = "";

        if ((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)){

            if ((ladoA == ladoB) && (ladoB == ladoC)){

                mens = "Triângulo Equilátero";

            } else if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)){

                mens = "Triângulo Isósceles";

            } else{

                mens = "Triângulo Escaleno";
            }

        } else {

            mens = "Não tem a forma de um triângulo";

        }

        System.out.println("A forma do triângulo é: " + mens);
        sc.close();
    }
}
