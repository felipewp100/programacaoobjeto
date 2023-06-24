package service;

import entities.Tarefa;

import java.util.ArrayList;

public class GerenciadorTarefasService {
    private ArrayList<Tarefa> tarefas;
    

    public GerenciadorTarefasService() {
        this.tarefas = new ArrayList<>();
        
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
       
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void removerTarefa(int numero) {
        if (numero < 1 || numero > tarefas.size()) {
            System.out.println("Número inválido.");
        } else {
            tarefas.remove(numero - 1);
          
            System.out.println("Tarefa removida com sucesso!");
        }
    }

    public void listarTarefas() {
        if (tarefas.size() == 0) {
            System.out.println("Não há tarefas para listar.");
        } else {
            System.out.println("Tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i).getDescricao() + " (" +tarefas.get(i).getPrioridade() + ")");
            }
        }
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }
      
}
