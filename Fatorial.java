package ExerciciosParte2;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
    	Scanner leia = new Scanner(System.in);
    	
    	int num, ft;
    	
    	System.out.println("Digite um numero inteiro: ");
    	num = leia.nextInt();
    	ft = num;
    	
    	for (int i = 1; i < num; i++) {
			ft *= i;
		}
        System.out.println("O fatorial de " + num + " é " + ft);
    }
}