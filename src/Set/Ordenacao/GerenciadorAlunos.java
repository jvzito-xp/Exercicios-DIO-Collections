package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunoset;

    public GerenciadorAlunos() {
        this.alunoset = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoset.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula){
       Alunos alunoremover = null;
       for(Alunos a: alunoset){
        if (a.getMatricula().equals(matricula)) {
            alunoremover = a;
            break;
        }
       }
       alunoset.remove(alunoremover);
    }
    
    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> exibirPorNome = new TreeSet<>(alunoset);
        return exibirPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> exibirPorNota = new TreeSet<>(new ComparatorPorNota());
        exibirPorNota.addAll(alunoset);
        return exibirPorNota;
    }
    
    public void exibirAlunos(){
        System.out.println(alunoset);
    }
}
