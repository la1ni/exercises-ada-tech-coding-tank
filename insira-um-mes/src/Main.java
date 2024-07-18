import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 12: ");
        int mes = scanner.nextInt();

        String resposta = (mes == 1) ? "Janeiro": (mes == 2) ? "Fevereiro": (mes == 3) ? "Março": (mes == 4) ? "Abril": (mes == 5) ? "Maio": (mes == 6) ? "Junho": (mes == 7) ? "Julho": (mes == 8) ? "Agosto":(mes == 9) ? "Setembro": (mes == 10) ? "Outubro": (mes == 11) ? "Novembro": "Dezembro";

        scanner.close();

        System.out.printf("O mês é %s", resposta);
    }
}