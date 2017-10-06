public class Cliente {
	private String nomeCliente;
	private int cpf;
	private boolean fiado;
	
	
	
  public Cliente(String nomeCliente, int cpf, boolean fiado) {
    this.nomeCliente = nomeCliente;
    this.cpf = cpf;
    this.fiado = fiado;
    
  }
   public Cliente() {
    this.cpf = 0;
  }
  
  public void setNomeCliente(String n){
  	this.nomeCliente = n;
  }
  public void setCpf(int c){
  	this.cpf = c;
  }
  public void setFiado(boolean f){
  	this.fiado = f;
  }
  public String getNomeCliente(){
  	return this.nomeCliente;
  }

  public int getCpf(){
  	return this.cpf;
  }

  public boolean getFiado() {
  	return this.fiado;
  }


    public void logInfo(){
	System.out.println("Nome      : "+this.nomeCliente);  
	System.out.println("CPF       : "+this.cpf);  
	System.out.println("Credito ? : "+this.fiado);  
	
	System.out.println();  
  }
}
