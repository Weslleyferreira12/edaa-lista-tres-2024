import java.util.Scanner;

public class Ordenar {

    
     public Ordenar() {
    }


    
    public void receberNomes(Scanner sc, int quantidade, String[] nomes) {
        sc.nextLine();
       for (int i = 0; i < quantidade; i++) {
         System.out.print("Insira os nomes aqui: ");
         nomes[i] = sc.nextLine();
       }
    }


    public void selectionSort(String[] nomes) {
        for (int i = 0; i < nomes.length - 1; i++) {
            int menor = i;  

            for (int j = menor + 1; j < nomes.length; j++) {  
               if (nomes[j].length() < nomes[menor].length()) {   
                  menor = j;   
            }
        }
            if (menor != i) {
              String auxiliar = nomes[i]; 
              nomes[i] = nomes[menor];
              nomes[menor] = auxiliar;
            }
        }
      
    }
}