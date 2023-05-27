import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
	 double n1, n2, n3, soma;
	 Scanner leia = new Scanner(System.in); 
	 
	 System.out.println("Digite o primeiro numero");
	 n1 = leia.nextDouble();
	 
	 System.out.println("Digite o segundo numero");
	 n2 = leia.nextDouble();
	 
	 System.out.println("Digite o terceiro numero");
	 n3 = leia.nextDouble();
	 
	 soma = n1 + n2 + n3;
	 
	 System.out.println("O resultado da soma é " + soma);
	 
	 
	 
	}

}
