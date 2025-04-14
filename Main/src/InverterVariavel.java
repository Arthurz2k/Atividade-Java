import java.util.Scanner;

public class InverterVariavel {
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

        System.out.println("Inverter Variável");

       int A, B, InvertidaA, InvertidaB;


        System.out.println("Digite um numero inteiro para A:");
        A = entrada.nextInt();
        System.out.println("Digite um numero inteiro para B:");
        B = entrada.nextInt();


        InvertidaB = A;
        InvertidaA = B;
        System.out.println("O Numero invertido de A: "+ InvertidaA);
        System.out.println("O Numero invertido de B: "+InvertidaB);


    }
}