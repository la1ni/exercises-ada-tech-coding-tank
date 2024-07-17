//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int idade = 10;
        String x;
        x = (idade < 18) ? "Juvenil" : (idade <= 40 ) ? "Adulto" : "Master";

        System.out.println(x);

    }
}