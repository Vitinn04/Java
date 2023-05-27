package ExerciciosParte2;

public class NumerosFibonacciWhile {

	public static void main(String[] args) {
		int n1 = 1, n2 = 1;
		System.out.println(n1 + " " + n2);
		int nextNum = n1 + n2;
		while (nextNum < 1000) {
			System.out.println(nextNum);
			n1 = n2;
			n2 = nextNum;
			nextNum = n1 + n2;
		}
	}

}
