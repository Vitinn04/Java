package lacos;

import java.util.Scanner;

public class SomaWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double n, soma = 0, i = 1;
		
		while (i < 6) {
			System.out.println("Digite um numero");
			n = leia.nextDouble();
			
			soma = soma + n;
			i++;
			
		}
		System.out.println(soma);
	}

}
