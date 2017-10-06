import java.util.HashMap;

public class Bebida {
	private String nomeBebida;
	private double ml,teor,valorVenda;
	private int quantEstoque;

	//construtor
	 public Bebida(String nomeBebida,double teor,double ml, double valorVenda, int quantEstoque){
		this.nomeBebida = nomeBebida;
		this.teor = teor;
		this.ml = ml;
		this.valorVenda = valorVenda;
		this.quantEstoque = quantEstoque;
		
	 }
	 public Bebida(){
		this.teor = 0.0;
		}
		
	 //seter void n retorna 
	 public void setNomeBebida(String n){
	 	this.nomeBebida = n;
	 }
	 public void setTeor(double t){
	 	this.teor = t;
	 }
	 public void setMl(double ml){
	 	this.ml = ml;
	 }
	 public void setValorVenda(double v){
	 	this.valorVenda = v;
	 }
	 public void setQuantEstoque(int q){
	 	this.quantEstoque = q;
	 }
	 
	//geter tem o tipo q retorna 
	public String getNome(){
	  return this.nomeBebida;
	}	

	public double getTeor(){
	  return this.teor;
	}	

	public double getMl(){
	  return this.ml;
	}

	public double getValorVenda(){
	  return this.valorVenda;
	}	

	public int getQuantEstoque(){
	  return this.quantEstoque;
	}	 
	public boolean confereEstoque(){
	 return this.quantEstoque > 0;
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
