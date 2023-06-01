package ExerciciosParte2;

import java.util.Scanner;

public class InteirosE0For {

    public static void main(String[] args) {
    	
    	Scanner leia = new Scanner(System.in);
    	int valor;
    	System.out.println("Digite um numero: ");
    	valor = leia.nextInt();
    	
        for (int i = valor; i !=0; i++) {
        	System.out.println("Digite um numero: ");
        	valor = leia.nextInt();
		}
         System.out.println("O numero é zero");
    }
}
