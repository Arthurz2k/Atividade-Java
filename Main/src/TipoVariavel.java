import java.util.Scanner;

public class TipoVariavel {
    public static void main(String[] args) {
        System.out.println("Calcular Soma");
        Scanner MyObj = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.println("Digite o primeiro número: ");
        num1 = MyObj.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = MyObj.nextDouble();

        resultado = num1 + num2;
        System.out.println("O valor da soma é" + resultado);

    }
}