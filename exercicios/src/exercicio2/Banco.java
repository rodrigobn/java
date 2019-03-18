package exercicio2;

public class Banco {

	public static void main(String[] args) {
		
		System.out.println("------------- Conta 1 ----------------");
		ContaCorrente cc = new ContaCorrente("Rodrigo");
		
		cc.deposito(100);
		
		System.out.println(cc.getSaldo());
		
		cc.sacar(95);
		System.out.println(cc.getSaldo());
		System.out.println("--------------------------------------");
		System.out.println("");
		
		System.out.println("------------- Conta 2 ----------------");
		ContaCorrente cce = new ContaCorrente("Aline");
		
		cce.deposito(50);
		
		System.out.println(cce.getSaldo());
		
		cce.sacar(47.5);
		System.out.println(cce.getSaldo());
		System.out.println("--------------------------------------");
	}
		
}
