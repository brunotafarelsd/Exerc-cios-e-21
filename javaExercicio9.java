import java.util.Scanner;

public class javaExercicio9 {
	

	public static void main(String[] args) {


		String codigoQuestao;
		
		
		Scanner entradaGeral;
		
		entradaGeral = new Scanner(System.in);
		
//		questao1();
//		questao2();
//		questao3();
//		questao4();
//		questao5();
//		questao6();
//		questao7();
//		questao8();

		System.out.println("Q01 - Quest�o 1 - VALOR MAIOR ");
		System.out.println("Q02 - Quest�o 2 - VALOR MENOR ");
		System.out.println("Q03 - Quest�o 3 - �MPAR OU PAR ");
		System.out.println("Q04 - Quest�o 4 - C�DIGO PRODUTO ");
		System.out.println("Q05 - Quest�o 5 - ELEI��O ");
		System.out.println("Q06 - Quest�o 6 - SENHA DE ACESSO ");
		System.out.println("Q07 - Quest�o 7 - COMPRA MA��S ");
		System.out.println("Q08 - Quest�o 8 - VALORES EM ORDEM CRESCENTE  ");
		System.out.println("Informe a Quest�o desejada: ");
		
		codigoQuestao = entradaGeral.nextLine();
		
		switch (codigoQuestao) {
		case "Q01":
			questao1();
			break;
		case "Q02":
			questao2();
			break;
		case "Q03":
			questao3();
			break;
		case "Q04":
			questao4();
			break;
		case "Q05":
			questao5();
			break;
		case "Q06":
			questao6();
			break;
		case "Q07":
			questao7();
			break;
		case "Q08":
			questao8();
			break;
		default:
			System.out.println("C�digo inv�lido!");
			break;
		}
		

		System.exit(0);

	}
	
	public static void questao1() {
		int valorUm;
		int valorDois;

		Scanner entradaDeValor;

		entradaDeValor = new Scanner(System.in);

		System.out.println("Digite o Primeiro Valor!");
		valorUm = entradaDeValor.nextInt();

		System.out.println("Digite o Segundo Valor!");
		valorDois = entradaDeValor.nextInt();

		if (valorUm > valorDois) {
			System.out.println("O maior valor � : " + valorUm);
		} else if (valorUm < valorDois) {
			System.out.println("O maior valor � : " + valorDois);
		} else {
			System.out.println("O valores s�o iguais! ");
		}
	}

	public static void questao2() {

		int valorUm, valorDois, valorTres, valorQuatro;

		Scanner entradaDeValores;

		entradaDeValores = new Scanner(System.in);

		System.out.println("Digite o Primeiro Valor: ");
		valorUm = entradaDeValores.nextInt();

		System.out.println("Digite o Segundo Valor: ");
		valorDois = entradaDeValores.nextInt();

		System.out.println("Digite o Terceiro Valor: ");
		valorTres = entradaDeValores.nextInt();

		System.out.println("Digite o Quarto Valor: ");
		valorQuatro = entradaDeValores.nextInt();

		if ((valorUm < valorDois) && (valorDois <= valorTres) && (valorTres <= valorQuatro)) {
			System.out.println("O menor valor � : " + valorUm);
		} else if ((valorDois < valorUm) && (valorUm <= valorTres) && (valorTres <= valorQuatro)) {
			System.out.println("O menor valor � : " + valorDois);
		} else if ((valorTres < valorUm) && (valorUm <= valorDois) && (valorDois <= valorQuatro)) {
			System.out.println("O menor valor � : " + valorTres);
		} else if ((valorQuatro < valorUm) && (valorUm <= valorDois) && (valorDois <= valorTres)) {
			System.out.println("O menor valor � : " + valorQuatro);
		} else {
			System.out.println("Os valores s�o iguais.");
		}
	}

	public static void questao3() {
		int valorUm;

		Scanner entradaDeValores;

		entradaDeValores = new Scanner(System.in);

		System.out.println("Informe um n�mero e saiba se ele � �MPAR ou PAR!");
		valorUm = entradaDeValores.nextInt();

		if ((valorUm - valorUm / 2 * 2) == 0) {
			System.out.println("O n�mero que voc� informou �: PAR");

		} else {
			System.out.println("O n�mero que voc� informou �: �MPAR");
		}
	}

