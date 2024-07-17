import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número correspondente ao seu mês de nascimento: ");
        int mesInserido = scanner.nextInt();

        System.out.print("Digite o dia em que você nasceu: ");
        int diaNascimento =  scanner.nextInt();

        String resposta = (mesInserido == 3 && diaNascimento >= 21) || (mesInserido == 4 && diaNascimento <= 20) ? "Áries":
                (mesInserido == 4 && diaNascimento >= 21) || (mesInserido == 5 && diaNascimento <= 20) ? "Touro":
                (mesInserido == 5 && diaNascimento >= 21) || (mesInserido == 6 && diaNascimento <= 20) ? "Gêmeos":
                (mesInserido == 6 && diaNascimento >= 21) || (mesInserido == 7 && diaNascimento <= 22) ? "Câncer":
                (mesInserido == 7 && diaNascimento >= 23) || (mesInserido == 8 && diaNascimento <= 22) ? "Leão":
                (mesInserido == 8 && diaNascimento >= 23) || (mesInserido == 9 && diaNascimento <= 22) ? "Virgem":
                (mesInserido == 9 && diaNascimento >= 23) || (mesInserido == 10 && diaNascimento <= 22) ? "Libra":
                (mesInserido == 10 && diaNascimento >= 23) || (mesInserido == 11 && diaNascimento <= 21) ? "Escorpião":
                (mesInserido == 11 && diaNascimento >= 22) || (mesInserido == 12 && diaNascimento <= 21) ? "Sagitário":
                (mesInserido == 12 && diaNascimento >= 22) || (mesInserido == 1 && diaNascimento <= 20) ? "Capricórnio":
                (mesInserido == 1 && diaNascimento >= 21) || (mesInserido == 2 && diaNascimento <= 18) ? "Aquário":
                "Peixes";

        scanner.close();

        System.out.printf("Seu signo é %s", resposta);
    }
}