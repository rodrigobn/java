package exercicio3;

/**
*
* Representa��o de um cliente simples. Todo cliente simples precisa ter um nome e um telefone.
* 
* @author Rodrigo Brito do Nascimento
* 
*/
public class Cliente {
	/**
	* nome do tipo String
	* telefone do cliente do tipo String, no formato DDABBBBBBBB onde DD � o codigo de �rea, 
	* A � o digito 9 e BBBBBBBB � o n�mero do telefone
	*/
	private String nome, telefone;
	
	/**
	* Constr�i um cliente a partir de seu nome e telefone.
	*
	* @param nome o nome do aluno 
	* @param telefone o telefone do cliente, no formato �0000000000�
	*/
	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	/**
	* Retorna a String que representa o nome do cliente.
	* 	
	* @return a representa��o em String do nome do cliente.
	*/
	public String getNome() {
		return nome;
	}

	/**
	* modifica a String que representa o nome do cliente.
	* 	
	*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	* Retorna a String que representa o telefone do cliente.
	* 	
	* @return a representa��o em String do telefone do cliente.
	*/
	public String getTelefone() {
		return telefone;
	}
	
	/**
	* modifica a String que representa o telefone do cliente.
	* 	
	*/
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**

	* Retorna a String que representa o cliente. A representa��o segue o 
	* formato �nome= nome do cliente, telefone= 00000000000�.
	*
	* @return a representa��o em String de um aluno.
	*/
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + "]";
	}	
	
}
