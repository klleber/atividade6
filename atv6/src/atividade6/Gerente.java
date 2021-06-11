package atividade6;

public class Gerente implements Funcionario, Pessoa, Vendedor {

    int idade;
    String nome;
    String sobrenome;
    double totalVendas;
    double salario;
    
    
    Gerente(int idade, String nome, String sobrenome){
        this.idade = idade;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = 3000;
        this.totalVendas = 0;
    }
    
    @Override
    public void trabalhar() {
        System.out.println("Estou gerindo os vendedores...");
    }

    @Override
    public String getEmprego() {
        return "Gerente de vendas";
    }

    @Override
    public void dizerIdade() {
        System.out.println("Tenho "+this.idade+" anos de idade");
    }

    @Override
    public void dizerNome() {
        System.out.println("Meu nome È "+this.nome+" "+this.sobrenome);
    }

    @Override
    public void realizarVenda(double valor) {
        this.totalVendas += valor;
    }

    @Override
    public double getTotalVendas() {
        return this.totalVendas;
    }

    @Override
    public double getSalario() {
        //Coloquei o sal√°rio com o base + 10% das vendas
        return (salario)+(this.totalVendas*0.10);
    }
    
}
