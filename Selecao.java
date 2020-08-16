import java.util.Scanner;

public class Selecao { //aqui é a declaração da classe

    public static void main (String[]args) { //declaração do método principal, que será invocado ao executar a classe
        Scanner sc = new Scanner(System.in); //inicia a variável de leitura dos dados que o usuário irá escrever
        System.out.println("Qual o seu gênero? Masculino ou Feminino?");//escrevendo um texto
        String genero = sc.next();//faz a leitura da resposta dada pelo usuário.

        if(genero.equalsIgnoreCase("Masculino")){//teste se o valor do genero é igual a 'Masculino'
            System.out.println("Seja muito Bem Vindo!");//escrevendo texto para 'Masculino'
        } else if(genero.equalsIgnoreCase("Feminino")){ //teste se o valor do genero é igual a 'Feminino'
            System.out.println("Seja muito Bem Vinda!");//escrevendo texto para 'feminino'
        } else{//caso a resposta dada pelo usuário não seja nenhuma das alernativas anteriores
            System.out.println("Seja muito Bem Vindx");//escrevendo texto para 'nenhuma das alternativas'

        }
    }
}