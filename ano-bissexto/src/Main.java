public class Main {
    public static void main(String[] args) {
        int ano = 2008;
        String x = ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) ? "Bissexto" : "Não-Bissexto";

        System.out.println(x);
    }
}