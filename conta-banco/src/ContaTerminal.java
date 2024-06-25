import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome");
        String NomeCliente = scanner.next();
        
        System.out.println("Digite sua agencia");
        String Agencia = scanner.next();

        System.out.println("Digite o numero da sua conta");
        int Numero = scanner.nextInt();
        
        System.out.println("Digite seu saldo da sua conta");
        double Saldo = scanner.nextDouble();
        
        System.out.println("Ola "+ NomeCliente + ", Obrigado por criar uma conta em nosso Banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
            
        
}