	public static void questao4() {
		String codProduto;

		Scanner entradaDeValores;

		entradaDeValores = new Scanner(System.in);

		System.out.println("Digite o c�digo do produto desejado!");
		codProduto = entradaDeValores.next();

		if ("001".equals(codProduto)) {
			System.out.println("O produto escolhido foi: ARROZ.");
		} else if ("002".contentEquals(codProduto)) {
			System.out.println("O produto escolhido foi: FEIJ�O.");
		} else if ("003".contentEquals(codProduto)) {
			System.out.println("O produto escolhido foi: FARINHA");
		} else {
			System.out.println("DIVERSOS");
		}
	}

	public static void questao5() {
		
		int anoNascimento;
		int idade;
		int anoAtual = 2020;
		Scanner entradaDeDados;

		entradaDeDados = new Scanner(System.in);

		System.out.println("Saiba se voc� poder� votar este ano.");

		System.out.println("Digite o seu ano de nascimento: ");
		anoNascimento = entradaDeDados.nextInt();

		idade = anoAtual - anoNascimento;

		if (idade >= 70) {
			System.out.println("Seu Voto n�o � Obrigat�rio.");
		} else if (idade >= 18) {
			System.out.println("Seu Voto � orbigat�rio.");
		} else if (idade >= 16) {
			System.out.println("Seu Voto n�o � obrigat�rio.");
		} else {
			System.out.println("Voc� ainda n�o pode Votar.");
		}
	}

	public static void questao6() {
		int senha;

		Scanner entradaDeDados;

		entradaDeDados = new Scanner(System.in);

		System.out.println("Bem vindo Usu�rio, Digite sua senha para ter o acesso.");
		senha = entradaDeDados.nextInt();

		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO!");
		} else {
			System.out.println("ACESSO NEGADO!");
		}
	}

	public static void questao7() {
		
		double precoMaca = 0.30;
		double precoMaca2 = 0.25;
		double valorCompra;
		int quantidadeCompra;
		
		
		Scanner  entradaDeValores;
		
		entradaDeValores = new Scanner(System.in);
		
		System.out.println("Informe quantas ma��s voc� deseja comprar: ");
		quantidadeCompra = entradaDeValores.nextInt();
		
		if (quantidadeCompra >= 12) {
			System.out.println("O valor total da sua compra �: " + "R$ " + (quantidadeCompra * precoMaca2));
		} else {
			System.out.println("O valor total da sua compra �: " + "R$" + (quantidadeCompra * precoMaca));
		}
	}

	public static void questao8() {

		
		
		int valorUm, valorDois, valorTres;
		
		Scanner entradaDeValores;
		
		entradaDeValores = new Scanner(System.in);
		
		System.out.println("Digite 3 valores, para serem colocados em ordem crescente.");
		System.out.println("Digite o primeiro n�mero:  ");
		valorUm = entradaDeValores.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		valorDois = entradaDeValores.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		valorTres = entradaDeValores.nextInt();
		
		if (valorUm < valorDois && valorDois < valorTres) {
			System.out.println(valorUm + "-" + valorDois + "-" + valorTres);
		} else if (valorUm < valorTres && valorTres < valorDois) {
			System.out.println(valorUm + "-" + valorTres + "-" + valorDois);
		} else if (valorDois < valorUm && valorUm < valorTres) {
			System.out.println(valorDois + "-" + valorUm + "-" + valorTres);
		} else if (valorDois < valorTres && valorTres < valorUm) {
			System.out.println(valorDois + "-" + valorTres + "-" + valorUm);
		} else if (valorTres < valorDois && valorDois < valorUm) {
			System.out.println(valorTres + "-" + valorDois + "-" + valorUm);
		} else if (valorTres < valorUm && valorUm < valorDois) {
			System.out.println(valorTres + "-" + valorUm + "-" + valorDois);
		}
	}
}
