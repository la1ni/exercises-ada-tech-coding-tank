import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro de 1 a 7: ");
        int numeroInserido = scanner.nextInt();


        String resposta = (numeroInserido == 1)? "Domingo" : (numeroInserido == 2)? "Segunda": (numeroInserido == 3)? "Terça" : (numeroInserido == 4)? "Quarta" : (numeroInserido == 5)? "Quinta" : (numeroInserido == 6)? "Sexta" : "Sábado";

        scanner.close();

        System.out.printf("O dia da semana é %s ", resposta);

    }
}