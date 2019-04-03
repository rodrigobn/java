package lab02;

public class Disciplina {
	
	private String nomeDisciplina;
	private int horas;
	private double[] notas;
	private int[] pesosDasNotas;
	
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
	}
	
	public Disciplina(String nomeDisciplina, int numeroDeNotas) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[numeroDeNotas];
	}
	
	public Disciplina(String nomeDisciplina, int numeroDeNotas, int[] pesosDasNotas) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[numeroDeNotas];
		this.pesosDasNotas = new int[numeroDeNotas];
	}
	
	public void cadastraHoras(int horas) {
		setHoras(getHoras() + horas);
		
	}

	public void cadastraNota(int numeroNota, double valorNota) {
		setNotas(numeroNota-1, valorNota);		
	}

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

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(int numeroNota, double valorNota) {
		this.notas[numeroNota] = valorNota;
	}

	@Override
	public String toString() {
		return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", horas=" + horas + ", notas=" + notas + "]";
	}

	public int[] getPesosDasNotas() {
		return pesosDasNotas;
	}

	public void setPesosDasNotas(int[] pesosDasNotas) {
		this.pesosDasNotas = pesosDasNotas;
	}
	
	

}
