import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        Ordenar o = new Ordenar();

        
        String palavra;

        
        System.out.print("\nInforme uma palavra: ");
        palavra = sc.nextLine();
        o.setPalavra(palavra);

       
        o.bubbleShort();
        
        sc.close();
        
    }
}