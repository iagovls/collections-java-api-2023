package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BuscaCarro {
    private List<Carro> listaCarros;

    public BuscaCarro() {
        this.listaCarros = new ArrayList<>();
    }

    public void adicionarCarro(String modelo, int ano, double consumo, boolean promocao, double preco, String cor){
        listaCarros.add(new Carro(modelo, ano, consumo, promocao, preco, cor));
    }

    public void exibirLista(){
        for (Carro i : listaCarros) {
            System.out.println(i);
        }
    }

    Comparator<Carro> com = new Comparator<Carro>() {
        @Override
        public int compare(Carro i, Carro j) {
            if (i.getAno() > j.getAno()){
                return 1;
            } else {
                return -1;
            }
        }
    };

    // reescrevendo com lambda
    Comparator<Carro> com2 = (i,j) -> i.getAno() > j.getAno() ? 1 : -1;




    public List<Carro> ordenarPorAno(){
        List<Carro> listaPorAno = new ArrayList<>(listaCarros);

        Collections.sort(listaPorAno, com);

        // se retirar o segundo parametro (com), ele vai usar o comparable que está dentro da classe Carro
        Collections.sort(listaPorAno);

        // Ou pode criar um comparator novo dentro do sort
        Collections.sort(listaPorAno, new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                if (o1.getAno() > o2.getAno()){
                    return 1;
                } else {
                    return -1;
                }
            }
        });



        return listaPorAno;
    }

    public static void main(String[] args) {
        BuscaCarro buscaCarro = new BuscaCarro();
        buscaCarro.adicionarCarro("Celta", 2012, 13.7, true, 15000, "Cinza");
        buscaCarro.adicionarCarro("Monza", 2001, 9.7, true, 11000, "Vermelho");
        buscaCarro.adicionarCarro("Onix", 2023, 14.6, false, 65000, "Branco");
        buscaCarro.adicionarCarro("208", 2024, 15.9, false, 68000, "Preto");

        // buscaCarro.exibirLista();

        System.out.println(buscaCarro.ordenarPorAno());
    }
}
