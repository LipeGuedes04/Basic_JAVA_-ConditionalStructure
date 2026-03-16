// FELIPE GUEDES	
// PROGRAMA DE SISTEMA DE VERIFICAÇÃO DE NUMEROS PAR OU IMPA
	
package Basic_JAVA_CondicionalStructure;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("---- SISTEMA DE VERIFICAÇÃO DE NUMEROS PAR OU IMPA ----\n");
	System.out.println("Qual numero voce quer verificar?");
	int num = sc.nextInt();

	if(num % 2 == 0 ) {
		System.out.println("PAR");
	}
	else {
		System.out.println("IMPAR");
	}
	
	sc.close();
	
	}
}
