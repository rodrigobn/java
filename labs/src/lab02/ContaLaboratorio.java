package lab02;

public class ContaLaboratorio {

	private String nomeLaboratorio;
	private int espacoOcupado;
	private int cota;
	
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
		
	}
	
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
		
	}

	public void consomeEspaco(int mbytes) {
		setCota(getCota() - mbytes);

	}

	public boolean atingiuCota() {
		if (getCota() <= 0) {
			return true;
		} else {
			return false;
		}		
	}

	public void liberaEspaco(int mbytes) {
		setCota(getCota() + mbytes);
		
	}

	public String getNomeLaboratorio() {
		return nomeLaboratorio;
	}

	public void setNomeLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}

	public int getEspacoOcupado() {
		return espacoOcupado;
	}

	public void setEspacoOcupado(int espacoOcupado) {
		this.espacoOcupado = espacoOcupado;
	}

	public int getCota() {
		return cota;
	}

	public void setCota(int cota) {
		this.cota = cota;
	}

	@Override
	public String toString() {
		return "ContaLaboratorio [nomeLaboratorio=" + nomeLaboratorio + ", espacoOcupado=" + espacoOcupado + ", cota="
				+ cota + "]";
	}
	
	

}
