package ExerciciosParte2;

import java.util.Scanner;

public class ImprimirPeso {

	public static void main(String[] args) {
		
	
	double peso;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Informe o peso da criança");
	peso = leia.nextDouble();
	
	 if (peso < 13.5){

	        System.out.println("Abaixo do peso");

	    }else if (peso == 18.3){
	        
	        System.out.println("Peso perfeito");

	    }else if (peso < 21.2){
	        
	        System.out.println("Peso normal");

	    }else{
	        System.out.println("Acima do peso");
	    }

}
}
