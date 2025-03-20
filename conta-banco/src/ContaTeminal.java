import java.util.Scanner;

public class ContaTeminal {
    public static void main(String[] args) throws Exception {   
        
        Scanner scanner = new Scanner( System.in );

        /*Para Fazer:
         Conhecer e importar a classe Scanner
         
         Exibir as mensagens para o nosso usuário

         Obter pela scanner os valores digitados no terminal

         Exibir a mensagem de conta criada
        */
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        Float   saldo;

        System.out.println("Bem Vindo ao Banco DIO");
        System.out.println("Por favor insira o Número da conta: ");
        numeroConta = scanner.nextInt();
        
        System.out.println("Insira o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Insira o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Insira o valor do saldo: ");
        saldo = scanner.nextFloat();

        System.out.println("Seus dados:");
        System.out.println("Nome: "+nomeCliente);
        System.out.println("Número da conta: "+numeroConta);
        System.out.println("Agência: "+agencia);
        System.out.println("Saldo: "+saldo);
        
    }
}
