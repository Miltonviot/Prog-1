
public class Conta {
    int numero;
    String dono;
    Double saldo;

    public Conta(int numeroDaConta, String nome) {
        this.numero = numeroDaConta;
        this.dono = nome;
        this.saldo = 0.0;
    }

    public void depositar (Double valor){
      this.saldo+=valor;
    }

    public void sacar (Double valor){
      if(this.saldo > 0){
        this.saldo-=valor;
      } else {
        System.out.println("Sem saldo :(");
      }
    }

    public Double consultarSaldo(){
      return this.saldo;
    }

    public void exibirDados(){
      System.out.println("Nome do Correntista "+this.dono);
      System.out.println("Saldo Atual da conta "+this.saldo);
      System.out.println("Numero da conta "+this.numero);
    }

}
