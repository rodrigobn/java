package lab02;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	List<Disciplina> disciplina;
	List<ContaLaboratorio> contaLaboratorio;
	List<ContaCantina> contaCantina;
	Saude saude;
	
	public Aluno() {
		this.contaCantina = new ArrayList<ContaCantina>();
		this.contaLaboratorio = new ArrayList<ContaLaboratorio>();
		this.disciplina = new ArrayList<Disciplina>();
	}
	
	public void cadastraLaboratorio(String nomeLaboratorio) {
		ContaLaboratorio contaLaboratorio = new ContaLaboratorio(nomeLaboratorio);
		getContaLaboratorio().add(contaLaboratorio);
	}
	
	public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
		ContaLaboratorio contaLaboratorio = new ContaLaboratorio(nomeLaboratorio, cota);
		getContaLaboratorio().add(contaLaboratorio);
	}
	
	public void consomeEspaco(String nomeLaboratorio, int mbytes) {
		
	}
	
	public void liberaEspaco(String nomeLaboratorio, int mbytes) {
		
	}
	public boolean atingiuCota(String nomeLaboratorio) {
		return false;
		
	}
	public String laboratorioToString(String nomeLaboratorio) {
		return nomeLaboratorio;
		
	}
	public void cadastraDisciplina(String nomeDisciplina) {
		
	}
	public void cadastraHoras(String nomeDisciplina, int horas) {
		
	}
	public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
		
	}
	public boolean aprovado(String nomeDisciplina) {
		return false;
		
	}
	public String disciplinaToString(String nomeDisciplina) {
		return nomeDisciplina;
		
	}
	public void cadastraCantina(String nomeCantina) {
		
	}
	public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {
		
	}
	public void pagarConta(String nomeCantina, int valorCentavos) {
		
	}
	public int getFaltaPagar(String nomeCantina) {
		return 0;
		
	}
	public String cantinaToString(String nomeCantina) {
		return nomeCantina;
		
	}
	public void defineSaudeMental(String valor) {
		
	}
	public void defineSaudeFisica(String valor) {
		
	}
	public String getStatusGeral() {
		return null;
		
	}

	private List<Disciplina> getDisciplina() {
		return disciplina;
	}

	private List<ContaLaboratorio> getContaLaboratorio() {
		return contaLaboratorio;
	}

	private List<ContaCantina> getContaCantina() {
		return contaCantina;
	}

	public Saude getSaude() {
		return saude;
	}
	
	
}
