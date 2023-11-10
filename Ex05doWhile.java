package CanvasD10;

import java.util.Scanner;

public class Ex05doWhile {

	public static void main(String[] args) {
		int num;
		int somaPosi =0; 
		Scanner leia = new Scanner(System.in);
		
		
		do {
           
		System.out.println("Digite um número:");
		num = leia.nextInt();
		
            if (num > 0) {
                somaPosi += num;
            }

        } while (num != 0);
			
        System.out.println("A soma dos números positivos digitados é: " + somaPosi);

        leia.close();
	}

}
