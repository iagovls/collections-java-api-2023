package main.java.map.Pesquisa.exercicio;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemMap.remove(palavra);
    }

    public Map<String, Integer> exibirContagemPalavras() {
        return contagemMap;
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente() {
            int valorPalavraMaisFrequente = 0;
            String palavraMaisFrequente = "";
            Map<String, Integer> maisFrequente = new HashMap<>();
            for (Map.Entry<String, Integer> e : contagemMap.entrySet()){
                if (e.getValue() > valorPalavraMaisFrequente){
                    valorPalavraMaisFrequente = e.getValue();
                    palavraMaisFrequente = e.getKey();
                }



            }
            maisFrequente.put(palavraMaisFrequente, valorPalavraMaisFrequente);
            return maisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Porta", 6);

        contagemPalavras.adicionarPalavra("Janela", 9);

        contagemPalavras.adicionarPalavra("Cadeira", 2);

        contagemPalavras.adicionarPalavra("Mesa", 13);

        contagemPalavras.removerPalavra("Mesa");
        System.out.println(contagemPalavras.exibirContagemPalavras());
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
