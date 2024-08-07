import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> compras = new ArrayList<>();
        compras.add("Arroz");
        compras.add("Feijão");
        //compras.add(100); erro de compilação por causa do generics

        //Exibir a quantidade de elementos da lista
        compras.size();

        //Remover o Feijão da lista
        compras.remove("Feijão");

        //Validar se o Macarrão está na lista
        compras.contains("Macarrão");

        //Criar um array(vetor) na lista
        String[] arrayCompras = compras.toArray(new String[0]);

        //Adicionar o Macarrão na primeira posição da lista
        compras.add(0, "Macarrão");

        //Apagar toda a lista de compra
        compras.removeAll(compras);

        //Adicionar os itens Playstation, Xbox, Tv, Nintendo
        compras.add("Playstation");
        compras.add("Xbox");
        compras.add("Tv");
        compras.add("Nintendo");

        //Substituir o item da posição 0 por chocolate
        compras.add(0, "Chocolate");

        //Achar a posição do primeiro chocolate
        compras.indexOf("chocolate");

        //Criar uma sublista
        String[] lista = compras.toArray(new String[0]);

        //Percorrer e lista e exibir o item da lista
        for (String item : compras){
            System.out.println(item);
        }
    }
}