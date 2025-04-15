package Set.OperacoesBasicas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        conjuntoSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        String palavraRemover = null;
        for (String p: conjuntoSet){
            if (Objects.equals(p, palavra)){
                palavraRemover = p;
                break;
            }
        }
        conjuntoSet.remove(palavraRemover);
    }
    public void verficarPalavra(String palavra){
        if(conjuntoSet.contains(palavra)){
            System.out.println("Essa palavra está presente no conjunto");
        }else{
            System.out.println("Essa palavra não está presente no conjunto");
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println(Arrays.toString(conjuntoSet.toArray()));
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Legal");
        conjuntoPalavrasUnicas.adicionarPalavra("Beleza");
        conjuntoPalavrasUnicas.adicionarPalavra("Fofo");
        conjuntoPalavrasUnicas.verficarPalavra("Legal");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }

}
