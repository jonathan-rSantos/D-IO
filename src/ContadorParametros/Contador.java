package ContadorParametros;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o 1� par�metro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o 2� par�metro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo par�metro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o n�mero " + i);
        }
    }
 }