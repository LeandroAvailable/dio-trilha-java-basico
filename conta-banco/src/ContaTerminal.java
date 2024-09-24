import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int Numero;
        String Agencia, nomeCliente;
        double Saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        Agencia = sc.nextLine();

        System.out.println("Agora digite o número da conta:");
        Numero = sc.nextInt();

        System.out.println("Agora digite o seu nome:");
        sc.nextLine();
        nomeCliente = sc.nextLine();

        System.out.println("Agora digite o saldo da conta:");
        Saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente
        + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + Agencia
        + " , conta "
        + Numero
        + " e seu saldo "
        + Saldo
        + " já está disponível para saque.");
    }
}