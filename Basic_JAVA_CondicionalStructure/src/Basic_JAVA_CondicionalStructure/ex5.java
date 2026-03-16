// FELIPE GUEDES	
// SISTEMA DE COMPRA BÁSICO PARA UM PIZZARIA

package Basic_JAVA_CondicionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double item1Valor = 4.00;	
		double item2Valor = 4.50;	
		double item3Valor = 5.00;
		double item4Valor = 2.00;
		double item5Valor = 1.50;
		
		System.out.println("--- PIZARRIA OLIVEIRA -------\n");
		System.out.println("1 - Cachorro Quente");
		System.out.println("2 - X-salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Torrada simples");
		System.out.println("5 - Refrigerante\n");
		
		System.out.println("Qual produto voce quer?");
		double produto = sc.nextInt();
		System.out.println("Quantos voce quer?");
		int quantidade = sc.nextInt();
		
		if(produto == 1) {
			
		produto = item1Valor * quantidade;
		System.out.printf("Total: R$ %.2f", produto);	
			
		}
		else if(produto == 2) {
			
			produto = item2Valor * quantidade;
			System.out.printf("Total: R$ %.2f", produto);
			
		}
		else if(produto == 3) {
			
			produto = item3Valor * quantidade;
			System.out.printf("Total: R$ %.2f", produto);
			
		}
		else if(produto == 4) {
		
			produto = item4Valor * quantidade;
			System.out.printf("Total: R$ %.2f", produto);
			
		}
		else {
			
			produto = item5Valor * quantidade;
			System.out.printf("Total: R$ %.2f", produto);
			
		}
			
		sc.close();
		
	}

}
