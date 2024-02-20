package calculator;

import java.util.Scanner;

import numero.Num;

public class Calc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Num n1 = new Num();
		Num n2 = new Num();
		Num res = new Num();
		Num nomeOperacao = new Num();
		String opc = "s";

		while (opc.equalsIgnoreCase("s")) {
			System.out.println("Calculadora Mágica");
			System.out.println("Onde você pode fazer todas operações simples:");

			try {
				System.out.print("Qual é a operação desejada?\nDigite:  ( / ) , ( * ) , ( - ) ou ( + )\n");
				nomeOperacao.setOperacao(scan.next());

				if (!nomeOperacao.getOperacao().matches("[/*+-]")) {
					throw new IllegalArgumentException("Operação inválida!");
				}

				System.out.print("Digite o valor 1: ");
				n1.setValor(scan.nextInt());

				System.out.print("Digite o valor 2: ");
				n2.setValor(scan.nextInt());

				switch (nomeOperacao.getOperacao()) {
				case "/":
					if (n2.getValor() == 0) {
						throw new ArithmeticException("Divisão por zero!");
					}
					res.setValor(n1.getValor() / n2.getValor());
					nomeOperacao.setOperacao("Divisão");
					break;
				case "*":
					res.setValor(n1.getValor() * n2.getValor());
					nomeOperacao.setOperacao("Multiplicação");
					break;
				case "-":
					res.setValor(n1.getValor() - n2.getValor());
					nomeOperacao.setOperacao("Subtração");
					break;
				case "+":
					res.setValor(n1.getValor() + n2.getValor());
					nomeOperacao.setOperacao("Soma");
					break;
				}

				System.out.printf("A %s de %d com %d é igual a %d\n", nomeOperacao.getOperacao(), n1.getValor(),
						n2.getValor(), res.getValor());
			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
			}

			System.out.print("\nDeseja fazer OUTRA operação?\nDigite ( s ) ou ( S ): ");
			opc = scan.next();
			System.out.println();
		}
	}
}
