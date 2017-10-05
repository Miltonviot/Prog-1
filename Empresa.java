import java.util.HashMap;
import java.util.ArrayList;

public class Empresa{

	String nome;
	int cnpj;
	
	ArrayList <Funcionario> bodegueiros = new ArrayList();
	HashMap <String,Bebida> estoque = new HashMap();
	ArrayList <Cliente> clientes = new ArrayList();

	public Empresa(String nome,int cnpj){
		this.nome = nome;
		this.cnpj = cnpj;
	}
	public void cadastraCliente(Cliente c){
		clientes.add(c);
	}
	
	public void contrata(Funcionario f){
		bodegueiros.add(f);
	}
	
	public void mostraBodegueiros(){
		for (int i = 0; i < bodegueiros.size(); i++) {
			Funcionario b = bodegueiros.get(i);
			System.out.println("Nome : "+b.getNome());
			System.out.println("ID   : "+i);
			System.out.println();
		}
  	}
	
	public void mostrarClientes(){
		for (int i = 0; i < clientes.size(); i++) {
			Cliente c = clientes.get(i);
			c.logInfo();
		}
	}
	public void cadastrarBebida(Bebida b){
		String nome = b.getNome();
		estoque.put(nome,b);
	}
	
	public void comprar(String nome, int quantidade){
		estoque.get(nome).addEstoque(quantidade);
		
	}
	public void vender(String nome, int quantidade){
		estoque.get(nome).rmvEstoque(quantidade);
	}	
	
	public void mostrarEstoque(){
		
		for (String n: estoque.keySet()){
			Bebida b = estoque.get(n);
			b.logInfo();
		}
	}
	
	
}

  
