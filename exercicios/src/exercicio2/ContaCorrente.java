package exercicio2;

public class ContaCorrente {
	String cliente;
	double saldo;
	final double taxa = 0.05;
	
	public ContaCorrente(String cliente) {
		this.cliente = cliente;
		this.saldo = 0;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		this.saldo += valor;
		System.out.println("Deposito realizado com sucesso de R$" + valor);
	}
	
	public void sacar(double valor) {
		if (getSaldo() - getSaldo() * this.taxa >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso de R$" + valor);
		} else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
}
