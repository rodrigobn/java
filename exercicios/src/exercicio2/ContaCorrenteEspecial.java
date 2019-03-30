package exercicio2;

public class ContaCorrenteEspecial extends ContaCorrente{
	
	final double taxa = 0.01;
	
	public ContaCorrenteEspecial(String cliente) {
		super(cliente);
		
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
