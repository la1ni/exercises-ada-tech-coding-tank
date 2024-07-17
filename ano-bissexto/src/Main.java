//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ano = 2008;
        String x = ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) ? "Bissexto" : "Não-Bissexto";

        System.out.println(x);
    }
}