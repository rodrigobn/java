package exercicio3;

public class Placa {
	private double altura, largura;
	private String mensagem, corPlaca, corMensagem;
	
	public Placa(double altura, double largura, String mensagem, String corPlaca, String corMensagem) {
		this.altura = altura;
		this.largura = largura;
		this.mensagem = mensagem;
		this.corPlaca = corPlaca;
		this.corMensagem = corMensagem;
	}
	
	public double area() {
		double area = getAltura() * getLargura();		
		return area;
		
	}
	
	public int quantidadeLetras() {
		int tamanhoFrase = 0;
		String[] conjuntoPalavras = getMensagem().split(" ");
		for (String palavra : conjuntoPalavras) {
			tamanhoFrase += palavra.length();
		}
		return tamanhoFrase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getCorPlaca() {
		return corPlaca;
	}

	public void setCorPlaca(String corPlaca) {
		this.corPlaca = corPlaca;
	}

	public String getCorMensagem() {
		return corMensagem;
	}

	public void setCorMensagem(String corMensagem) {
		this.corMensagem = corMensagem;
	}

	@Override
	public String toString() {
		return "Placa [altura=" + altura + ", largura=" + largura + ", mensagem=" + mensagem + ", corPlaca=" + corPlaca
				+ ", corMensagem=" + corMensagem + "]";
	}
	
	
}
