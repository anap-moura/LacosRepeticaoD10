package CanvasD10;

import java.util.Scanner;

public class Ex02for {

	public static void main(String[] args) {
	        

	        int quantPares = 0;
	        int quantImpares = 0;
	        int x;
	        
	        Scanner leia = new Scanner(System.in);       

	        System.out.println("Digite 10 números inteiros:");

	        for (x=0; x<10; x++) {
	            System.out.println("Número " + (x + 1) + ":");
	            int numero = leia.nextInt();

	            if (numero % 2 == 0) {
	                quantPares++;
	            } else {
	                quantImpares++;
	            }
	        }

	        System.out.println("Quantidade de números pares: " + quantPares);
	        System.out.println("Quantidade de números ímpares: " + quantImpares);

	        	    }
	
	}

