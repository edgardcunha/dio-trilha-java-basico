import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e Importar a classe Scanner
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        // Instanciar a classe Conta
        Conta conta = new Conta();

        // Exibir as mensagem para o nosso usuário e Obter pela classe Scanner os valores no terminal
        System.out.println("Por favor, digite o número da Agência: ");
        conta.setAgencia(scanner.next());

        System.out.println("Por favor, digite o número da Conta: ");
        conta.setNumConta(scanner.nextInt());

        System.out.println("Por favor, digite o nome do Cliente: ");
        conta.setNomeCliente(scanner.next());

        System.out.println("Por favor, digite o saldo da Conta: ");
        conta.setSaldo(scanner.nextDouble());

        // Exibir a mensagem da conta criada
        conta.mensagem();
    }
}
