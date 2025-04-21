package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros2 {
    private List<Integer> numeros;

    public OrdenacaoNumeros2 (){
        this.numeros = new ArrayList<Integer>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public ArrayList<Integer> ordenarAscendente(){
        ArrayList<Integer> listaAscendente = new ArrayList<>(numeros);
        Collections.sort(listaAscendente);
        return listaAscendente;
    }

    public ArrayList<Integer> ordenarDecrescente(){
        ArrayList<Integer> listaDecrescente = new ArrayList<>(numeros);
        Collections.sort(listaDecrescente);
        Collections.reverse(listaDecrescente);
        return listaDecrescente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros2 ordenacaoNumeros2 = new OrdenacaoNumeros2();

        ordenacaoNumeros2.adicionarNumero(4);
        ordenacaoNumeros2.adicionarNumero(7);
        ordenacaoNumeros2.adicionarNumero(1);
        ordenacaoNumeros2.adicionarNumero(13);
        ordenacaoNumeros2.adicionarNumero(15);
        ordenacaoNumeros2.adicionarNumero(9);
        ordenacaoNumeros2.adicionarNumero(17);

        System.out.println(ordenacaoNumeros2.getNumeros());
        System.out.println(ordenacaoNumeros2.ordenarDecrescente());
        System.out.println(ordenacaoNumeros2.ordenarAscendente());
    }
}
