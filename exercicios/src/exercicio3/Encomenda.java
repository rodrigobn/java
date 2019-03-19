package exercicio3;

import java.util.Calendar;

public class Encomenda {

	private Cliente cliente;
	private Placa placa;
	private Calendar dataPedido, dataEntrega;
	private double valorServico;
	private final double valorSinal = 0.5;
	private String reciboCliente, reciboEmpresa;
	
	public Encomenda(Cliente cliente, Placa placa) {
		this.cliente = cliente;
		this.placa = placa;
		this.dataPedido = Calendar.getInstance();
		this.dataEntrega = calculaPrazoEntrega();
		this.valorServico = calculaValorSevico();
	}
	
	private double custoMaterial() {
		double custo = 0;
		custo = placa.area() * 200;
		return custo ;		
	}
	
	private int custoDesenho() {
		return placa.quantidadeLetras();
	}
	
	private double calculaValorSevico() {
		return custoMaterial() * custoDesenho();
	}

	private Calendar calculaPrazoEntrega() {
		
		return null;
	}
	
		
	public Calendar getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Placa getPlaca() {
		return placa;
	}

	public Calendar getDataPedido() {
		return dataPedido;
	}

	public double getValorSinal() {
		return valorSinal;
	}

	public String getReciboCliente() {
		return reciboCliente;
	}

	public String getReciboEmpresa() {
		return reciboEmpresa;
	}
	
}
