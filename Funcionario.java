package Atividades;

public class Funcionario {
    protected long id;
    protected String nome;
    protected String telefone;
    protected int matricula;
    protected String endereco;

    public Funcionario(long id, String nome, String telefone, int matricula, String endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public void calculaSalario() {
        System.out.println("O salário será informado nas subclasses.");
    }
}
