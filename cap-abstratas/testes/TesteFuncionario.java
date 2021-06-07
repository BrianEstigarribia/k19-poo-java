package br.com.k19poo.abstratas.testes;

import br.com.k19poo.abstratas.Funcionario;
import br.com.k19poo.abstratas.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		
		funcionario.setSalario(3000);
		
		System.out.println("SAL�RIO DO GERENTE: "+funcionario.getSalario());
		System.out.println("BONIFICA��O: "+funcionario.calcularBonificacao());
	}
}
