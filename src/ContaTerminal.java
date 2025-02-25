import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá usuário, Digite seu nome por favor.");
        String nomeCliente = scanner.next();
        
        System.out.println("Em seguida, digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite o número da agência");
        String agencia = scanner.next();

        double saldo = 550.10;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" , conta "
                            + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");



    }
}
