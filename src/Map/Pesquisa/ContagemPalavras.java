package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributos
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }
    }
    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem : contagemPalavrasMap.values()){
            contagemTotal =+ contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorFrequencia = 0;
        for(Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
            if (entry.getValue() > maiorFrequencia){
                maiorFrequencia = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
                }
            }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Oi", 5);
        contagemPalavras.adicionarPalavra("Tchau", 6);
        contagemPalavras.adicionarPalavra("Moggado", 10);

        System.out.println("Numero total de palavras " + contagemPalavras.exibirContagemPalavras());

        contagemPalavras.removerPalavra("Moggado");

        contagemPalavras.exibirContagemPalavras();

        String linguagemMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("Palavra mais frequente: " + linguagemMaisFrequente);
    }
}
