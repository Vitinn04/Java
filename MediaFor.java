package ExerciciosParte2;

import java.util.Scanner;

public class MediaFor {

    public static void main(String[] args) {
        double media, num, vl, soma = 0;
    	
    	Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros: ");
        num = leia.nextDouble();
        
        for (int i = 1; i <= num; i++) {
        	System.out.println("Digite o numero #" + i + ":");
        	vl = leia.nextDouble();
        	soma += vl;
        	
		}
        media = soma / num;
        
        System.out.println("a media é: " + media);
 
    }
}