import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = ler.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = ler.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1+", "+ numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero2+", " + numero1);
        } else {
            System.out.println("Os números são iguais. ");
        }

    }

}