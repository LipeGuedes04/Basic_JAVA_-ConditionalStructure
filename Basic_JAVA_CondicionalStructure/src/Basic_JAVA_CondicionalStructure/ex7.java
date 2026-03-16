// FELIPE GUEDES	
// SISTEMA DE VERIFICAÇÃO DE VALORES NO EIXO CARTESIANO

package Basic_JAVA_CondicionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("---- SISTEMA DE VERIFICAÇÃO DE VALORES NO EIXO CARTESIANO ----");
		System.out.println("!! De o valor dos vetores X e Y abaixo !!\n");
		System.out.println("Qual o valor do vetor X?");
		double valorX = sc.nextDouble();
		System.out.println("Qual o valor do vetor Y?");
		double valorY = sc.nextDouble();
		
		
		if(valorX > 0 && valorY > 0) {	
			System.out.println("Esta no quadrante Q1");
		}
		else if(valorX > 0 && valorY < 0){
			System.out.println("Esta no quadrante Q4");
		}
		else if(valorX < 0 && valorY > 0){
			System.out.println("Esta no quadrante Q2");
		}
		else if(valorX < 0 && valorY < 0){
			System.out.println("Esta no quadrante Q3");
		}
		else {
			System.out.println("Esta na ORIGEM");
		}

		
		sc.close();
		
	
	}

}
