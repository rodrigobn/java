//QCT9g3lJ2 - Faça um programa que receba como entrada um número inteiro X e imprime como 
//saída a mensagem “dobro: Y, triplo: Z” (sem as aspas). Por exemplo, para a entrada 2, a saída deve ser:

package labs;

import java.util.Scanner;

public class lab01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		System.out.println("Dobro: " + (numero * 2) + " Triplo: " + (numero*3));

	}

}
