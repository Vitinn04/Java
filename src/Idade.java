import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		idade = leia.nextInt();
		
		if (idade >= 18 && idade <= 70) {
			System.out.println("Voto obrigatorio");
		} else if (idade > 16 && idade < 18 || idade > 70){
			System.out.println("Voto Facultativo");
		} else {
			System.out.println("Não pode votar");
		}

	}

}
