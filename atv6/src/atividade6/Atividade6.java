
package atividade6;


public class Atividade6 {

    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente(27, "Jo�o", "Carlos");
        
        
        g1.dizerNome();
        g1.dizerIdade();
        System.out.println("O emprego �: "+g1.getEmprego());
        System.out.println("Meu total de vendas �: R$"+g1.getTotalVendas());
        System.out.println("Meu salario atual �: R$"+g1.getSalario());
        
        
        g1.trabalhar();
        g1.realizarVenda(1500);
        
        System.out.println("Meu total de vendas agora �: R$"+g1.getTotalVendas());
        System.out.println("Meu salario atual �: R$"+g1.getSalario());
        
    }
    
}
