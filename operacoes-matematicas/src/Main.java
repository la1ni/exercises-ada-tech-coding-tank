import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite mais um número: ");
        int n2 = scanner.nextInt();
        System.out.println("Qual operação deseja fazer?\n1 para adição (+)\n2 para subtração (-)\n3 para multiplicação (*)\n4 para divisão (/): ");
        int op = scanner.nextInt();
        OperacaoMatematica operacaoMatematica = (op == 1)? OperacaoMatematica.ADICAO: (op == 2)? OperacaoMatematica.SUBTRACAO : (op == 3)? OperacaoMatematica.MULTIPLICACAO: OperacaoMatematica.DIVISAO;
        scanner.close();

        System.out.print("O resultado é: ");
        System.out.println(operacao(n1, n2, operacaoMatematica));
    }

    public static int operacao(int a, int b, OperacaoMatematica operacaoMatematica) {

        int resultado = 0;
        switch (operacaoMatematica) {
            case ADICAO -> {
                resultado = a + b;
            }
            case SUBTRACAO -> {
                if (a == b) {
                    resultado = 0;
                }
                if (a < b) {
                    resultado = b - a;
                } else resultado = a - b;
            }
            case MULTIPLICACAO -> {
                resultado = a * b;
            }
            case DIVISAO -> {
                if (a == b) {
                    resultado = 1;
                }
                if (a < b) {
                    resultado = b / a;
                } else resultado = a / b;
            }
        }
        return resultado;
    }
}