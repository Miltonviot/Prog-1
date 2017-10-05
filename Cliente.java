public class Cliente {
	String nomeCliente;
	int CPF;
	boolean Fiado;
	
	
	
  public Cliente(String nomeCliente, int CPF, boolean Fiado) {
    this.nomeCliente = nomeCliente;
    this.CPF = CPF;
    this.Fiado = Fiado;
    
  }
  
    public void logInfo(){
	System.out.println("Nome      : "+this.nomeCliente);  
	System.out.println("CPF       : "+this.CPF);  
	System.out.println("Credito ? : "+this.Fiado);  
	
	System.out.println();  
  }
}
