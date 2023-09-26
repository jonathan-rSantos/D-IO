package VagaDeEmprego;

import java.util.Scanner;

public class ProcessoSeletivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Processo seletivo");
		double pretencao =	sc.nextDouble();
		Analisarcandidato(pretencao);
	}

	static void Analisarcandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		} else if(salarioBase == salarioPretendido){
				System.out.println("Ligar para o candidato, com contra proposta");
		} else {
			System.out.println("Aguardando resultado dos demais candidatos");
		}
	}
}
