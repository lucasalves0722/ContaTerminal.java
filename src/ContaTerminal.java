import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Criar conta!");

    System.out.println("Digite seu nome: ");
    String nome = scanner.next();
    
    System.out.println("Digite seu sobrenome: ");
    String sobrenome = scanner.next();

    System.out.println("Digite o número da conta: ");
    int conta = scanner.nextInt();
    
    System.out.println("Digite o número da Agência: ");
    String agencia = scanner.next();

    System.out.println( "Digite o valor do seu primeiro depósito: ");
    double saldo = scanner.nextDouble();

    DecimalFormat df = new DecimalFormat("#0.00");
    String saldoFormatado = df.format(saldo);

    System.out.println("Olá, " + nome + " " + sobrenome + ", " + "obrigado por criar uma conta em nosso banco, sua Agência é" + " " + agencia + ", conta " + conta + " e seu saldo R$ " + saldoFormatado + " já está disponível para saque. ");
    
}
}

