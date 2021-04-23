package br.com.k19.poo.banco;

public class Secretaria extends Funcionario{
	private int ramal;

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public String toString(){
		String texto = "Nome: " +this.getNome()+ "\nSal�rio: " +this.getSalario()+
				"\nBonifica��o: " +this.calcularBonificacao()+ "\nRamal: " +this.getRamal();
		return texto;
	}
}
