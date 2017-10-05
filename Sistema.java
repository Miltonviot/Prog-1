import java.util.Scanner;
import java.util.Date;

public class Sistema{
  public static void main(String[] args){

    Empresa empresa = new Empresa("Bodega do jaozim",99999999); 

    Funcionario oregano = new Funcionario("Oregano",1400.00,new Date(2014,03,15));
    Funcionario cormen = new Funcionario("Cormen",1400.00,new Date(1984,01,24));
    Funcionario vitinho = new Funcionario("Vitinho",1400.00,new Date(2001,02,05));
	
	
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
    
    empresa.mostraBodegueiros();
    
    
    
    
    empresa.mostrarEstoque();
    
    cerveja.addEstoque(16);
    
    empresa.mostrarEstoque();
    
    empresa.mostrarClientes();

  }
}
