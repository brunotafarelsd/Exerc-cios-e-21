import java.util.Scanner;

public class Ternario { //aqui é a declaração da classe

    public static void main (String[]args) { //declaração do método principal, que será invocado ao executar a classe
      Scanner sc = new Scanner(System.in); //inicia a variável de leitura dos dados escritos pelo usuário
      System.out.println("Ola! Tudo bem com voce? S/N");//escrevendo um texto
      String resposta = sc.next(); //pega valor escrito pelo usuário

      String textoExibicao = resposta.equalsIgnoreCase("S") ? "fico feliz por voce!" :
      resposta.equalsIgnoreCase("N") ? "Espero que fique melhor!" : "Voce digitou errado!";

      if(resposta.equalsIgnoreCase("S")){ //testa se o valor é igual a "S"
        textoExibicao = "fico feliz por voce!";//executa se a resposta é igual a 'S' 
      } else if(resposta.equalsIgnoreCase("N")){ //testa se o valor é igual a "N"
          textoExibicao = "Espero que fique melhor!";//executa se a respota é igual a "N"
      } else { //testa se o valor é difernte de "S" ou "N"
          textoExibicao = "Voce digitou errado!";//executa caso a resposta for diferente de "S" ou "N"
      }

      System.out.println(textoExibicao);

      sc.close();//fecha o scanner
    }
}