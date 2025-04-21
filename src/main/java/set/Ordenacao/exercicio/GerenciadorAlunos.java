package main.java.set.Ordenacao.exercicio;

import java.util.*;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos(){
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        for (Aluno a : alunoSet){
            if (a.getMatricula() == matricula){
                alunoSet.remove(a);
                break;
            }
        }
    }

    Comparator<Aluno> com = new Comparator<Aluno>() {
        @Override
        public int compare(Aluno i, Aluno j) {
            if (i.getMedia() < j.getMedia()) {
                return 1;
            } else {
                return -1;
            }
        }
    };

    public Set<Aluno> exibirAlunosPorNome(){
        // TreeSet usa o metodo que vem junto com o comparable e já organiza
        // Collections.sort so funciona com List
        Set<Aluno> listaPorNome = new TreeSet<>(alunoSet);
        return listaPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        // TreeSet pode receber um comparator como parametro
        Set<Aluno> listaPorNota = new TreeSet<>(new ComparatorPorMedia());
        // listaPorNota = new TreeSet<>(alunoSet); // forma errada nesse caso
        listaPorNota.addAll(alunoSet);
        return listaPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        return alunoSet;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Thayná", 1002L, 8.7);
        gerenciadorAlunos.adicionarAluno("Iago", 1001L, 8.8);
        gerenciadorAlunos.adicionarAluno("Sil", 1004L, 8.4);
        gerenciadorAlunos.adicionarAluno("Ana Lis", 1003L, 8.6);
        gerenciadorAlunos.adicionarAluno("Piu", 1005L, 6);

        for (Aluno a : gerenciadorAlunos.exibirAlunos()){
            System.out.println(a);
        }

        System.out.println("-------------");


        for (Aluno a : gerenciadorAlunos.exibirAlunosPorNome()){
            System.out.println(a);
        }

        System.out.println("-----------");

        for (Aluno a : gerenciadorAlunos.exibirAlunosPorNota()){
            System.out.println(a);
        }
    }
}
