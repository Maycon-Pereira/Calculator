package calculator;

import java.util.Scanner;

import numero.Num;

public class Calc {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Num operacao = new Num();
		Num n1 = new Num();
		Num n2 = new Num();
		Num res = new Num();

		String opc = "s";
		String nomeOperacao = "";

		while (opc.equals("s") || opc.equals("S")) {
			System.out.printf("Calculadora Mágica %nOnde você pode fazer todas operações simples:%n");

			boolean operacaoValida = false;

			while (!operacaoValida) {

				System.out.printf("Qual é a operação desejada?%n");
				System.out.printf("digite:  ( / ) , ( * ) , ( - ) ou ( + )%n");
				operacao.setOperacao(scan.next());

				if (operacao.getOperacao().equals("/") || operacao.getOperacao().equals("*")
						|| operacao.getOperacao().equals("-") || operacao.getOperacao().equals("+")) {
					operacaoValida = true;
					
					System.out.printf("%nDigite o valor 1: ");
					n1.setValor(scan.nextInt());
					System.out.printf("%nDigite o valor 2: ");
					n2.setValor(scan.nextInt());

					if (operacao.getOperacao().equals("/")) {
						res.setValor(n1.getValor() / n2.getValor());
						nomeOperacao = "Divisão";

					} else if (operacao.getOperacao().equals("*")) {
						res.setValor(n1.getValor() * n2.getValor());
						nomeOperacao = "Multiplicação";
						
					} else if (operacao.getOperacao().equals("-")) {
						res.setValor(n1.getValor() - n2.getValor());
						nomeOperacao = "Subtração";
						
					} else if (operacao.getOperacao().equals("+")) {
						res.setValor(n1.getValor() + n2.getValor());
						nomeOperacao = "Soma";
					}
					
					System.out.printf("%nA %s de %d com %d e igual a ( %d ) %n%n", nomeOperacao, n1.getValor(), n2.getValor(), res.getValor());
					System.out.printf("%nDeseja fazer OUTRA operação?%nDigite ( s ) ou ( S )");
					opc = scan.next();
					System.out.printf("%n%n%n");
				} else {
					System.out.println("--------------------------");
					System.out.printf("%nOPERAÇÃO INVÁLIDA!!%n%n");
					System.out.println("--------------------------");
				}
			}

			
			
		}
	}

}
