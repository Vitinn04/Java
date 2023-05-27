package ExerciciosParte2;

import java.util.Scanner;

public class ImprimirNota {

	public static void main(String[] args) {
		double nota;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota");
		nota = leia.nextDouble();	
		
		if (nota < 5) {
			System.out.println("Aluno precisa de muita ajuda");
		} else if (nota >= 5 && nota <= 7 ){
			System.out.println("Aluno na média");

		}else if (nota > 7 && nota <= 9.5 ){
			System.out.println("Aluno na acima da média");

		}else {
			System.out.println("Aluno fora da curva");

		}
	}

}
