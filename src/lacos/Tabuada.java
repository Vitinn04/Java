package lacos;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int num;
		Scanner leia = new Scanner(System.in);
			System.out.println("Digite o numero");
			num = leia.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}

	}

}
