public class Conta {

    private int numConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta() {
        this.numConta = 0;
        this.agencia = "";
        this.nomeCliente = "";
        this.saldo = 0.0;
    }

    public Conta(int numConta, String agencia, String nomeCliente, double saldo) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public Conta setNumConta(int numConta) {
        this.numConta = numConta;
        return this;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public Conta setAgencia(String agencia) {
        this.agencia = agencia;
        return this;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public Conta setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        return this;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Conta setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo.");
        }
        this.saldo = saldo;
        return this;
    }

    public void mensagem() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numConta +  " e seu saldo " + this.saldo + " já está disponível para saque.");
    }

}
