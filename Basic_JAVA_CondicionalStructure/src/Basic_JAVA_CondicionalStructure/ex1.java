// FELIPE GUEDES	
// PROGRAMA DE SISTEMA DE VERIFICAÇÃO DE NUMEROS POSITIVOS OU NEGATIVOS
	
package Basic_JAVA_CondicionalStructure;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			
		System.out.println("---- SISTEMA DE VERIFICAÇÃO DE NUMEROS POSITIVOS OU NEGATIVOS ----\n");		
		System.out.println("Qual numero voce quer verificar?");
		int num = sc.nextInt();;
	
		if(num < 0) {	
		  System.out.println("NEGATIVO");
		}
		else {
		  System.out.println("POSITIVO");
		}
		
		
		sc.close();
		
	}

}
