package lab02;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.Media;

public class Disciplina {
	
	private String nomeDisciplina;
	private int horas;
	private double[] notas;
	
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
	}

	public void cadastraHoras(int horas) {
		setHoras(getHoras() + horas);
		
	}

	public void cadastraNota(int numeroNota, double valorNota) {
		setNotas(numeroNota-1, valorNota);		
	}

	public boolean aprovado() {
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		double Media = total/notas.length;
		if (Media < 7) {
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
	
	

}
