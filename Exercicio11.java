import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float salario;
        float preco_venda;

        System.out.println("digite o salario: ");
        salario = sc.nextFloat();

        System.out.println("digite o valor das vendas: ");
        preco_venda = sc.nextFloat();

        if (preco_venda<1500){
            float salariofinal = salario + (preco_venda * 3/100);
            System.out.println("O seu salário final é: " + salariofinal);
        }
        else{
            float salariofinal = salario + (preco_venda * 8/100);
            System.out.println("O seu salário final é: " + salariofinal);
        }

        sc.close();
    }
}
