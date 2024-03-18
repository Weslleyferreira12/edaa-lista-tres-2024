import java.util.ArrayList;

public class Ordenar {

    
    private String palavra;

    
    public Ordenar() {
    }

   
    public void bubbleShort() {
        int tamanhoPalavra = palavra.length();  
        ArrayList<String> arrayList = new ArrayList<>(); 
        for (int x = 0; x < palavra.length(); x++) {
            arrayList.add(String.valueOf(palavra.charAt(x)));  
        }
        for(int i = 0; i < tamanhoPalavra; i++ ) {  
            for(int j = 0; j < tamanhoPalavra - 1; j++) {
                if (arrayList.get(j).compareTo(arrayList.get(j+1)) > 0) {
                    String auxiliar = arrayList.get(j+1);
                    arrayList.set(j+1, arrayList.get(j));
                    arrayList.set(j, auxiliar);
                }
            }
        } 
    System.out.println("\nEm ordem crescente: " + arrayList);
    }

    
    public String getPalavra() {
        return palavra;
    }
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    
}

