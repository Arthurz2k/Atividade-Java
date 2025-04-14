import java.util.Scanner;

public class Media {
    public static void main(String[] args){
Scanner entrada = new Scanner (System.in);

        System.out.println("Média das notas");
                String nome;
                double n1, n2, n3, media;


        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite a nota 1: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite a nota 2: ");
        n2 = entrada.nextDouble();
        System.out.println("Digite a nota 3: ");
        n3 = entrada.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.println("Aluno: "+ nome);
        System.out.println("A média da sua nota é: "+ media);







    }
}
