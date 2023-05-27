package ExerciciosParte2;

public class NumeroFibonacciFor {

	public static void main(String[] args) {
		
		int n1 = 1, n2 = 1;
		System.out.println(n1 + " " + n2);
		for (int i = 3; n1 + n2 < 1000; i++) {
			int numProximo = n1 + n2;
			System.out.println(numProximo);
			n1 = n2;
			n2 = numProximo;
		}

	}

}
