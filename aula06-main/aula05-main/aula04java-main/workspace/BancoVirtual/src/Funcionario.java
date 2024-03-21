public class Funcionario {
    private String nome; 
    private String cpf;
    private String salario;

public Funcionario(String nome, String salario, String cpf){
    this.nome = nome;
    this.salario = salario;
    this.cpf = cpf;
}

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
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }
}
