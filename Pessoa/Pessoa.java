import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pessoa implements Comparable<Pessoa>{

    
    private String nome;
    private int idade;

    
    List<Pessoa> listaPessoas = new ArrayList<>();

   
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    public Pessoa() {
    }


    
    public void ordenar(){
       Collections.sort(listaPessoas);
    }


    
    public void imprimir() {
      System.out.println("Lista ordenada: ");
        for(Pessoa p : listaPessoas) {  
          System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade());
        }
    }


    
    public void addNomes(String[] nomes) {
        for (String nome : nomes) {    
            Random random = new Random();   
            idade = random.nextInt(17, 25);  
            Pessoa pessoa = new Pessoa(nome, idade);    
            listaPessoas.add(pessoa);   
        }
    }


   
    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.getNome());
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(short idade) {
        this.idade = idade;
    }

}