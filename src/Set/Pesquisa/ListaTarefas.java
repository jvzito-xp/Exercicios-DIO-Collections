package Set.Pesquisa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }
    public void removerTarefa(String descricao){
      Tarefa tarefaRemover = null;
      for (Tarefa t: tarefaSet){
          if(t.getDescricao() == descricao){
              tarefaRemover = t;
          }
      }
      tarefaSet.remove(tarefaRemover);
    }
    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t: tarefaSet){
            if (t.isOk()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t: tarefaSet){
            if (!t.isOk()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setOk(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarComoPendente = null;
        for(Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null){
            if (tarefaParaMarcarComoPendente.isOk()) {
                tarefaParaMarcarComoPendente.setOk(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista");
        }
    }
    public void limparListaTarefas(){
        if(tarefaSet.isEmpty()){
            System.out.println("A lista já está vazia!");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
