import java.util.Scanner;

public class SalarioVendedor {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);


            System.out.println("Salário Vendedor");
            String nome;
            double salario, vendas, salarioFinal;

            System.out.println("Digite o nome do funcionário: ");
            nome = entrada.nextLine();
            System.out.println("Digite o valor do salário: ");
            salario = entrada.nextDouble();
            System.out.println("Digite o valor das vendas: ");
            vendas = entrada.nextDouble();


            salarioFinal = (vendas * 0.15) + salario;

            System.out.println("Funcionário: " + nome);
            System.out.println("Salario final é: " + salarioFinal);


        }
    }
