import java.util.Date;

public class Funcionario {
  private String nome;
  private double salario;
  private int cpf;
  private Date dataContratacao = new Date();
  
  public Funcionario(String n,double s,int c, Date d){
  this.nome = n;
  this.salario = s;
  this.cpf = c;
  this.dataContratacao = d;
  }
  public Funcionario(){
  
  this.salario = 0.0;
  
  
  }
  //seter
  public void setContrato(int dd, int mm, int aaaa){
    this.dataContratacao = new Date(aaaa, mm, dd);
  }
  
  public void setNome(String n){
	  this.nome = n;
	}
  
  public void setSalario(double s){
    this.salario = s;
  }

  public void setCpf(int cpfn){
    this.cpf = cpfn;
  }
  
  public void setDataContratacao(Date d){
    this.dataContratacao = d;
  }
  
  //geter
  public String getNome() {
    return this.nome;
  }

  public double getSalario() {
    return this.salario;
  }

  public int getCpf() {
    return this.cpf;
  }

  void MostraFuncionario(){
    System.out.println("\nNome: "+this.nome);
    System.out.println("\nCpf: "+this.cpf);
    System.out.println("\nSalario: "+this.salario);
  }
}
