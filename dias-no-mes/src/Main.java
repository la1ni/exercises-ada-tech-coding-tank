import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano desejado: ");
        int ano = scanner.nextInt();
        System.out.print("Digite o mês desejado: ");
        int mes = scanner.nextInt();
        scanner.close();

        System.out.print("Número de dias do mês desejado: ");
        retornarQuantidadeDias(ano, mes);

    }

    private static void retornarQuantidadeDias(int ano, int mes) {
        boolean eBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 4 ==0 && ano % 400 == 0)? true: false;

        int quantidadeDias;
        quantidadeDias = (mes == 1) ? DiasMes.JANEIRO.getDiasMes(): (mes == 3) ? DiasMes.MARCO.getDiasMes(): (mes == 4) ? DiasMes.ABRIL.getDiasMes(): (mes == 5) ? DiasMes.MAIO.getDiasMes(): (mes == 6) ? DiasMes.JUNHO.getDiasMes(): (mes == 7) ? DiasMes.JULHO.getDiasMes(): (mes == 8) ? DiasMes.AGOSTO.getDiasMes():(mes == 9) ? DiasMes.SETEMBRO.getDiasMes(): (mes == 10) ? DiasMes.OUTUBRO.getDiasMes(): (mes == 11) ? DiasMes.NOVEMBRO.getDiasMes(): (mes == 12)? DiasMes.DEZEMBRO.getDiasMes() : (mes == 2 && !eBissexto)? DiasMes.FEVEREIRO_COMUM.getDiasMes() : (mes == 2 && eBissexto)? DiasMes.FEVEREIRO_BISSEXTO.getDiasMes(): null;

        System.out.println(quantidadeDias);
    }

}
