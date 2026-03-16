// FELIPE GUEDES	
// PROGRAMA DE SISTEMA DE VERIFICAÇÃO DE NUMEROS MULTIPLOS

package Basic_JAVA_CondicionalStructure;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- SISTEMA DE VERIFICAÇÃO DE NUMEROS MULTIPLOS ----\n");
		System.out.println("Quais são os 2 numeros voce quer verificar?");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
		
	}

}
