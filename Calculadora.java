package Calculadora;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double n1, n2;
		String operacao;
		boolean continuar;
		
		try {
			do {
				System.out.println("Digite o primeiro numero: ");
				n1 = leia.nextDouble();
				
				System.out.println("Digite a operação (*,/,+,-): ");
				operacao = leia.next();
				
				System.out.println("Digite o segundo número: ");
				n2 = leia.nextDouble();
				
				System.out.println("O resultado é: " + realizarCalculo(n1, n2, operacao));
				
				continuar = verificarNovaOperacao();
			} while (continuar);
			
		} catch (InputMismatchException ex) {
			System.out.println("Os valores para calculo devem ser númericos");
		}
		
			
	}
	public static boolean verificarNovaOperacao() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja realizar outra operação? (S/N): " );
		return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N"); 
		
	}
	
	public static Double realizarCalculo(Double n1, Double n2, String operacao){
	
		double respostaCalculo = 0;
	
		switch (operacao) {
			case "*": 
				respostaCalculo = n1 * n2;
				break;
			case "/": 
				respostaCalculo = n1 / n2;
				break;
			case "+": 
				respostaCalculo = n1 + n2;
				break;
			case "-": 
				respostaCalculo = n1 - n2;
				break;
		
		default: System.out.println("Esse sinal não é valido");
				break;
		}
	return respostaCalculo;
	}
}
