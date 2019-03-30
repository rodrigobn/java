package exercicio3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Sistema {
	
	private List<Encomenda> quantidadeEncomendas;
	private List<Encomenda> encomendasFinalizadas;
	
	public Sistema() {
		quantidadeEncomendas = new ArrayList<Encomenda>();
		encomendasFinalizadas = new ArrayList<Encomenda>();
	}

	public List<Encomenda> getQuantidadeEncomendas() {
		return quantidadeEncomendas;
	}
	
	public List<Encomenda> getEncomendasFinalizadas() {
		return encomendasFinalizadas;
	}
	
	//Melhorar o metodo
	public void fazPedido(Encomenda encomenda) {
		if (getQuantidadeEncomendas().size() < 6) {
			quantidadeEncomendas.add(encomenda);
			
		} else {
			System.out.println("Agenda lotada");
		}
	}
	
	public void finalizaPedidos() {
		for (Encomenda encomenda : quantidadeEncomendas) {
			if (!encomenda.isStatusFinalizado()) {
				encomenda.setStatusFinalizado(true);
				encomendasFinalizadas.add(encomenda);
				quantidadeEncomendas.remove(encomenda);
			} else {
				encomendasFinalizadas.add(encomenda);
				quantidadeEncomendas.remove(encomenda);
			}
		}
	}
	
	public void deletaEncomendasVencidas() {
		for (Encomenda encomenda : quantidadeEncomendas) {
			if (Calendar.DAY_OF_MONTH > encomenda.getDataEntrega().DAY_OF_MONTH) {
				quantidadeEncomendas.remove(encomenda);
			}
			if (Calendar.DAY_OF_MONTH == encomenda.getDataEntrega().DAY_OF_MONTH) {
				encomenda.setStatusFinalizado(true);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Rodrigo", "33333333");
		Placa placa1 = new Placa(10, 10, "Nova placa", "azul", "branco");
		Encomenda encomenda1 = new Encomenda(cliente1, placa1);
		
		Cliente cliente2 = new Cliente("Aline", "222222222");
		Placa placa2 = new Placa(15, 15, "Outra placa", "verde", "preto");
		Encomenda encomenda2 = new Encomenda(cliente2, placa2);
		
		Cliente cliente3 = new Cliente("Neusa", "11111111111");
		Placa placa3 = new Placa(20, 20, "Outra nova placa", "amarelo", "preto");
		Encomenda encomenda3 = new Encomenda(cliente3, placa3);
		
		Sistema sys = new Sistema();
		
		sys.fazPedido(encomenda1);
		sys.fazPedido(encomenda2);
		sys.fazPedido(encomenda3);
		System.out.println(sys.getQuantidadeEncomendas().size());
		
		
		sys.finalizaPedidos();
		System.out.println(sys.getQuantidadeEncomendas().size());
	}


}
