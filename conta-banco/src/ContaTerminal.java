import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1021;
        String agencia = "MinhaAgencia";
        String nomeCliente = "NomeCliente";
        double saldo = 257.58;

        System.out.println("Por favor, digite seu número:");
        String numeroDigitado = scanner.nextLine();

        System.out.println("Por favor, digite sua agência:");
        String agenciaDigitada = scanner.nextLine();

        System.out.println("Por favor informe seu nome");
        String nomedoCliente = scanner.nextLine();

        if (numeroDigitado.equals("1021")) {
            String mensagemCliente = "Olá " + nomedoCliente + ", obrigado por ter criado uma conta em nosso banco," + " sua agência é " + agenciaDigitada + ", Sua conta " + numeroDigitado + ", seu saldo é R$ " + saldo;
            System.out.println(mensagemCliente);
        } else {
            System.out.println("Número incorreto. Verifique seus dados.");
        }
    }
}
