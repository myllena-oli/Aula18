import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o tamanho da lista de números desejada: ");
        int tamanho = ler.nextInt();

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o "+(i+1)+"º número:");
            numeros.add (ler.nextInt());
        }
        System.out.println("Aqui está a sua lista:\n");
        System.out.println(numeros+"\n");

        System.out.println("Qual item você quer remover?");
        int item = ler.nextInt();
        int indice = numeros.indexOf(item);
        numeros.remove(indice);

        System.out.println("Aqui está a sua lista:\n");
        System.out.println(numeros+"\n");

    }
}