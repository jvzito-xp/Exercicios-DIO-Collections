package Set.Ordenacao;

import java.util.Comparator;

public class Alunos implements Comparable<Alunos> {
//atributos

private String nome;
private Long matricula;
private double media;

public Alunos(String nome, Long matricula, double media) {
    this.nome = nome;
    this.matricula = matricula;
    this.media = media;
}

public String getNome() {
    return nome;
}

public Long getMatricula() {
    return matricula;
}

public double getMedia() {
    return media;
}

@Override
public String toString() {
    return "Alunos [nome=" + nome + ", matricula=" + matricula + ", media=" + media + "]";
}

@Override
public int compareTo(Alunos a) {
    return nome.compareToIgnoreCase(a.getNome());
}
    
}

class ComparatorPorNota implements Comparator<Alunos> {

    @Override
    public int compare(Alunos n1, Alunos n2) {
        return Double.compare(n1.getMedia(), n2.getMedia());
    }

    
}