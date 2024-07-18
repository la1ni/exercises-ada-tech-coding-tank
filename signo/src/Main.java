import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número correspondente ao seu mês de nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o dia em que você nasceu: ");
        int diaNascimento =  scanner.nextInt();

        String resposta = (mes == 3 && diaNascimento >= 21) || (mes == 4 && diaNascimento <= 20) ? "Áries":
                (mes == 4 && diaNascimento >= 21) || (mes == 5 && diaNascimento <= 20) ? "Touro":
                (mes == 5 && diaNascimento >= 21) || (mes == 6 && diaNascimento <= 20) ? "Gêmeos":
                (mes == 6 && diaNascimento >= 21) || (mes == 7 && diaNascimento <= 22) ? "Câncer":
                (mes == 7 && diaNascimento >= 23) || (mes == 8 && diaNascimento <= 22) ? "Leão":
                (mes == 8 && diaNascimento >= 23) || (mes == 9 && diaNascimento <= 22) ? "Virgem":
                (mes == 9 && diaNascimento >= 23) || (mes == 10 && diaNascimento <= 22) ? "Libra":
                (mes == 10 && diaNascimento >= 23) || (mes == 11 && diaNascimento <= 21) ? "Escorpião":
                (mes == 11 && diaNascimento >= 22) || (mes == 12 && diaNascimento <= 21) ? "Sagitário":
                (mes == 12 && diaNascimento >= 22) || (mes == 1 && diaNascimento <= 20) ? "Capricórnio":
                (mes == 1 && diaNascimento >= 21) || (mes == 2 && diaNascimento <= 18) ? "Aquário":
                "Peixes";

        scanner.close();

        System.out.printf("Seu signo é %s", resposta);
    }
}