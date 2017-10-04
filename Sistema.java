import java.util.Scanner;

public class Sistema{
  public static void main(String[] args){

    Empresa empresa = new Empresa("Bodega do jaozim",99999999);

    Funcionario oregano = new Funcionario("Oregano",1400.00,1);
    Funcionario cormen = new Funcionario("Cormen",1400.00,2);
    Funcionario vitinho = new Funcionario("Vitinho",1400.00,3);

    empresa.contrata(oregano);
    empresa.contrata(cormen);
    empresa.contrata(vitinho);

  }
}
