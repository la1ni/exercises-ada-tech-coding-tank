import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para fazer a conversão dólar -> real: ");
        float dolar = sc.nextFloat();
        sc.close();
        System.out.printf("Valor convertido: R$%.2f", converteParaReal(dolar));
    }

    public static float converteParaReal(float dolar) {
        return (float) (dolar * 4.86);
    }

    /* public static float converteParaDolar(float real) {
        return (float) (real / 4.86);
    } */
}