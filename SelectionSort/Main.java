import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);
        Ordenar o = new Ordenar();

        
        System.out.print("\nInforme a quantidade de nomes a ser utilizado: ");
        int quantidade = sc.nextInt();  

        
        String[] nomes = new String[quantidade];

        
        o.receberNomes(sc, quantidade, nomes);

        
        o.selectionSort(nomes);

        System.out.println("\nLista de nomes ordenada por tamanho: ");
        for ( int y = 0; y < nomes.length; y++) {
        System.out.println("Nome: " + nomes[y]);
        }

        sc.close();
        
    }
}