//QCT9g3lJ2 - Fa�a um programa que receba como entrada um n�mero inteiro X e imprime como 
//sa�da a mensagem �dobro: Y, triplo: Z� (sem as aspas). Por exemplo, para a entrada 2, a sa�da deve ser:

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
