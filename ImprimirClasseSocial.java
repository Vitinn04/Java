package ExerciciosParte2;

import java.util.Scanner;

public class ImprimirClasseSocial {

	public static void main(String[] args) {
		
		double classeSocial;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua renda");
		classeSocial = leia.nextDouble();
		
		if (classeSocial <= 250) {
			System.out.println("Classe E");
		} else if (classeSocial >250 && classeSocial <= 900){
			System.out.println("Classe D");
		}else if (classeSocial >900 && classeSocial <= 2500){
			System.out.println("Classe C");
		}else if (classeSocial >2500 && classeSocial <= 9500){
			System.out.println("Classe B");
		}else {
			System.out.println("Classe A");
		}




	}

}
