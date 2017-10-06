import java.util.Scanner;
import java.util.Date;

public class Sistema{
  public static void main(String[] args){
	
	Scanner entrada = new Scanner(System.in);
	Scanner teclado = new Scanner(System.in);
    
 	// entradas padrão

	Empresa empresa = new Empresa("Bodega do jaozim",99999999); 

    Funcionario oregano = new Funcionario("Oregano",1400.00,1,new Date(2014,03,15));
    Funcionario cormen = new Funcionario("Cormen",1400.00,2,new Date(1984,01,24));
    Funcionario vitinho = new Funcionario("Vitinho",1400.00,3,new Date(2001,02,05));
	
	
	Bebida cerveja = new Bebida("Cerveja",4.35,375.00,2.89,0);
	Bebida vinho = new Bebida("vinho",18.45,1000.00,350.89,0);
	Bebida whisky = new Bebida("Whisky",57.65,900.00,120.89,0);
	
	Cliente canelaseca = new Cliente("canelaseca",111111,true);
	Cliente pezudo = new Cliente("pezudo",222222,false);
	Cliente xico = new Cliente("xico",33333333,false);
	
    empresa.contrata(oregano);
    empresa.contrata(cormen);
    empresa.contrata(vitinho);
    
    empresa.cadastrarBebida(cerveja);
    empresa.cadastrarBebida(vinho);
    empresa.cadastrarBebida(whisky);
    
    empresa.cadastraCliente(canelaseca);
    empresa.cadastraCliente(pezudo);
    empresa.cadastraCliente(xico);
	
	int op = 99,fiado;
	
	for(op = 99; op!=0;){ 
		System.out.println("=====================================");
        System.out.println("=Digite a opção desejada            =");
        System.out.println("=====================================");
        System.out.println("={1} Para Consultar os Bodegueiros  =");
        System.out.println("={2} Para Consultar os clientes     =");
        System.out.println("={3} Para Consultar os Produtos     =");
        System.out.println("={4} Para Efetuar Compra            =");
        System.out.println("={5} Para Efetuar Venda             =");
        System.out.println("={6} Para Cadastrar Clientes        =");
        System.out.println("={7} Para Cadastrar Bodegueiros    =");
        System.out.println("={8} Para Cadastrar Produtos        =");
        System.out.println("={0} Para Sair                      =");
        System.out.println("=====================================");

        op = entrada.nextInt();

        switch (op) {
          case (1):{
												empresa.mostraBodegueiros();
          break;
          }
          case (2):{
            empresa.mostrarClientes();
		  break;
		  }
		  case (3):{
            empresa.mostrarEstoque();
          break;
		  }
		  case (4):{
			
		  break;
		  }
		  case (5):{
						cerveja.rmvEstoque(6);
		  break;
		  }
		  case (6):{
			
					Cliente novo = new Cliente();
		  	
		  	System.out.println("Digite o nome: ");
		  	novo.setNomeCliente(teclado.next());
		  	System.out.println("Digite o CPF: ");
		  	novo.setCpf(teclado.nextInt());
		  	System.out.print("Crédito aprovado?, digite 1 para sim ");
       		fiado = teclado.nextInt();
       		if (fiado == 1) {
        		novo.setFiado(true);
       		} 	else {
        		novo.setFiado(false);
       		 	}

		  	empresa.cadastraCliente(novo);
		  break;
		  }
		  case (7):{
		  	
		  	Funcionario novo = new Funcionario();
		  	
		  	System.out.println("Digite o nome: ");
		  	novo.setNome(teclado.next());
		  	System.out.println("Digite o CPF: ");
		  	novo.setCpf(teclado.nextInt());
		  	System.out.println("Digite o Salario: R$");
		  	novo.setSalario(teclado.nextDouble());

		  	empresa.contrata(novo);

		  	
				
		  break;
		  }

		  case (8):{
					Bebida novo = new Bebida();
		  	
		  	System.out.println("Digite o nome da Bebida: ");
		  	novo.setNomeBebida(teclado.nextLine());
		  	System.out.println("Digite o Teor alcoolico da bebida: ");
		  	novo.setTeor(teclado.nextDouble());
		  	System.out.println("Digite quantas MLs tem a bebida:");
		  	novo.setMl(teclado.nextDouble());
		  	System.out.println("Digite o valor de venda da bebida:");
		  	novo.setValorVenda(teclado.nextDouble());

		  	empresa.cadastrarBebida(novo);

		  break;
		  }
		  case (0):{
				
		  break;
		  }
	}
  }
}
}
