package ExerciciosParte2;

import java.util.Scanner;

public class ImprimirMeta {
	public static void main(String[] args) {
		
	
	double diferenca, meta, guardado, falta;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite a Meta");
	meta = leia.nextDouble();
	
	System.out.println("Digite o dinheiro guadado");
	guardado = leia.nextDouble();
	
	diferenca = guardado - meta;
	falta = meta - guardado;
	
	if (guardado == meta) {
		System.out.println("Parab�ns, meta alcan�ada!");
		
	} else if (guardado > meta){
		System.out.println("Parab�ns, meta ultrapassada!");
	}else {
		System.out.println("For�a! Ainda em busca da meta! ");
	}
}
}
