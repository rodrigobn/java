/*QN9tFkXbc - Fa�a um programa que recebe 2 n�meros de ponto flutuante (dica: nextFloat do Scanner) e 
 * que imprime �pass: True!� se a m�dia desses dois n�meros for maior ou igual a 7.0 e imprime �pass: False!� caso contr�rio.
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
