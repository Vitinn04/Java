package lacos;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		int i = 1;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num = leia.nextInt();
		while (i < 11) {
			System.out.println(num * i);
			i++;
			
		}

	}

}
