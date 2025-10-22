package Model;

public class Pessoa {
    private String nome;
    private String id;
    private String cpf;

    // Construtor
    public Pessoa(String nome, String id, String cpf) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
    }

    // Métodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void mostrarPaciente(){
        System.out.println("Nome:  "+ nome);
        System.out.println("ID:  " + id);
        System.out.println("CPF: " + cpf);
    }
}
