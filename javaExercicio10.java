import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class javaExercicio10 {

	public static void main(String[] args) {

		String codigoQuestao;

		Scanner entradaGeral;

		entradaGeral = new Scanner(System.in);

		System.out.println("Q01 - Questao 1 - FRUTAS ");
		System.out.println("Q02 - Questao 2 - CARROS ");
		System.out.println("Q03 - Questao 3 - Calculadora");
		System.out.println("Q04 - Questao 4 - ESCOLHA DE PRODUTOS ");
		System.out.println("Q05 - Questao 5 - JOGO DO 21 ");
		System.out.println("Informe a Questao Desejada: ");

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
		default:
			System.out.println("C�digo de Quest�o inv�lido.");
			break;

		}

		System.exit(0);

	}

	public static void questao1() {

		String fruta;

		Scanner entradaDados;

		entradaDados = new Scanner(System.in);

		System.out.println("Por qual Fruta voc� est� procurando? ");
		fruta = entradaDados.nextLine();

		switch (fruta) {
		case "maca":
			System.out.println("Desculpe, n�o vendemos esta fruta aqui! ");
			break;
		case "kiwi":
			System.out.println("Desculpe, Estamos com escassez de kiwis! ");
			break;
		case "melancia":
			System.out.println("Aqui est�, s�o 3 reais o Quilo! ");
			break;

		default:
			System.out.println("N�o trabalhamos com esta fruta, ou isso n�o � uma fruta! '-' ");
			break;
		}

	}

	public static void questao2() {

		String catVeiculo;

		Scanner entradaDados;

		entradaDados = new Scanner(System.in);

		System.out.println("Ol�, Bem vindo! Por qual categoria de carro voc� procura? ");
		catVeiculo = entradaDados.nextLine();

		switch (catVeiculo) {
		case "hatch":
			System.out.println("Parab�ns, compra efetuada com sucesso! ");
			break;
		case "sedans":
			System.out.println("Tem certeza que prefere este modelo? ");
			break;
		case "motocicletas":
			System.out.println("Tem certeza que prefere este modelo? ");
			break;
		case "caminhonetes":
			System.out.println("Tem certeza que prefere este modelo? ");
			break;

		default:
			System.out.println("N�o trabalhamos com este tipo de autom�vel aqui. ");
			break;
		}

	}

	public static void questao3() {

		double n1, n2;
		double soma, subtracao, divisao, multiplicacao;
		String operacao;

		Scanner entradaValores;

		entradaValores = new Scanner(System.in);

		System.out.println("O01 - Opera��o 01 - SOMA");
		System.out.println("O02 - Opera��o 02 - SUBTRACAO");
		System.out.println("O03 - Opera��o 03 - DIVISAO");
		System.out.println("O04 - Opera��o 04 - MULTIPLICACAO");
		System.out.println("Bem vindo! Qual opera��o voc� deseja realizar? ");
		operacao = entradaValores.nextLine();

		switch (operacao) {
		case "O01":
			System.out.println("Digite o primeiro valor: ");
			n1 = entradaValores.nextDouble();
			System.out.println("Digite o segundo valor: ");
			n2 = entradaValores.nextDouble();

			soma = n1 + n2;

			System.out.println("O resultado da soma �: " + soma);
			break;
		case "O02":
			System.out.println("Digite o primeiro valor: ");
			n1 = entradaValores.nextDouble();
			System.out.println("Digite o segundo valor: ");
			n2 = entradaValores.nextDouble();

			subtracao = n1 - n2;
			System.out.println("O resultado da subtracao �: " + subtracao);
			break;
		case "O03":
			System.out.println("Digite o primeiro valor: ");
			n1 = entradaValores.nextDouble();
			System.out.println("Digite o segundo valor: ");
			n2 = entradaValores.nextDouble();

			divisao = n1 / n2;
			System.out.println("O resultado da divisao �: " + divisao);
			break;
		case "O04":
			System.out.println("Digite o primeiro valor: ");
			n1 = entradaValores.nextDouble();
			System.out.println("Digite o segundo valor: ");
			n2 = entradaValores.nextDouble();

			multiplicacao = n1 * n2;

			System.out.println("O resultado da multiplicacao �: " + multiplicacao);
			break;

		default:
			System.out.println("Opera��o escolhida n�o existente!");
			break;
		}

	}

	public static void questao4() {

		String tipoProduto;

		Scanner entradaDados;

		entradaDados = new Scanner(System.in);

		System.out.println("T01 - Tipo 01 - PRODUTOS N�O PEREC�VEIS");
		System.out.println("T02 - Tipo 02 - FRUTAS");
		System.out.println("T03 - Tipo 03 - BEBIDAS");
		System.out.println("Escolha o tipo de produto desejado!");
		tipoProduto = entradaDados.nextLine();

		switch (tipoProduto) {
		case "T01":
			System.out.println("Dentre os produtos N�o-perec�veis temos: " + "Arroz, " + "Feij�o, " + "Caf�, "
					+ "FARINHA, " + "Floc�o(farinha de milho ou CUSCUZ)");
			break;
		case "T02":
			System.out.println("Dentre as Frutas temos: " + "Manga, " + "Ma��, " + "Banana, " + "Morango, "
					+ "Melancia, " + "Kiwi");
			break;
		case "T03":
			System.out.println("Dentre as Bebidas temos: " + "Leite, " + "Sucos Artificias, " + "Sucos Naturais, "
					+ "Sucos Integrais, " + "Refrigerantes," + "Bebidas L�cteas, " + "�gua Mineral ");
			break;
		default:
			System.out.println("N�o temos este tipo de produto.");
			break;
		}

	}
	
	public static void questao5() {
		
		int valorUsuario;
		
		
		Scanner entradaValor;
		
		entradaValor = new Scanner(System.in);
		
		System.out.println("Para iniciar o Jogo do 21, informe um n�mero entra 1 e 20.");
		valorUsuario = entradaValor.nextInt();
		
		int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 22);
		System.out.println("O n�mero �: " + numeroAleatorio);
		
		if (numeroAleatorio >= 15 && numeroAleatorio <= 20) {
			System.out.println("Voc� ganhou 6 pts.");
		} else if (numeroAleatorio >= 8 && numeroAleatorio <= 13) {
			System.out.println("Voc� ganhou 5 pts.");
		} else if (numeroAleatorio >= 1 && numeroAleatorio <= 6) {
			System.out.println("Voc� ganhou apenas 1 pt.");
		}
		
		
		
		switch (numeroAleatorio) {
		case 7:
			System.out.println("Voc� ganhour 10 pts.");
			break;
		case 14:
			System.out.println("Voc� ganhou 20 pts.");
			break;
		case 21:
			System.out.println("Voc� ganhou 30 pts.");
		default:
			break;		
		
	}
		
	}
	}

