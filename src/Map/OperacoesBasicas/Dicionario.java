package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
     public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
     }

     public void removerPalavra(String nome){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(nome);
        }
     }
     public void exibirPalavras(){
         System.out.println(dicionarioMap);
     }
     public String pesquisarPorPalavra(String palavra){
        String definicaopalavra = null;
        if (!dicionarioMap.isEmpty()){
             definicaopalavra = dicionarioMap.get(palavra);
        }
        return definicaopalavra;
     }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Olá", "Saudação");
        dicionario.adicionarPalavra("Arroz", "Comida");
        dicionario.adicionarPalavra("Homem", "genero");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Arroz");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Homem"));
    }
}
