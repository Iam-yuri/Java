import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);

	    int valor;
        int valor1;
	
	    System.out.println("DIgite um valor:");
	    valor = sc.nextInt();
	
	    System.out.println("DIgite outro valor:");
	    valor1 = sc.nextInt();
	
	    int total = (valor + valor1);
	
	    System.out.println("O valor total é:" + total);
	    sc.close();

    }
}
