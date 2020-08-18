import java.util.Scanner;

public class ExercicioEleitor { //aqui é a declaração da classe

    public static void main (String[]args) { //declaração do método principal, que será invocado ao executar a classe
      Scanner sc = new Scanner(System.in); //inicia a variável de leitura dos dados escritos pelo usuário
      System.out.println("Bem vindo Cidadao! Gostaria de Veririficar se voce já pode exercer o direito de voto? S/N");//escrevendo um texto
      String resposta = sc.next(); //pega valor escrito pelo usuário

      String textoExibicao = resposta.equalsIgnoreCase("S") ? "Ok! Iremos comecar!" :
      resposta.equalsIgnoreCase("N") ? "Ok! Ate a proxima." : "Opcao nao Existente!";

      if(resposta.equalsIgnoreCase("S")){ //testa se o valor é igual a "S"
        textoExibicao = "Ok! Iremos comecar!";//executa se a resposta é igual a 'S' 
      } else if(resposta.equalsIgnoreCase("N")){ //testa se o valor é igual a "N"
          textoExibicao = "Ok! Ate a proxima.";//executa se a respota é igual a "N"
      } else { //testa se o valor é difernte de "S" ou "N"
          textoExibicao = "Opcao nao Existente!";//executa caso a resposta for diferente de "S" ou "N"
      }

        System.out.println(textoExibicao); //

        boolean repetir = false; //criando e inicializando a variável

      if(resposta.equalsIgnoreCase ("S")){ //aqui é comparado a resposta do usuário com "S", caso seja igual a "S", continua executando o bloco.
        repetir = true;//aqui repetir recebe verdadeiro.
      } 
      while(repetir){ //inicializando o bloco 'while', se o valor de 'repetir' for verdadeiro "S" ele continua executando o bloco.

      int nascimento;// criando a variável do ano de nascimento do usuário
      int ano = 2020;  // criando e inicializando a variável do Ano Atual
      int idade; //criando a variável de subtracao.
      String nome;

      System.out.println("Informe seu nome: ");
      nome = sc.next();

      System.out.println("Informe seu ano de nascimento");//escrevendo um texto, solicitando o ano de nascimento do usuário.
      nascimento = sc.nextInt();//recolhe a resposta do usuário.

      idade = ano - nascimento; // resultado da subtracao entre ano atual e ano de nascimento do usuário

      if (idade >= 18){ //aqui testo se o resultado da idade do usuário é igual ou maior que 18 (maioridade no Brasil)
        System.out.println("Ola " + nome + " voce tem o DEVER de votar, seu voto e obrigatorio!");//executa se a idade for igual ou maior que 18.
        repetir = false;//usuário já obteve a resposta, não tem necessitade de continuar.

      }else if(idade == 16){ //aqui testo se o resultado da idade do usuário é igual a 16 (idade em que o cidadão já tem o direito de votar).
        System.out.println("Ola " + nome + " voce tem o DIREITO de votar, porem seu voto nao e obrigatorio!");//executa se a idade for igual a 16.
        repetir = false;//usuário já obteve a resposta, não tem necessidade de continuar.

      }else{//aqui testo se der qualquer outro resultado diferente dos citados acima (menor que 16).
        System.out.println("Ola " + nome + " voce ainda nao tem o direito nem o dever de votar!");//executa se a idade for menor que 16.
        repetir = false;//usuário já obteve a resposta, não tem necessidade de continuar. 
      }
      }
      
      sc.close();//fecha o scanner
    }
}