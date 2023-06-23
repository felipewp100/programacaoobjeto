package views;

import entities.Tarefa;
import service.GerenciadorTarefasService;

import java.util.Scanner;

public class MenuView {
    private Scanner lerTeclado;
    private GerenciadorTarefasService gerenciadorTarefas;

    public MenuView() {
        this.lerTeclado = new Scanner(System.in);
        this.gerenciadorTarefas = new GerenciadorTarefasService();
    }

    public void exibirMenu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:\n1. Adicionar tarefa\n2. Remover tarefa\n3. Listar tarefas\n4. Sair");
            int opcao = lerTeclado.nextInt();
            lerTeclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a descrição da tarefa:");
                    String descricao = lerTeclado.nextLine();
                    System.out.println("Digite a prioridade da tarefa (alta, média ou baixa):");
                    String prioridade = lerTeclado.nextLine();
                    Tarefa tarefa = new Tarefa(descricao, prioridade);
                    gerenciadorTarefas.adicionarTarefa(tarefa);
                    break;

                case 2:
                    gerenciadorTarefas.listarTarefas();
                    System.out.println("Digite o número da tarefa que deseja remover:");
                    int numero = lerTeclado.nextInt();
                    lerTeclado.nextLine();
                    gerenciadorTarefas.removerTarefa(numero);
                    break;

                case 3:
                    gerenciadorTarefas.listarTarefas();
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        lerTeclado.close();
    }
}
