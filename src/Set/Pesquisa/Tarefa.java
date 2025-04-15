package Set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    //atributos
    private String descricao;
    private boolean isOk;

    public Tarefa(String descricao, boolean isOk) {
        this.descricao = descricao;
        this.isOk = isOk;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return isOk() == tarefa.isOk() && Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao(), isOk());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", isOk=" + isOk +
                '}';
    }
}
