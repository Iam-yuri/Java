import java.util.Scanner;

public class Combustivel {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double precodagasolina = 3.30;
        double precodoalcool = 2.90;

        System.out.println("Com qual combustível seu carro foi abastecido, [A] caso for alcool ou [G] caso for a gasolina:");
        char combustivel = sc.next().charAt(0);

        System.out.println("Quantos litros foram abastecidos?: ");
        int litros = sc.nextInt();

        if (combustivel == 'G' && litros <= 20){

            double litrosnaodescontado = litros * precodagasolina;
            double valordescontado = litrosnaodescontado * 0.04;
            double valortotal = litrosnaodescontado - valordescontado;
            System.out.println("O valor a ser pago é de: R$" + valortotal);

        } else if (combustivel == 'G' && litros > 20){

            double litrosnaodescontado = litros * precodagasolina;
            double valordescontado = litrosnaodescontado * 0.06;
            double valortotal = litrosnaodescontado - valordescontado;
            System.out.println("O valor a ser pago é de: R$" + valortotal);

        } else if (combustivel == 'A' && litros <= 20){

            double litrosnaodescontado = litros * precodoalcool;
            double valordescontado = litrosnaodescontado * 0.03;
            double valortotal = litrosnaodescontado - valordescontado;
            System.out.println("O valor a ser pago é de: R$" + valortotal);

        } else {

            double litrosnaodescontado = litros * precodoalcool;
            double valordescontado = litrosnaodescontado * 0.05;
            double valortotal = litrosnaodescontado - valordescontado;
            System.out.println("O valor a ser pago é de: R$" + valortotal);

        }
        sc.close();
    }
}
