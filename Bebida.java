import java.util.HashMap;

public class Bebida {
	String nomeBebida;
	double ml,teor,valorVenda;
	int quantEstoque;

	  public Bebida(String nomeBebida,double teor,double ml, double valorVenda, int quantEstoque){
		this.nomeBebida = nomeBebida;
		this.teor = teor;
		this.ml = ml;
		this.valorVenda = valorVenda;
		this.quantEstoque = quantEstoque;
		
	 }
	 
	 public boolean confereEstoque(){
		 return this.quantEstoque > 0;
	 }
	 
	public String getNome(){
	  return this.nomeBebida;
	  
  }	 
  public void logInfo(){
	System.out.println("Nome      : "+this.nomeBebida);  
	System.out.println("Teor  %   : "+this.teor);  
	System.out.println("Valor R$  : R$ " +this.valorVenda);  
	System.out.println("Estoque   : "+this.quantEstoque);  
	System.out.println();  
  }
  public void addEstoque(int q){
	  this.quantEstoque+=q;
  }
  
  public void rmvEstoque(int q){
	  if(q >= this.quantEstoque)
		this.quantEstoque-=q;
      else 
		System.out.println("Estoque insuficiente");		
  }
}
