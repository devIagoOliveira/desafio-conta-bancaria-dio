import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int accountNumber = sc.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencyNumber = sc.next();
        sc.nextLine();

        System.out.println("Por favor, digite o nome do titular da conta:");
        String holder = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double balance = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", holder, agencyNumber, accountNumber, balance);


        sc.close();
    }
}
