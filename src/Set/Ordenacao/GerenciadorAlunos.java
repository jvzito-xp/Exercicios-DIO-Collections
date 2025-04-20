package Set.Ordenacao;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunoset;

    public GerenciadorAlunos() {
        this.alunoset = new HashSet<>();
    }
    public void adicionarAluno(String nome, long matricula, double media){
        alunoset.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(Long matricula){
       Alunos alunoremover = null;
       for(Alunos a: alunoset){
        if (Objects.equals(a.getMatricula(), matricula)) {
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

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("João", 213, 6);
        gerenciadorAlunos.adicionarAluno("Mateus", 123, 7);
        gerenciadorAlunos.adicionarAluno("Kayo", 123, 8);
        gerenciadorAlunos.adicionarAluno("Kayo", 323, 10);
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(123L);
        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
