import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a class Scanner
        try (Scanner scanner = new Scanner(System.in)) {

        //Exbibir as mensagens para o nosso usuário
        System.out.print("Por favor, digite o número da Agência: ");
        var agencia = scanner.next();
        System.out.print("Por favor, digite o número da conta: ");
        var conta = scanner.nextInt();
        System.out.print("Por favor, digite o seu nome: ");
        var nome = scanner.next();
        System.out.print("Por favor, digite o saldo: ");
        var saldo = scanner.nextDouble();

        //Obter pela class Scanner os valores digitados no terminal
 
        //Exibir a mensagem da conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, \n e seu saldo R$ %f já está dipoinível para saque.\n", nome, agencia, conta, saldo);
        }
    }
}
