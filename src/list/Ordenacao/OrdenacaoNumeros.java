package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
    List<Integer> numerosAscendente = new ArrayList<>(numerosList);
    Collections.sort(numerosAscendente);
    return numerosAscendente;
    }

    public List<Integer> ordenarDescendente(){
    List<Integer> numerosDescendente = new ArrayList<>(numerosList);
    numerosDescendente.sort(Collections.reverseOrder());
    return numerosDescendente;
    }
}
