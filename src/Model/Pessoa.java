package Model;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private boolean cadastroAtivo;

    //construtor da classe
    public Pessoa(String nome, String cpf, boolean cadastroAtivo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cadastroAtivo = cadastroAtivo;
    }


    //getters e setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public boolean isCadastroAtivo() {
        return cadastroAtivo;
    }
    public void setCadastroAtivo(boolean cadastroAtivo) {
        this.cadastroAtivo = cadastroAtivo;
    }

    //metodos da classe
    // cadastrar Pessoa no Sistema - [!] Ela nao se torna paciente, apenas entra como pessoa no sistema
    public void cadastrar() { 
    System.out.println("========CADASTRO DO SISTEMA=========");
    System.out.println("Nome: " + nome);
    System.out.println("Cpf: " + cpf);

    if (!cadastroAtivo) {
        cadastroAtivo = false; // ativa o cadastro
        System.out.println("O PACIENTE NÃO ESTA CADASTRADO NO SISTEMA, CONCLUA O CADASTRO");
    } else {
        System.out.println("PACIENTE CADASTRADO COM SUCESSO - VOCÊ JÁ CONSEGUE GERAR A INTERNAÇÃO AGORA");
    }
}

}
