package lab02;

import java.util.ArrayList;
import java.util.List;

public class ContaCantina {
	
	private String nomeDaCantina, descricaoProduto;
	private List<String> historicoDescricao;
	private int quantidadeItens;
	private double valorItem, valorTotal;
	
	
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.historicoDescricao = new ArrayList<String>();
	}

	public void cadastraLanche(int qtdItens, double valorCentavos) {
		setQuantidadeItens(getQuantidadeItens() + qtdItens);
		setValorItem(valorCentavos);
		setValorTotal(getValorTotal() + valorCentavos);
	}
	
	public void cadastraLanche(int qtdItens, double valorCentavos, String detalhes) {
		setQuantidadeItens(getQuantidadeItens() + qtdItens);
		setValorItem(valorCentavos);
		setValorTotal(getValorTotal() + valorCentavos);
		setDescricaoProduto(detalhes);
		getHistoricoDescricao().add(detalhes);
	}

	public void pagaConta(double valorCentavos) {
		if (getValorTotal() >= valorCentavos) {
			setValorTotal(getValorTotal() - valorCentavos);
		}
		
	}

	public double getFaltaPagar() {
		return getValorTotal();
	}
	
	public void listarDetalhes() {
		for (String descricao : historicoDescricao) {
			System.out.println(descricao);
		}
	}

	public String getNomeDaCantina() {
		return nomeDaCantina;
	}

	public void setNomeDaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "ContaCantina [nomeDaCantina=" + nomeDaCantina + ", quantidadeItens=" + quantidadeItens + ", valorTotal="
				+ valorTotal + "]";
	}

	public double getValorItem() {
		return valorItem;
	}

	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public List<String> getHistoricoDescricao() {
		return historicoDescricao;
	}	
	
}
