package Bank;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		String agencia = "1021";
		String nomeCliente;
		double saldo = 237.48;

		System.out.println("Por Favor digite o numero da agencia (Apenas numeros):");
		numero = sc.nextInt();
		System.out.println("Digite seu nome: ");
		nomeCliente = sc.next();

		System.out.println("Ola " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agencia é "
				+ agencia + ", conta " + numero + " e seu saldo é: " + saldo);
	}
}
