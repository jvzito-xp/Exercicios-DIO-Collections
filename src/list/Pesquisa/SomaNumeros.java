package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public void calcularSoma(){
        int soma = 0;
        for (int num : numerosList){
            soma += num;
        }
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()){
            for (Integer numero : numerosList){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for(Integer numero : numerosList){
            if(numero <= menorNumero){
                menorNumero = numero;
            }
        }
        return menorNumero;
    }
    public void exibirNumeros(){
        if (!numerosList.isEmpty()){
            System.out.println(numerosList.toString());
        }
    }

    public static void main(String[] args) {
        SomaNumeros somanumeros = new SomaNumeros();
        somanumeros.adicionarNumero(12);
        somanumeros.adicionarNumero(123);
        somanumeros.adicionarNumero(-123333);
        somanumeros.adicionarNumero(5443);
        somanumeros.exibirNumeros();
        System.out.println(somanumeros.encontrarMaiorNumero());
        System.out.println(somanumeros.encontrarMenorNumero());
    }
}
