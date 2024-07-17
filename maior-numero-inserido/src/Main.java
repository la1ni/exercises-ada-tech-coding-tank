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

        int maior = (numeroInserido1 > numeroInserido2) ?
                ((numeroInserido1 > numeroInserido3) ? numeroInserido1 : numeroInserido3) :
                ((numeroInserido2 > numeroInserido3) ? numeroInserido2 : numeroInserido3);


        scanner.close();

        System.out.printf("O maior número inserido é: %s ", maior);
    }
}
