import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<String>();
        ArrayList<String> prioridades = new ArrayList<String>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:\n1. Adicionar tarefa\n2. Remover tarefa\n3. Listar tarefas\n4. Sair");
            int opcao = lerTeclado.nextInt();
            lerTeclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a descrição da tarefa:");
                    String tarefa = lerTeclado.nextLine();
                    System.out.println("Digite a prioridade da tarefa (alta, média ou baixa):");
                    String prioridade = lerTeclado.nextLine();
                    tarefas.add(tarefa);
                    prioridades.add(prioridade);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    if (tarefas.size() == 0) {
                        System.out.println("Não há tarefas para remover.");
                    } else {
                        System.out.println("Tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i+1) + ". " + tarefas.get(i) + " (" + prioridades.get(i) + ")");
                        }
                        System.out.println("Digite o número da tarefa que deseja remover:");
                        int numero = lerTeclado.nextInt();
                        if (numero < 1 || numero > tarefas.size()) {
                            System.out.println("Número inválido.");
                        } else {
                            tarefas.remove(numero-1);
                            prioridades.remove(numero-1);
                            System.out.println("Tarefa removida com sucesso!");
                        }
                    }
                    break;

                case 3:
                    if (tarefas.size() == 0) {
                        System.out.println("Não há tarefas para listar.");
                    } else {
                        System.out.println("Tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i+1) + ". " + tarefas.get(i) + " (" + prioridades.get(i) + ")");
                        }
                    }
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
