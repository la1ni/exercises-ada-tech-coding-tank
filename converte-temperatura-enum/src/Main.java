import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual a unidade atual (F, K ou C): ");
        String u1 = scanner.nextLine();
        UnidadeTemperatura unidadeAtual = UnidadeTemperatura.valueOf(u1);

        System.out.println("Digite a temperatura atual: ");
        float temperatura = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("Para qual unidade deseja converter? (F, K ou C): ");
        String u2 = scanner.nextLine();
        UnidadeTemperatura unidadeConvertida = UnidadeTemperatura.valueOf(u2);

        scanner.close();

        System.out.print("Nova temperatura em " + unidadeConvertida.name());;

        System.out.println(": " + converteTemperatura(unidadeAtual, unidadeConvertida, temperatura));
    }
    private static double converteTemperatura(UnidadeTemperatura unidadeAtual, UnidadeTemperatura unidadeConvertida, float temperatura) {
        double novaTemperatura = 0;
        if (unidadeAtual == unidadeConvertida) {novaTemperatura = temperatura;}
        switch (unidadeAtual) {
            case C -> {
                switch (unidadeConvertida) {
                    case F -> novaTemperatura = ((temperatura * 1.8) + 32);
                    case K -> novaTemperatura = temperatura + 273;
                }
            }
            case K -> {
                switch (unidadeConvertida) {
                    case C -> novaTemperatura = temperatura - 273;
                    case F -> novaTemperatura = (temperatura / 5/9) - 459.67;
                }
            }
            case F -> {
                switch (unidadeConvertida) {
                    case K -> novaTemperatura = (temperatura + 459.67) * 5/9;
                    case C -> novaTemperatura = ((double) 5 /9) * (temperatura-32);
                }
            }
        }
        return novaTemperatura;
    }
}