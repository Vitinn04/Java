import java.util.Scanner;

public class Comparar {

	public static void main(String[] args) {
		double n1, n2;
		 Scanner leia = new Scanner(System.in); 
		 
		 System.out.println("Digite o primeiro numero");
		 n1 = leia.nextDouble();
		 
		 System.out.println("Digite o segundo numero");
		 n2 = leia.nextDouble();
		 
		 if (n1 > n2) {
			System.out.println(n1 + " É maior que " + n2);
		}else if (n2 > n1 ) {
			System.out.println(n2 + " É maior que " + n1);
		}else {
			System.out.println("Os números são iguais");
		}
	}

}
