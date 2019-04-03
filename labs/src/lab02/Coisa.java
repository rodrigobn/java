package lab02;

public class Coisa {

	public static void main(String[] args) {

		ContaLaboratorio contaLCC2 = new ContaLaboratorio("LCC2");

		contaLCC2.consomeEspaco(1999);

		System.out.println(contaLCC2.atingiuCota());

		contaLCC2.consomeEspaco(2);

		System.out.println(contaLCC2.atingiuCota());

		contaLCC2.liberaEspaco(1);

		System.out.println(contaLCC2.atingiuCota());

		contaLCC2.liberaEspaco(1);

		System.out.println(contaLCC2.atingiuCota());

		System.out.println(contaLCC2.toString());
		
		System.out.println("--------------------------------------------------------------");

		int[] pesos = {1,2,3,2,1,2};
		
		Disciplina prog1 = new Disciplina("PROGRAMACAO 1", 6, pesos);

		prog1.cadastraHoras(10);

		prog1.cadastraNota(1, 5.0);

		prog1.cadastraNota(2, 10.0);

		prog1.cadastraNota(3, 8.0);

		prog1.cadastraNota(4, 7.0);

		prog1.cadastraNota(5, 5.0);		

		System.out.println("Aprovado? " + prog1.aprovadoMediaPonderada());

		prog1.cadastraNota(6, 7.0);

		System.out.println("Aprovado? " + prog1.aprovadoMediaPonderada());

		System.out.println(prog1.toString());
		
		System.out.println("--------------------------------------------------------------");
		
		Disciplina prog2 = new Disciplina("PROGRAMACAO 2");

		prog2.cadastraHoras(4);

		prog2.cadastraNota(1, 5.0);

		prog2.cadastraNota(2, 6.0);

		prog2.cadastraNota(3, 7.0);

		System.out.println("Aprovado? " + prog2.aprovadoMediaNormal());

		prog2.cadastraNota(4, 10.0);

		System.out.println("Aprovado? " + prog2.aprovadoMediaNormal());

		System.out.println(prog2.toString());
		
		System.out.println("--------------------------------------------------------------");
		
		ContaCantina cantinaSeuMatias = new ContaCantina("Seu Matias");

		cantinaSeuMatias.cadastraLanche(2, 500);

		cantinaSeuMatias.cadastraLanche(1, 500);

		cantinaSeuMatias.pagaConta(200);

		System.out.println(cantinaSeuMatias.getFaltaPagar());

		System.out.println(cantinaSeuMatias.toString());
		
		System.out.println("--------------------------------------------------------------");		
		
		ContaCantina cantinaDonaMaria = new ContaCantina("Dona Maria");

		cantinaDonaMaria.cadastraLanche(1, 1000, "Almoço com a família");

		cantinaDonaMaria.cadastraLanche(1, 500, "Café de 2 litros para a aula");

		cantinaDonaMaria.cadastraLanche(3, 300, "Coxinhas no intervalo");

		cantinaDonaMaria.cadastraLanche(1, 100, "Refrigerante pra descer a coxinha");

		cantinaDonaMaria.cadastraLanche(1, 200, "Milkshake pra terminar de engordar");

		cantinaDonaMaria.pagaConta(900);
		
		cantinaDonaMaria.listarDetalhes();

		System.out.println(cantinaDonaMaria.getFaltaPagar());

		System.out.println(cantinaDonaMaria.toString());
		
		System.out.println("--------------------------------------------------------------");
		
		Saude saude = new Saude();

		System.out.println(saude.getStatusGeral());

		saude.defineSaudeMental("boa");

		saude.defineSaudeFisica("boa");
		
		saude.definirEmoji("*_*");

		System.out.println(saude.getStatusGeral());

		saude.defineSaudeMental("fraca");

		saude.defineSaudeFisica("fraca");

		saude.definirEmoji("¯\\_(ツ)_/¯");
		
		System.out.println(saude.getStatusGeral());

		saude.defineSaudeMental("boa");

		saude.defineSaudeFisica("fraca");

		saude.definirEmoji(":o)");

		System.out.println(saude.getStatusGeral());

	}

}