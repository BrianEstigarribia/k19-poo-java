package br.com.k19poo.heranca;

public class Telefonista extends Funcionario{

	private int estacaoDeTrabalho;
	
	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}

	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}

	@Override
	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Esta��o de Trabalho: "+this.estacaoDeTrabalho);
		
	}
}
