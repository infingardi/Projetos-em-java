import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta !");
        int accountNumber = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencyNumber = scanner.next();

        System.out.println("Por favor, digite o nome do cliente !");
        String clientName = scanner.next();

        System.out.println("Por favor, digite o saldo da conta !");
        Double balance = scanner.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco," +
                        "sua agência é %s," +
                        "conta %d e" +
                        "seu saldo %.2f já está disponível para saque.",
                clientName, agencyNumber, accountNumber, balance
        );
    }
}