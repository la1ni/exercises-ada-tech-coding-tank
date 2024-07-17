import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numeroInserido = scanner.nextInt();


        String resposta = (numeroInserido == 2) ||( numeroInserido == 3) || (numeroInserido == 5) || (numeroInserido == 7)? "é primo!" : (numeroInserido % 2 == 0)? "não é primo" : (numeroInserido % 3 == 0) || (numeroInserido % 5 == 0) || (numeroInserido % 7 == 0)? "não é primo": "é primo!";

        scanner.close();

        System.out.printf("O número inserido %s", resposta);
    }
}