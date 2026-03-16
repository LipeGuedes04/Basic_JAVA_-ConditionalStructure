// FELIPE GUEDES	
// SISTEMA DE VERIFICAÇÃO DO HORARIO DE UMA PARTIDA

package Basic_JAVA_CondicionalStructure;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("---- SISTEMA DE VERIFICAÇÃO DO HORARIO DE UMA PARTIDA ----\n");
		System.out.println("Que horas começou?");
		int horaInicial = sc.nextInt();
		System.out.println("Que horas terminou?");
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
