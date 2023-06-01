package lacos;

import java.util.Scanner;

public class ImprimaFigura {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um numero inteiro:");
		n = leia.nextInt();	
		String texto = "";
		
		for (int i = 0; i < n; i++) {
			texto += "*";
			System.out.println(texto);
		}

	}

}
