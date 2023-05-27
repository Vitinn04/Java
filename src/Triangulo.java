import java.util.Scanner;

public abstract class Triangulo {

	public static void main(String[] args) {
		double n1, n2, n3;
		Scanner leia = new Scanner(System.in); 
		 
		 System.out.println("Digite o primeiro numero");
		 n1 = leia.nextDouble();
		 
		 System.out.println("Digite o segundo numero");
		 n2 = leia.nextDouble();
		 
		 System.out.println("Digite o terceiro numero");
		 n3 = leia.nextDouble();
		 
		 if (n1 == n2 & n2 == n3) {
			System.out.println("Triangulo equilatero");
		} else {
			System.out.println("Não é um triangulo equilatero");

		}

	}

}
