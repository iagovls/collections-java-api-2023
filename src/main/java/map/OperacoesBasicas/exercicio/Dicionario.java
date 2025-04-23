package main.java.map.OperacoesBasicas.exercicio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    Map<String, String> dicionarioMap;

    public Dicionario(Map<String, String> dicionarioMap) {
        this.dicionarioMap = dicionarioMap;
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        dicionarioMap.remove(palavra);
    }

    public Map<String, String> exibirPalavras(){
        return dicionarioMap;
    }

    public String pesquisarPorPalavra(String palavra){
        return dicionarioMap.get(palavra);
    }

    public static void main(String[] args) {
        Map<String, String> dicionarioMap = new HashMap<>();
        Dicionario dicionario = new Dicionario(dicionarioMap);

        dicionario.adicionarPalavra("Hoje", "Dia atual");
        dicionario.adicionarPalavra("Amanhã", "Próximo dia");
        dicionario.adicionarPalavra("Ontem", "Dia anterior");
        dicionario.adicionarPalavra("Semana", "Sete dias");

        dicionario.removerPalavra("Amanhã");
        System.out.println(dicionario.pesquisarPorPalavra("Ontem"));

        dicionario.exibirPalavras().forEach((s, s2) ->
                        System.out.println(s + " : " + s2)
                );



    }
}
