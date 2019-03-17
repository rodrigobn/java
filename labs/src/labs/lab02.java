/*QN9tFkXbc - Faça um programa que recebe 2 números de ponto flutuante (dica: nextFloat do Scanner) e 
 * que imprime “pass: True!” se a média desses dois números for maior ou igual a 7.0 e imprime “pass: False!” caso contrário.
*/
package labs;

import java.util.Scanner;

public class lab02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero real: ");
		float numero1 = sc.nextFloat();
		
		System.out.println("Digite outro numero real: ");
		float numero2 = sc.nextFloat();
		
		if ((numero1 + numero2) / 2 < 7.0) {
			System.out.println("pass: False!");
		} else {
			System.out.println("pass: True");
		}
	}
	
}
