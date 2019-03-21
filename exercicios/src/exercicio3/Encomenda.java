package exercicio3;

import java.util.Calendar;

public class Encomenda {

	private Cliente cliente;
	private Placa placa;
	private Calendar dataPedido, dataEntrega;
	private double valorServico;
	private final double valorSinal = 0.5;
	private String reciboCliente, reciboEmpresa;
	private boolean statusFinalizado;
	
	public Encomenda(Cliente cliente, Placa placa) {
		this.cliente = cliente;
		this.placa = placa;
		this.dataPedido = Calendar.getInstance();
		calculaPrazoEntrega();
		this.valorServico = calculaValorSevico();
		this.setStatusFinalizado(false);
	}
	
	public double custoMaterial() {
		double custo = 0;
		custo = placa.area() * 200;
		return custo ;		
	}
	
	public int custoDesenho() {
		return placa.quantidadeLetras();
	}
	
	public double calculaValorSevico() {
		return custoMaterial() * custoDesenho();
	}

	public void calculaPrazoEntrega() {		
		dataEntrega = dataPedido;
			dataEntrega.roll(dataPedido.DAY_OF_MONTH, true); // Faz entrega no proximo dia		
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

	public boolean isStatusFinalizado() {
		return statusFinalizado;
	}

	public void setStatusFinalizado(boolean statusFinalizado) {
		this.statusFinalizado = statusFinalizado;
	}
	
}
