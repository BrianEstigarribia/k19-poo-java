package br.com.k19poo.heranca;

public class Funcionario {

	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularBonificacao(){
		return this.salario * 0.1;
	}
	
	public void mostrarDados(){
		System.out.println("Nome: "+ this.nome);
		System.out.println("Salário: "+ this.salario);
		System.out.println("Bonificação: "+this.calcularBonificacao());
	}
	
	
}
