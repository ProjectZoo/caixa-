//abrir conta e depositar
public class Cliente{
   private String nome;
   private String cpf;
   private String endereco;
   private String telefone;
 public Cliente (String nome, String cpf, String endereco, String telefone){
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.endereco = endereco;

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
public String getEndereco() {
    return endereco;
}
public void setEndereco(String endereco) {
    this.endereco = endereco;
}
public String getTelefone() {
    return telefone;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}
}

//herança, polimorfismo
///e se conta for o getter e o setter do cliente e a agencia das operações?