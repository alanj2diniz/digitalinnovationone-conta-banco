import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System. in);


        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner. nextLine();

        System.out.println("Digite o número da conta");
        numero = Integer.parseInt(scanner. nextLine());
       
        System.out.println("Digite o nome do cliente");
        nomeCliente = scanner. nextLine();

        System.out.println("Por favor, digite o valor a ser depositado");
        saldo = Double.parseDouble(scanner. nextLine());


        String mensagem = "Olá ".concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
        .concat(", conta ").concat(numero+"")
        .concat(", e seu saldo ").concat(saldo+"")
        .concat(" já está disponível para saque");     

        System.out.print(mensagem);

    }
}
