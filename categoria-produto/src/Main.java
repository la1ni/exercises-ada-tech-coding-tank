import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual categoria de produto deseja comprar?\n1 para eletrônico\n2 para vestuário \n3 para alimento\n ");
        int op = scanner.nextInt();
        scanner.close();
        System.out.println(imprimeMensagem(op));
    }

    private static String imprimeMensagem(int op) {
        String mensagem = "";
        switch (op) {
            case 1: mensagem = CategoriaProduto.ELETRONICO.getDescricao();
                break;
            case 2: mensagem = CategoriaProduto.VESTUARIO.getDescricao();
                break;
            case 3: mensagem = CategoriaProduto.ALIMENTO.getDescricao();
                break;
            default: mensagem = "número inválido";
        }
    return mensagem;
    }

}