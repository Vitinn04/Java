package ExerciciosParte2;

import java.util.Scanner;

public class ImprimirEsporte {

	public static void main(String[] args) {
		
		double altura;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua altura");
		altura = leia.nextDouble();
		
		if(altura <= 1.65) {
			System.out.println("Piloto de corrida");
		}else if(altura > 1.65 && altura <=1.80) {
			System.out.println("Jogafdor de futebol");
		}else
			System.out.println("Jogador de basquete ou de volei");
	}

}
