package main.java.set.Pesquisa.exercicio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listTarefas;

    public ListaTarefas(){
        this.listTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean concluido){
        listTarefas.add(new Tarefa(descricao, concluido));
    }

    public void removerTarefa(String descricao){
        for (Tarefa t : listTarefas){
            if (t.getDescricao().equals(descricao)){
                listTarefas.remove(t);
                break;
            }
        }
    }

    public Set<Tarefa> exibirTarefas(){
        return listTarefas;
    }

    public int contarTarefas(){
        return listTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listTarefas){
            if (t.isConcluida()){
                tarefasConcluidas.add(new Tarefa(t.getDescricao(), t.isConcluida()));
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listTarefas){
            if (!t.isConcluida()){
                tarefasPendentes.add(new Tarefa(t.getDescricao(), t.isConcluida()));
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : listTarefas){
            if (t.getDescricao().startsWith(descricao)){
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : listTarefas){
            if (t.getDescricao().startsWith(descricao)){
                t.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        listTarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Arrumar a cama.", true);
        listaTarefas.adicionarTarefa("Arrumar a cama.", true);
        listaTarefas.adicionarTarefa("Varrer a casa.", false);
        listaTarefas.adicionarTarefa("Lavar os pratos.", true);
        listaTarefas.adicionarTarefa("Estudar.", false);
        listaTarefas.adicionarTarefa("Exercitar-se.", true);
        listaTarefas.adicionarTarefa("Orar", false);


        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("Estudar");
        for (Tarefa t : listaTarefas.exibirTarefas()){
            System.out.println(t);
        }




    }
}
