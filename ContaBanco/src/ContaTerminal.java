import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        
        var scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        var numero = scanner.nextInt();

        System.out.println("Digite o número e digito da agência: ");
        var agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        var nomeCliente = scanner.next();

        System.out.println("Digite o valor a ser depositado: ");
        var saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
