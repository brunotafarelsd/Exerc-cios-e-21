import java.util.Scanner;

public class Operadores { //aqui é a declaração da classe

    public static void main (String[]args) { //declaração do método principal, que será invocado ao executar a classe
        /* 
        Desenvolver as quatro operações com entrada de dados 
        com 2 numeros
         */

         //aqui foi declarada as variaveis para os numeros e operações
        double numeroUm;
        double numeroDois;
    
        double soma;
        double subtracao;
        double divisao;
        double multiplicacao;

        Scanner sc = new Scanner(System.in); //inicia a variável de leitura dos dados escritos pelo usuário
    
        System.out.println("Digite o primeiro valor");//escrevendo um texto
        numeroUm = sc.nextDouble(); //leitura do valor da resposta 

        System.out.println("Digite o segundo valor");//escrevendo texto
        numeroDois = sc.nextDouble();//leitura do valor da resposta 

        soma = numeroUm + numeroDois;//incializada a varável soma
        subtracao = numeroUm - numeroDois;//inicializada a variável subtração
        divisao = numeroUm / numeroDois;//inicializada a variável divisão 
        multiplicacao = numeroUm * numeroDois;//inicializada a variável multiplicação

        System.out.println("O resultado da soma é : " + soma); //escrevendo um texto juntamento com o resultado da soma
        System.out.println("O resultado da subtracao é : " + subtracao);//escrevendo um texto juntamento com o resultado da subtração
        System.out.println("O resultado da divisao é : " + divisao);//escrevendo um texto juntamento com o resultado da Divisão
        System.out.println("O resultado da multiplicacao é : " + multiplicacao);//escrevendo um texto juntamento com o resultado da Multiplicação


        sc.close();//fechamento do scanner 

    }
}