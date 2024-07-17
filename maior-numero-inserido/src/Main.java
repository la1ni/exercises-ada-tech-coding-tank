import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numeroInserido1 = scanner.nextInt();
        System.out.print("Digite um número inteiro: ");
        int numeroInserido2 = scanner.nextInt();
        System.out.print("Digite um número inteiro: ");
        int numeroInserido3 = scanner.nextInt();
        int maior = 0;
        if (numeroInserido1 >= maior) maior = numeroInserido1;
        if (numeroInserido2 >= maior) maior = numeroInserido2;
        if (numeroInserido3 >= maior) maior = numeroInserido3;


        scanner.close();

        System.out.printf("O maior número inserido é: %s ", maior);
    }
}
