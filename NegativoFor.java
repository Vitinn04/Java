package ExerciciosParte2;

import java.util.Scanner;

public class NegativoFor {

    public static void main(String[] args) {
        double media = 0, num, vl, soma = 0;
    	
    	Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros: ");
        num = leia.nextDouble();
        
        for (int i = 1; i <= num; i++) {
        	System.out.println("Digite o numero #" + i + ":");
        	soma = leia.nextDouble();
        	if (soma < 0) {
        		media++;
        	}
		}
      
        System.out.println("Tem " + media + " negativos");
 
    }
}