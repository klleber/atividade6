
package atividade6;


public class Atividade6 {

    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente(27, "João", "Carlos");
        
        
        g1.dizerNome();
        g1.dizerIdade();
        System.out.println("O emprego é: "+g1.getEmprego());
        System.out.println("Meu total de vendas é: R$"+g1.getTotalVendas());
        System.out.println("Meu salario atual é: R$"+g1.getSalario());
        
        
        g1.trabalhar();
        g1.realizarVenda(1500);
        
        System.out.println("Meu total de vendas agora é: R$"+g1.getTotalVendas());
        System.out.println("Meu salario atual é: R$"+g1.getSalario());
        
    }
    
}
