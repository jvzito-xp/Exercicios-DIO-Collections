package Map.Ordenacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livroMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()){
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover){
            livroMap.remove(chave);
        }
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("313", "Bleach", "Kubo", 60);
    }
}
