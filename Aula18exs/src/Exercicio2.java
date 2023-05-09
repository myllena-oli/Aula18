import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
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

        System.out.println("Deseja inserir qual elemento?");
        int elemento = ler.nextInt();
        System.out.println("Em qual posição da lista?");
        int indice = (ler.nextInt()-1);
        numeros.add(indice,elemento);

        System.out.println("Aqui está a sua lista:\n");
        System.out.println(numeros+"\n");

    }
}