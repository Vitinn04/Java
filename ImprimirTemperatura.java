package ExerciciosParte2;

import java.util.Scanner;

public class ImprimirTemperatura {

	public static void main(String[] args) {
		
		int temperatura;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a temperatura");
		temperatura = leia.nextInt();
		
		if (temperatura <= 14) {
			System.out.println("Frio Congelante");
		} else if (temperatura > 14 && temperatura <= 21){
			System.out.println("Com frio");
		} else if (temperatura > 21 && temperatura <= 24) {
			System.out.println("Confortavel");
		}else if (temperatura > 24 && temperatura <= 31) {
			System.out.println("Com calor");
		}else {
			System.out.println("Calor escaldante");
		}
	}

}
