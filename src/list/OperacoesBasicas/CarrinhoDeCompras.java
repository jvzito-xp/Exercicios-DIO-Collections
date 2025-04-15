package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));

    }
    public void removerItem(String nome){
        List<Item> itensparaSair = new ArrayList<>();
        for (Item i: itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensparaSair.add(i);
            }
            itemList.removeAll(itensparaSair);
        }
    }
    public void calcularValorTotal(){
       double soma = 0;
        for (Item num : itemList){
            double valorItem = num.getPreco() * num.getQuantidade();
            soma += valorItem;
        }
        System.out.println("valor itens carrinho: " + soma);
    }
    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Leite", 10, 1);
        carrinhoDeCompras.adicionarItem("Arroz 1Kg", 20, 1);
        carrinhoDeCompras.calcularValorTotal();
    }
}
