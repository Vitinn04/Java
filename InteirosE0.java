package ExerciciosParte2;

import java.util.Scanner;

public class InteirosE0 {

    public static void main(String[] args) {
        int num;
    	
    	Scanner leia = new Scanner(System.in);
    	int valor;
    	System.out.println("Digite um numero: ");
    	valor = leia.nextInt();
    	
        while (valor != 0) {
        	System.out.println("Digite um numero: ");
        	valor = leia.nextInt();        	
		}
         System.out.println("O numero é zero");
    }
}