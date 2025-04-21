package main.java.list.OperacoesBasicas.exCarrinhoDeCompras;

import java.util.ArrayList;

public class Cesta {

    private ArrayList<Fruta> cesta;

    public Cesta(){
        this.cesta = new ArrayList<Fruta>();        
    }

    public ArrayList<Fruta> listar(){
        return cesta;
    }

    public void listarCesta(){
        for (Fruta fruta : cesta) {
            System.out.println(fruta.getNome() + " - R$ " + fruta.getPreco() + " - Quantidade: " + fruta.getQuant());
        }
    }

    public void adicionarFruta(String nome, Double preco, int quant){
        cesta.add(new Fruta(nome, preco, quant));
    }

    public void removerFruta(String nome){
        for (int i = 0; i < cesta.size(); i++) {
            if (cesta.get(i).getNome().contentEquals(nome)){
                cesta.remove(i);
            }
        }
        
    }

    public void calcularValorTotal(){
        double soma = 0;
        for (Fruta fruta : cesta) {
            soma += fruta.getPreco();
        }
        System.out.println("Valor total: R$ " + soma);
    }

    public static void main(String[] args) {

        System.out.println("Cesta de frutas.");
        Cesta cesta = new Cesta();
        cesta.adicionarFruta("Abacate", 2.23, 4);
        cesta.adicionarFruta("Laranja", 3.10, 2);
        cesta.adicionarFruta("Uva", 0.10, 15);
        cesta.adicionarFruta("Maçã", 0.63, 3);

        cesta.listarCesta();
        
        cesta.removerFruta("Uva");
        cesta.listarCesta();
        cesta.calcularValorTotal();
        System.out.println("---------");
        System.out.println(cesta.listar());

        
    }
}
