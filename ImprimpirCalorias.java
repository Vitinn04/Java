package ExerciciosParte2;

import java.util.Scanner;

public class ImprimpirCalorias {

	public static void main(String[] args) {
		int pao, bolacha, achocolatado, paoCalorias, bolachaCalorias, achocalatadoCalorias, calorias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos p�es voc� come por dia?");
		pao = leia.nextInt();
		
		System.out.println("Quantos pacotes de bolacha voc� come por dia?");
		bolacha = leia.nextInt();
		
		System.out.println("Quantos achocolatados voc� bebe por dia?");
		achocolatado = leia.nextInt();
		
		paoCalorias = pao*50;
		bolachaCalorias = bolacha*80;
		achocalatadoCalorias = achocolatado*70;
		
		calorias = paoCalorias+bolachaCalorias+achocalatadoCalorias;
		
		if (calorias <= 200) {
			System.out.println("Parab�ns, vai sair em forma da quarentena!");
		}else if(calorias > 200 && calorias <= 400) {
			System.out.println("Cuidado, vai ficar mais fofinho(a)");
		}else {
			System.out.println("Bom, acho que muitos n�o v�o te reconhecer ap�s a quarentena");
		}
	}

}
