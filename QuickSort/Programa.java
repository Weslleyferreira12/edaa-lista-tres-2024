import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

      
        Scanner sc = new Scanner(System.in);
        Ordenar o = new Ordenar();

       
        System.out.print("\nInforme uma palavra: ");
        String palavra = sc.nextLine();
        o.setPalavra(palavra);   

        
        ArrayList<String> array = new ArrayList<>();

        for (int i = 0; i < palavra.length(); i++) {
        array.add(String.valueOf(palavra.charAt(i)));
        }

        
        System.out.println("\nString desordenada: ");
        System.out.println(array);
        
        
        o.quickSort(array, 0, array.size()-1);

        
        System.out.println("\nString ordenada em ordem crescente: ");
        System.out.println(array);

        sc.close();
    }
}