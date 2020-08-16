import java.util.Scanner;

public class Repeticoes2 { //aqui é a declaração da classe

    public static void main (String[]args) { //declaração do método principal, que será invocado ao executar a classe
        Scanner sc = new Scanner(System.in);//inicia a variável de leitura dos dados escritos pelo usuário
        boolean repetir = true; //variável boolean declarada e inicializada com valor "verdadeiro"
        System.out.println("Qual o ano de fundacao de Blumenau?");//escrevendo um texto
        do{//iniciando o bloco "do while"
            System.out.println("Digite o ano de fundacao de Blumenau:");//escrevendo um texto
            int ano = sc.nextInt();//recolhendo a resposta dada pelo usuário

            if(ano != 1850) { //testando se o número dado pelo usuário é igual ou diferente de 1850
                repetir = true; //caso seja diferente de 1850, a variável 'repetir' recebe 'verdadeiro' e executará o bloco novamente
            } else {//caso não seja diferente de 1850, a variável 'repetir' recebe 'falso' e não executará o bloco novamente
                repetir = false;

            }
        }while(repetir); //enquanto o usuário não acertar o número, este bloco continua executando 
        System.out.println("Finalmente voce acertou!");//escrevendo texto


        sc.close();//fechamento do scanner 

    }
}