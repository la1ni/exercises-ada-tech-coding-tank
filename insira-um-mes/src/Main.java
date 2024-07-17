import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 12: ");
        int mesInserido = scanner.nextInt();

        String resposta = (mesInserido == 1) ? "Janeiro": (mesInserido == 2) ? "Fevereiro": (mesInserido == 3) ? "Março": (mesInserido == 4) ? "Abril": (mesInserido == 5) ? "Maio": (mesInserido == 6) ? "Junho": (mesInserido == 7) ? "Julho": (mesInserido == 8) ? "Agosto":(mesInserido == 9) ? "Setembro": (mesInserido == 10) ? "Outubro": (mesInserido == 11) ? "Novembro": "Dezembro";

        scanner.close();

        System.out.printf("O mês é %s", resposta);
    }
}