import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		 double n1, n2, n3, negativo = 0;
		 Scanner leia = new Scanner(System.in); 
		
		 System.out.println("Digite o primeiro numero");
		 n1 = leia.nextDouble();
		 
		 System.out.println("Digite o segundo numero");
		 n2 = leia.nextDouble();
		 
		 System.out.println("Digite o terceiro numero");
		 n3 = leia.nextDouble();
		 
		 if (Math.signum(n1) == -1 ) {
			 negativo++;
		 }
		 if (Math.signum(n2) == -1 ) {
			 negativo++;
		 }
		 if (Math.signum(n3) == -1 ) {
			 negativo++;
		 }
		
		 System.out.println("Quantidade de numeros negativos é " + negativo);
		 
		 
	
	}

}
