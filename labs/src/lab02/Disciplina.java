package lab02;

/**
*
* Representação de uma disciplina simples. Toda disciplina simples precisa ter um nome, horas, notas e os pesos das notas.
* 
* @author Rodrigo Brito do Nascimento
* 
*/

public class Disciplina {
	
	/**
	* nome da disciplina do tipo String
	* horas do tipo int
	* notas do tipo lista
	* pesos das notas do tipo lista
	*/		
	private String nomeDisciplina;
	private int horas;
	private double[] notas;
	private int[] pesosDasNotas;
	
	/**
	* Constrói uma disciplina a partir de seu nome. Com quantidade de notas igual a 4 e pesos default 1.
	*
	* @param nomeDisciplina o nome da disciplina 
	*/
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
		this.pesosDasNotas = new int[getNotas().length];
		for (int i = 0; i < notas.length; i++) {
			this.pesosDasNotas[i] = 1;
		}
	}
	
	/**
	* Constrói uma disciplina a partir de seu nome e com quantidade de notas. Pesos default 1.
	*
	* @param nomeDisciplina o nome da disciplina
	* @param numeroDeNotas o numero de notas da disciplina
	*/
	public Disciplina(String nomeDisciplina, int numeroDeNotas) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[numeroDeNotas];
	}
	
	/**
	* Constrói uma disciplina a partir de seu nome, quantidade de notas e pesos para cada nota.
	*
	* @param nomeDisciplina o nome da disciplina
	* @param numeroDeNotas o numero de notas da disciplina
	* @param pesosDasNotas o peso de cada notas da disciplina
	*/
	public Disciplina(String nomeDisciplina, int numeroDeNotas, int[] pesosDasNotas) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[numeroDeNotas];
		if (pesosDasNotas.length == 0 || pesosDasNotas == null) {
			this.pesosDasNotas = new int[numeroDeNotas];
		}
		else {
			this.pesosDasNotas = pesosDasNotas;
		}
		
	}
	
	/**
	* Atribui o tempo de estudo referente a disciplina.
	*
	* @param horas o tempo de estudo da disciplina
	*/
	public void cadastraHoras(int horas) {
		setHoras(getHoras() + horas);
		
	}
	
	/**
	* Atribui a uma das notas da disciplina, o valor da nota.
	*
	* @param numeroNota qual das notas sera atribuida o valor
	* @param valorNota o valor da nota da disciplina
	*/
	public void cadastraNota(int numeroNota, double valorNota) {
		setNotas(numeroNota-1, valorNota);		
	}
	
	/**
	* Calcula a media normal de uma discipina, a soma dividido pela quantidade.
	*
	* @return Se foi aprovado ou não (True ou False)
	*/
	public boolean aprovadoMediaNormal() {
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		double media = total/notas.length;
		if (media < 7) {
			return false;
		} else {
			return true;
		}		
	}
	
	/**
	* Calcula a media ponderada de uma discipina, o peso influencia.
	*
	* @return Se foi aprovado ou não (True ou False)
	*/
	public boolean aprovadoMediaPonderada() {
		double totalNota = 0;
		double totalPeso = 0;
		
		for (int i = 0; i < notas.length; i++) {
			if (getPesosDasNotas()[i] != 0) {
				totalNota += getPesosDasNotas()[i] * getNotas()[i];
				totalPeso += getPesosDasNotas()[i];
			} else {
				totalNota += getNotas()[i];
				totalPeso = getNotas().length;
			}
		}
		double media = totalNota/totalPeso;
		if (media < 7) {
			return false;
		} else {
			return true;
		}
		
	}
	
	/**
	* Retorna o nome da disciplina.
	* 
	* @return Retorna o nome da disciplina
	*/
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	
	/**
	* Modifica o nome da disciplina.
	* 
	* @param nomeDisciplina o nome novo da disciplina
	*/
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	/**
	* Retorna a hora de estudo da disciplina.
	*
	* @return a hora de estudo da disciplina.
	*/
	public int getHoras() {
		return horas;
	}
	
	/**
	* Modifica a hora de estudo da disciplina.
	* 
	* @param horas a nova hora de estudo da disciplina.
	*/
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	/**
	* Retorna as notas da disciplina.
	*
	* @return Retorna as notas da disciplina.
	*/
	public double[] getNotas() {
		return notas;
	}
	
	/**
	* Modifica as notas da disciplina.
	*
	* @param numeroNota qual das notas sera alterada
	* @param valorNota o valor da nota que sera alterada
	*/
	public void setNotas(int numeroNota, double valorNota) {
		this.notas[numeroNota] = valorNota;
	}
	
	/**
	* Representação em String da classe Disciplina.java.
	*
	* @return Representação em String de uma disciplina.
	*/
	@Override
	public String toString() {
		return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", horas=" + horas + ", notas=" + notas + "]";
	}
	
	/**
	* Retorna os pesos de cada nota da disciplina.
	*
	* @return Retorna os pesos de cada nota da disciplina.
	*/
	public int[] getPesosDasNotas() {
		return pesosDasNotas;
	}
	
	/**
	* Modifica os pesos de cada nota da disciplina.
	*
	* @param pesosDasNotas a lista com os novos valores de peso para cada nota
	*/
	public void setPesosDasNotas(int[] pesosDasNotas) {
		this.pesosDasNotas = pesosDasNotas;
	}
	
	

}
