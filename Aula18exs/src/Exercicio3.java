import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Double> lista, listaPreenchida;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o tamanho da lista de números desejada: ");
        int tamanho = ler.nextInt();
        lista = capacidadeLista(tamanho);
        preencherLista(lista, tamanho);
        System.out.println("A média é "+ mediaAritmetica(lista));
    }
    public static List capacidadeLista (int tamanho){
        List<Double> listaVazia = new ArrayList<>(tamanho);
        return listaVazia;
    }
    public static boolean preencherLista (List listaVazia, int tamanho){
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o "+(i+1)+"º número:");
            listaVazia.add (ler.nextDouble());
        }
        return true;
    }
    public static double mediaAritmetica (List lista){
        double media=0;

        for (int i = 0; i < lista.size(); i++) {
            media =  (double) lista.get(i) + media;
        }
        media = (media)/(lista.size());

        return media;
    }
}