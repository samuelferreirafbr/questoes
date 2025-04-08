public class ContaBancaria {

    private double saldo;
    
    public ContaBancaria() {
        this.saldo = 0.0;
    }

    // Método de depositar

    public void depositar (double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito feito no valor de R$: " + valor);
        }
    }

    // Método de sacar

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque feito no valor de R$ " + valor);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente!");
        }
    }

    // Método de consultar

    public void consultarSaldo() {
        System.out.println("O saldo atual é: R$ " + saldo);
    }

    // Método para testar

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(150.0);
        conta.consultarSaldo();

        conta.sacar(50.0);
        conta.consultarSaldo();
    }
}
