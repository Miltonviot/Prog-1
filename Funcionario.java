import java.util.Date;

public class Funcionario {
  String nome;
  Double salario;
  Date dataContratacao;

  public Funcionario(String nome, Double Salario, Date DataContratacao) {
    this.nome = nome;
    this.salario = Salario;
    this.dataContratacao = DataContratacao;
  }
  
  public String getNome(){
	  return this.nome;
	  
  }
  
}
