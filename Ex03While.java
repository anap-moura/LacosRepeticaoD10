package CanvasD10;

import java.util.Scanner;

public class Ex03While {

	public static void main(String[] args) {
		
		int idade;
		int menores21=0;
		int maiores50=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite uma idade:");
		idade = leia.nextInt();
		
		while (idade >0) {
			if(idade<21) {
				menores21++;
				
			}else if(idade>50) {
				maiores50++;
			}
			System.out.println("Digite outra idade:");
			idade = leia.nextInt();
			
		}
		System.out.println("Total de pessoas menores de 21 anos:" +menores21);
		System.out.println("Total de pessoas maiores de 50 anos:" +maiores50);

}
}
