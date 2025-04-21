package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas2 {
    private Set<String> palavras;

    @Override
    public String toString() {
        return "ConjutoPalavrasUnicas2{" +
                "palavras=" + palavras +
                '}';
    }

    public ConjuntoPalavrasUnicas2(){
        this.palavras = new HashSet<String>();
        }

        public void adicionarPalavra(String palavra){
            palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        for (String i : palavras) {
            if (i.equals(palavra)){
                palavras.remove(i);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra) {
        int check = 0;
        for(String i : palavras){
            if (i.equals(palavra)){
                check += 1;
                System.out.println("A palavra " + i + " está presente na lista.");
                break;
            }
        }
        if (check == 0){
            System.out.println("A palavra " + palavra + " não está na lista.");
        }
    }

    public Set<String> exibirPalavrasUnicas(){
        return palavras;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas2 conjuntoPalavrasUnicas2 = new ConjuntoPalavrasUnicas2();

        conjuntoPalavrasUnicas2.adicionarPalavra("Domingo");
        conjuntoPalavrasUnicas2.adicionarPalavra("Segunda");
        conjuntoPalavrasUnicas2.adicionarPalavra("Terça");
        conjuntoPalavrasUnicas2.adicionarPalavra("Quarta");
        conjuntoPalavrasUnicas2.adicionarPalavra("Quinta");
        conjuntoPalavrasUnicas2.adicionarPalavra("Sexta");
        conjuntoPalavrasUnicas2.adicionarPalavra("Sábado");

        conjuntoPalavrasUnicas2.removerPalavra("Terça");
        conjuntoPalavrasUnicas2.verificarPalavra("hoje");
        System.out.println(conjuntoPalavrasUnicas2.exibirPalavrasUnicas());

    }
}
