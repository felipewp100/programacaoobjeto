package entities;

public class Tarefa {
    private String descricao;
    private String prioridade;

    public Tarefa(String descricao, String prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}
