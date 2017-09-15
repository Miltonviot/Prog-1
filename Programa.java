import java.util.Scanner;

public class programa{
    public static void main (String[] args){
      Scanner entrada = new Scanner(System.in);

      int nconta = 0;
      Conta Conta1 = new Conta(nconta++, "Milton"); // variavel do tipo conta
      Conta Conta2 = new Conta(nconta++, "Conta2");
      int op = 1;

      for(op = 1; op!=0;){ // prefiro usar for do que do while não desconta pf
        System.out.println("=====================================");
        System.out.println("=Digite a opção desejada            =");
        System.out.println("=====================================");
        System.out.println("={1} Para Consultar saldo da conta  =");
        System.out.println("={2} Para Efetuar Saque             =");
        System.out.println("={3} Para Efetuar Depósito          =");
        System.out.println("={4} Para Efetuar Trasnferência     =");
        System.out.println("={5} Para Exibir Dados da conta     =");
        System.out.println("={6} Para Sair                      =");
        System.out.println("=====================================");

        op = entrada.nextInt();

        switch (op) {
          case (1):{
            System.out.println(Conta1.consultarSaldo());
            break;
          }
          case (2):{
            System.out.println("Insira um valor para sacar");
            Double valorDoSaque = entrada.nextDouble ();
            if(valorDoSaque <= Conta1.consultarSaldo()){
              Conta1.sacar(valorDoSaque);
              System.out.println("Voce ainda possui "+Conta1.consultarSaldo());
            } else {
              System.out.println("Nao foi possivel sacar. Saldo insuficiente.");
            }
            break;
          }
          case (3):{
            Double valorDoDeposito = entrada.nextDouble();
            Conta1.depositar(valorDoDeposito);
            break;
          }
          case (4):{
            Double valorDaTransferencia = entrada.nextDouble();
            if (valorDaTransferencia <= Conta1.consultarSaldo()){
              Conta1.sacar(valorDaTransferencia);
              Conta2.depositar(valorDaTransferencia);
              break;
            }
          }
          case (5): {
            System.out.println("saldo conta 1 : "+ Conta1.consultarSaldo());
            System.out.println("saldo conta 2 : "+ Conta2.consultarSaldo());
            break;
          }
          default:{
            op = 0;
          }
        }
      }
    }
}
