public class Funcionario {
  String nome;
  Double salario;
  int codFuncionario;

  public Funcionario(String vNome, Double vSalario, int vCodFuncionario) {
    this.nome = vNome;
    this.salario = vSalario;
    this.codFuncionario = vCodFuncionario;
  }

  public void exibirDados(){
    System.out.println("Nome do Bodegueiro "+this.nome);
    System.out.println("Saldo Atual do bodegueiro "+this.salario);
    System.out.println("Numero do registro "+this.codFuncionario);
  }
}
