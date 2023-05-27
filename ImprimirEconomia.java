package ExerciciosParte2;

import java.util.Scanner;

public class ImprimirEconomia {

	public static void main(String[] args) {
		double economia;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quanto você tem de dinheiro economizado?");
		economia = leia.nextDouble();
		
		if (economia <= 0 ) {
			System.out.println("Nada de compras");
		}else if(economia > 0 && economia <= 100) {
			System.out.println("Viajem de ida e volta pra Praia Grande");
		}else if(economia > 100 && economia <= 4000) {
			System.out.println("Uma boa moto usada ");
		}else {
			System.out.println("Mais alguma bobagem legal");
		}
		
	}

}
