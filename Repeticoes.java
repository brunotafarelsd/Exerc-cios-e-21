import java.util.Scanner;

public class Repeticoes { //aqui é a declaração da classe

    public static void main (String[]args) { //declaração do método principal, que será invocado ao executar a classe
        Scanner sc = new Scanner(System.in); //inicia a variável de leitura dos dados escritos pelo usuário
        System.out.println("Voce Gostaria de acertar minha idade? S/N");//escrevendo um texto
        String resposta = sc.next(); //guardando o valor da respota 

        boolean repetir = false; //criando e inicializando a variável

        if(resposta.equalsIgnoreCase("S")){ //aqui testo se a resposta é igual a "S", caso seja "S" continuar a executar o bloco
            repetir = true;//repetir recebe verdadeiro
        }
        while(repetir) { //inicializando o bloco while, se o valor de 'repetir' for verdadeiro (S) ele continuará execuntado o bloco
            System.out.println("Digite o seu palpite: "); //escrevendo um texto
            int idade = sc.nextInt(); //recolhe a resposta do usuário

            if (idade == 21) { //efetuando o teste de o número é diferente ou igual a 21
                System.out.println("Parabens, voce acertou!");//se o usuário acertou a resposta, o valor dessa variável irá receber 'false'
                repetir = false; //pois o usuário já acertou a idade e não é mais necessário continuar perguntando

            } else{
                System.out.println("Voce errou. "); //escrevendo um texto
                System.out.println("Voce deseja tentar novamente? S/N ");//escrevendo texto
                resposta = sc.next();//recolhe a resposta do usuário
                repetir = resposta.equalsIgnoreCase("S");//se a resposta do usuário for igual a "S", irá repetir o bloco para uma nova tentativa 

            }
        }
        


        sc.close();//fechamento do scanner 

    }
}