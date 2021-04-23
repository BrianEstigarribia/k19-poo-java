package br.com.k19.poo.banco;

public class Gerente extends Funcionario{
	private String usuario, senha;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double calcularBonificacao(){
		double bonificacao = this.getSalario() * 0.6;
		return bonificacao;
	}
	
	public String toString(){
		String texto = "Nome: " +this.getNome()+ "\nSal�rio: " +this.getSalario()+
				"\nBonifica��o: " +this.calcularBonificacao()+ "\nUsu�rio: " +this.getUsuario()+ "\nSenha:" +this.getSenha();
		return texto;
	}
}
